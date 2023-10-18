package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/ServletLogin"})
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLogin() {
    }

    /*Recebe dados enviados de uma requisição HTTP do tipo GET*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome=request.getParameter("nome");
		String idade=request.getParameter("idade");
		request.setAttribute("nome",nome);
		request.setAttribute("idade",idade);
		RequestDispatcher dispatcher=request.getRequestDispatcher("teste.jsp");
		dispatcher.forward(request, response);
	}
     
	/*Recebe dados enviados de um formulário pelo método HTTP do tipo POST*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
