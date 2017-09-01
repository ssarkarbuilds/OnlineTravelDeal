<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="p1.*" import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deals</title>
</head>
<body>

<% 
	String name=(String) session.getAttribute("name");
			ArrayList<Deals> list=(ArrayList<Deals>)session.getAttribute("DLIST"); %>
			
			<h3>Logged In as: <%=name %></h3>
	<h1>Available Deals</h1>
	
	<table border="1px">
	<tr><th>ID</th><th>Title</th><th>Location</th><th>Duration</th><th>Number Of Travelers</th><th>Valid From</th>
	
	<th>Valid Upto</th><th>Total Expenditure</th><th>Sales ID</th><th>Merchant ID</th>
	<th>Image</th><th>Number of Buys</th>
	</tr>
		
			
			
			<%	for(Deals d:list)
			{
				%>
				
		
				
				
				
				
							<tr>
							<td><%=d.getDid() %></td><td><%=d.getTitle() %></td>
							<td><%= d.getLocation()%></td>
							<td><%=d.getDuration() %></td><td><%=d.getNumtravel() %></td>
							<td><%=d.getValidf() %></td><td><%=d.getValidt() %></td>
							<td><%=d.getTotal() %></td><td><%=d.getSid() %></td>
							<td><%=d.getMmid() %></td>
							<td><img height="150px" width="200px" src="<%=d.getImage() %>"/></td>
							<td><%=d.getNumbuy() %></td>
	<td><a href="http://localhost:8080/OnlineTravelWAR/BookingServlet?id=<%=d.getDid()%>&name=<%=name%>">LIST</a>
							</td>
							</tr>
				
				
				
				
		<% 	}	%>
		</table>
</body>
</html>
