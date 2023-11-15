package filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import connection.ConnectionFactory;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns= {"/principal/*"})
public class FilterAutenticacao implements Filter {
	
	private static Connection connection;
	
    public FilterAutenticacao() {
    }

	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException{
		try {
			try {
				
					HttpServletRequest resq=(HttpServletRequest) request;
					String userLogado=(String) resq.getSession().getAttribute("userLogado");
					String urlParaAutenticar=resq.getServletPath();
					
					if(userLogado!=null&&!userLogado.isEmpty() &&
					urlParaAutenticar.equals("/ServletLogin") || urlParaAutenticar.equals("/principal/ServletLogin")){
						chain.doFilter(request, response);
					}else {
						RequestDispatcher redirecionar=resq.getRequestDispatcher("/index.jsp?url="+urlParaAutenticar);
						resq.setAttribute("msg","Por favor, realize o login no sistema.");
						redirecionar.forward(resq, response);
						return;
					}
					
					try {
						connection.commit();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				
			    } catch (Exception e) {
				
					e.printStackTrace();
					
					try {
						connection.rollback();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
			}
		}catch(Exception e) {
			e.printStackTrace();
			RequestDispatcher redirecionar=request.getRequestDispatcher("/error.jsp");
			request.setAttribute("msg",e.getMessage());
			redirecionar.forward(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		connection=ConnectionFactory.getConnection();
	}

}
