package filter;

import java.io.IOException;

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
	
    public FilterAutenticacao() {
    }

	public void destroy() {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest resq=(HttpServletRequest) request;
		String userLogado=(String) resq.getSession().getAttribute("userLogado");
		String urlParaAutenticar=resq.getServletPath();
		
		if(userLogado!=null&&!userLogado.isEmpty() &&
		urlParaAutenticar.equals("/ServletLogin") || urlParaAutenticar.equals("/principal/ServletLogin")){
			chain.doFilter(request, response);
		}
		else {
			RequestDispatcher redirecionar=resq.getRequestDispatcher("/index.jsp?url="+urlParaAutenticar);
			resq.setAttribute("msg","Por favor, realize o login no sistema.");
			redirecionar.forward(resq, response);
			return;
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
