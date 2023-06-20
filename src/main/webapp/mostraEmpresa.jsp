<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Editar empresa: ${empresa.nome}
	
	<form action="/gerenciador/alteraEmpresa" method="post">
		Nome: <input type="text" name="nome" value="${empresa.nome}" />
		<input type="hidden" name="id" value="${empresa.id}" /> 
		<input type="submit" />
	</form> 

</body>
</html>