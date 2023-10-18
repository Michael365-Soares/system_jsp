<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Sistema JSP</title>
	</head>
	<body>
	    <h1>Bem-Vindo ao Curso de JSP</h1>
	    <form action="ServletLogin" method="get">
	        <table>
	        
	            <tr>
	               <td><label>Nome:</label></td>
	               <td><input type="text" name="nome"/></td>
	            </tr>
	           
	             <tr>
	               <td><label>Idade:</label></td>
	               <td><input type="number" name="idade"/></td>
	            </tr>
	            
	             <tr>
	               <td><label>Enviar:</label></td>
	               <td><input type="submit" value="Enviar"/></td>
	            </tr>
	            
	        </table>
	    </form>
	    
	</body>
</html>