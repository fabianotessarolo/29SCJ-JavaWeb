<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina JSP</title>
</head>
<body>

<%@include file="cabecalho.jsp" %>

	<h1>Minha primeira pagina JSP</h1>
		
		
	<table>
		 <tr>
   	 		<th>A</th>
    		<th>B</th> 
  </tr>
		
	<%
	int fat = 1;
	int valor = 10; //ou qualquer outro valor que queira calcular;
	for( int i = 1; i <= valor; i++ )
	{ 
	     fat *= i;
	%>
	
	
	
  
	
	
	<tr>
		<td><%=i%></td>
		<td><%=fat%></td>
	</tr>

	
	<%   
	}
	%>
	
	</table>
	
	<%@include file="rodape.jsp" %>
	
</body>
</html>