<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="p1.*" import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>

		<%
		String name=(String)session.getAttribute("name");
		%>
		
		<h3>Logged in as:<%=name %></h3>
		
		<table border="1px">
	<tr><th>Customer Name</th><th>EMAIL</th><th>BOOKING DATE</th><th>STATUS</th>
	
	</tr>
		<%
		
		ArrayList<booking> list=(ArrayList<booking>)session.getAttribute("BLIST");
			
			for(booking b:list)
			{
				%>
				<tr><td><%=b.getCustomerName() %></td><td><%=b.getCustomerEmail() %></td>
				<td><%=b.getBookdate() %></td><td><%=b.getStatus() %><td>
				
				
				</tr>
				
				<% 	}	%>
		</table>	
				
		

</body>
</html>