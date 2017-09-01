<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="p1.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change status</title>

<style>
body{
	background-image:url("White-Texture-HD-Backgrounds-7.jpg");
}
#header {
   background-image :url("shutterstock_126991940+.jpg");
    text-align:left;
    padding:30px;
    padding-right:px;
    margin-left:167px;
    width:1000px;
    font-family: "Lucida Bright",Georgia,serif;
    
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:300px;
    width:150px;
    float:left;
    
    padding:5px; 
}
#section {
    width:350px;
    float:left;
    padding:10px; 
}
#footer {
    background-color:#87CEEB;
    color:white;
    clear:both;
    margin:200px;
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
.one{
	color:white;
	text-align:center;
	font-family: cursive;
	background-color: #87CEEB;
	height: 30px;
	width: 200px;
	margin-left:620px;
	transition: height,width 2s;
	
}

.one:hover{
	height: 50px;
	width: 250px;
}    
.second:link{

	color:white;
}
.second:link{

	color:white;
}
#nav{
line-height:30px;
background-color: #eeeeee;
height:300px;
width:150px;
float:left;
padding:5px;

}


.four{
	font-weight:bold;
	color:white;
	width:80px;
	height:40px;
}
.circle{
	list-style-type: circle;
}
   
</style>
	
</head>

<body>
<div id="header">

<p  align="left" style="font-size: 50px; margin-left:100px;color:white;">Deal Yatra</p>

</div>
<div id="nav" style="margin: 1ex;">
<h3>Description:</h3>
<p>jodncijbcbhsbchibc</p>
</div>
<div id="section"><br>
<ul class="circle">

</ul>
</div>

<%
	String email=request.getParameter("email");
String name=request.getParameter("name");
String bdate=request.getParameter("bdate");
	HttpSession s=request.getSession();
	s.setAttribute("Email",email);
%>


<div id="menu">
<ul class="circle">
	<li ><a class="four" href="AddHotel.jsp">Add new hotels</a></li>
	
</ul>
</div>
<table align="center" border=2>
<tr><td>Customer Name::</td><td><%= name %></td></tr>
<tr><td>Customer Email::</td><td><%= email %></td></tr>
<tr><td>Booking Date::</td><td><%= bdate %></td></tr>
<form align="center" action="StatusChangeServlet">
	<tr><td>Status::</td><td><input type="radio" name="status" value="confirmed">Confirm<input type="radio" name="status" value="canceled">Cancel</td></tr>
	<input type="submit" value="Change">
</form>
</table>
<div id="footer">

Copyright © SNPS MAKE 2016
</div>


</body>

</html>