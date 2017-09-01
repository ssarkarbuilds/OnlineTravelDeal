<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" import="java.util.Random" import="p1.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Step Two</title>
</head>
<body>
	<%
		Mdeals hotel=(Mdeals)session.getAttribute("HLIST");
		String s=(String)session.getAttribute("sid");
		int sid=Integer.parseInt(s);
		Random r = new Random();
	%>
	
	<form action="FormDataServlet" method="post">
			DEAL TITLE: <input type="text" name="title"/><br>
			<input type="hidden" name="did" value="<%=r.nextInt()%>"/>
			 <input type="hidden" name="location" value="<%=hotel.getLocation() %>"/>
			<input name="validf" type="hidden" value="<%=hotel.getValidf() %>"><input type="hidden" name="validt" value="<%=hotel.getValidt() %>">
			<input type="hidden" name="scost" value="<%=hotel.getPrice() %>"/>
			<input type="hidden" name="mmid" value="<%=hotel.getMmid() %>"/>
			<input type="hidden" name="sid" value="<%=sid %>"/>
			
			
			DESCRIPTION: <input type="text" name="des"/><br>
			
			FOOD COST: <input type="text" name="fcost"/> <br>TRAVEL COST: <input type="text" name="tcost"/><br>
			DURATION OF STAY: <input type="text" name="duration"/><br>
			UPLOAD IMAGE HERE: <input name="image" type="text"/><br>
			
			<input type="submit" value="CONFIRM">
			
	</form>
</body>
</html>