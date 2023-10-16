<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receber Nome</title>
</head>
<body>
       <%
          String nome=request.getParameter("nome");
          String idade=request.getParameter("idade");
          out.println("<h1>"+"Olá "+nome+", Você têm "+idade+" anos!</h1");
       %>
</body>
</html>