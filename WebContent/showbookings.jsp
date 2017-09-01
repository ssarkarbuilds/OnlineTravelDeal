<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="p1.*" import="java.util.ArrayList" %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

#header {
   background-image :url("shutterstock_126991940+.jpg");
    text-align:left;
    padding:30px;
    padding-right:px;
    margin-left:167px;
    width:1000px;
    font-family: "Lucida Bright",Georgia,serif;
    border-color: blue;
    border-style: dotted;
    
}
#footer {
    background-color:#87CEEB;
    color:white;
    clear:both;
    margin:170px;
    padding:5px;
    text-align:center;
    
     margin-left:167px;
      margin-right:120px;
    text-align: right;
}
div#menu ul  {
    margin:1ex;padding:0;
    margin-right:100px;
    margin-left:170px;
    background-color: #87CEEB;
    height: 30px;
    border-style: dotted;
    border-color: blue;
    
    
}
div#menu ul li {
    display:inline; margin:10px;	
}

</style>
</head>
<body>
<div id="header">

<p  align="left" style="font-size: 50px; margin-left:100px;color:white;">Deal Yatra</p>

</div>
<div id="menu">
<ul class="circle">
	<li ><a class="four"  href="homepage.html">Home</a></li>
  
  
</ul>
<br>
</div>
<h1 align="center">BOOKINGS TABLE</h1>
<table border="1px">
	<tr><th>DEAL ID</th><th>TITLE</th><th>BOOKING DATE</th><th>CUSTOMER NAME</th><th>CUSTOMER EMAIL</th><th>STATUS</th>
	
	</tr>
		<%
		
		ArrayList<booking> list=(ArrayList<booking>)session.getAttribute("BKLIST");
			
			for(booking b:list)
			{
				%>
				<tr><td><%=b.getDid() %></td><td><%=b.getTitle() %></td><td><%=b.getCustomerName() %></td><td><%=b.getCustomerEmail() %></td>
				<td><%=b.getBookdate() %></td><td><%=b.getStatus() %></td>
				
				
				</tr>
				
				<% 	}	%>
		</table>	
		
		<div id="footer">
Copyright © SNPS MAKE 2016
</div>		

</body>
</html>