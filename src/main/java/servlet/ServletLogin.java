package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

@WebServlet(urlPatterns={"/principal/ServletLogin","/ServletLogin"})
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLogin() {
    }

    /*Recebe dados enviados de uma requisição HTTP do tipo GET*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
     
	/*Recebe dados enviados de um formulário pelo método HTTP do tipo POST*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		String url=request.getParameter("url");
		ModelLogin modelLogin=new ModelLogin();
		
		if(login!=null&&!login.isEmpty()&&password!=null&&!password.isEmpty()) {
			
	        modelLogin.setLogin(login);
	        modelLogin.setPassword(password);
			
			if(modelLogin.getLogin().equals("admim")&&modelLogin.getPassword().equals("admim")) {
				
				if(url==null||url.equals("null")) {
					url="principal/principal.jsp";
				}
				
				request.getSession().setAttribute("userLogado",modelLogin.getLogin());
				RequestDispatcher dispatcher=request.getRequestDispatcher(url);
				dispatcher.forward(request, response);
				
			}else {
				
				RequestDispatcher redirecionar=request.getRequestDispatcher("/index.jsp");
				request.setAttribute("msg","Login ou senha foram informados incorretamente...");
				redirecionar.forward(request, response);
				
			}
			
		}else {
			
			RequestDispatcher redirecionar=request.getRequestDispatcher("/index.jsp");
			request.setAttribute("msg","Por favor, informe login e senha!");
			redirecionar.forward(request, response);
			
		}	
		
	}

}
