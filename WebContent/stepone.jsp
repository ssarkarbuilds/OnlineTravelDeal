<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="p1.*" import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Step One</title>
</head>
<body>


	<%
	// String name=(String) session.getAttribute("name");  
	%>
	
	
	<%	ArrayList<Mdeals> list=(ArrayList<Mdeals>)session.getAttribute("HLIST"); 
		String sid=(String)session.getAttribute("sid");
	%>
	
	Success
	<form action="http://localhost:8080/OnlineTravelWAR/SelecthotdetailsServlet" method="get">	 
	Select Hotel:<br>
	<select name="hotel">
		<%	
	
		for(Mdeals m:list)
			{
				
				%>
	<option value="<%=m.getLocation() %>"><%=m.getLocation() %></option>

		<% 
			}	
		%>
</select><br>
		
	<input type="hidden" name="sid" value="<%=sid %>">

	<input type="submit" value="GO!">

</form>	
</body>
</html>