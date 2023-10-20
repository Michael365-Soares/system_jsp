<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Sistema JSP</title>
		<link rel="stylesheet" type="text/css" href="/system_jsp/src/main/webapp/customizacao/pagina_index.css"/>
	</head>
	<body>
	    <h1>Bem-Vindo ao Curso de JSP</h1>
	    <form action="ServletLogin" method="post">
	        <table>
	        
	            <tr>
	               <td><label>Login:</label></td>
	               <td><input type="text" name="login"/></td>
	            </tr>
	           
	             <tr>
	               <td><label>Senha:</label></td>
	               <td><input type="password" name="password"/></td>
	            </tr>
	            
	             <tr>
	               <td><label>Enviar:</label></td>
	               <td><input type="submit" value="Enviar"/></td>
	            </tr>
	            
	        </table>
	        <h4>${msg}</h4>
	    </form>
	    <script type="text/javascript" src="/system_jsp/src/main/webapp/customizacao/index_javaScript.js"></script>
	</body>
</html>