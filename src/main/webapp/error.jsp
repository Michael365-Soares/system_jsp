<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Página de error</title>
	</head>
	
	<body>
	      <h1>Ocorreu a falha com a descrição de error:</h1>
	      <%
	        out.println(request.getAttribute("msg"));
	      %>
	</body>
	 
</html>