<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Sistema JSP</title>
		<!-- Bootstrap CSS -->
		<link href="webapp/customizacoes/pag_index.css" rel="stylesheet">
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	    
	    <style type="text/css">
	        form{
	           position:absolute;
	           top:35%;
	           left:20%;
	           rigth:
            }
            
            h1{
	           position:absolute;
	           top:20%;
	           left:20%;
	           rigth:
            }
            
	    </style>    
	     
	</head>
	
	<body>
	    
	    <h1>Bem-Vindo ao Curso de JSP</h1>
	    <form action="ServletLogin" method="post" class="row g-3 needs-validation" >
	    <input type="hidden" value="<%=request.getParameter("url")%>" name="url"/>
	        
	               <div class="col-md-6">
		               <label class="form-label">Login:</label>
		               <input type="text" name="login" class="form-control" required="required"/>
		           </div>
		           
		            <div class="col-md-6">
		               <label class="form-label">Senha:</label>
		               <input type="password" name="password" class="form-control" required="required"/>
		            </div>
		            
		            <input type="submit" class="btn btn-primary" value="Acessar"></input>
	                
	        <h4>${msg}</h4>
	    </form>
	    
	    <!-- Option 1: Bootstrap Bundle with Popper -->
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
	    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
	    </script>
	    
	</body>
</html>