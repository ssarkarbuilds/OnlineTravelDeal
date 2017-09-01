<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="p1.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer's Home</title>

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
<p>Online Travel Website</p>
</div>


<div id="section"><br>
<h1></h1>

</div>

<%
	
	HttpSession s=request.getSession();
	Deals da=(Deals)s.getAttribute("Deal");
	Object ob=s.getAttribute("name1");
	String name=(String) ob;
	String email=(String) s.getAttribute("email1");
	
%>


<div id="menu">
<ul class="circle">
	<li style="text-align: center">Welcome <%=name %></li>
  
</ul>
<br>
</div>
<table align="center">
	<tr><td>Deal Id:</td><td><%= da.getDid() %></td></tr>
	<tr><td>Title:</td><td><%= da.getTitle() %></td></tr>
	<tr><td>Valid From:</td><td><%= da.getValidf() %></td></tr>
	<tr><td>Valid To:</td><td><%= da.getValidt() %></td></tr>
	<tr><td>Food Cost Per Person:</td><td><%= da.getFcost() %></td></tr>
	<tr><td>Lodge Cost Per Day:</td><td><%= da.getScost() %></td></tr>
	<tr><td>Travel Cost Person:</td><td><%= da.getTcost() %></td></tr>
	
	<tr><td>Merchant Email:</td><td><%= da.getMmid() %></td></tr>
	<form align="center" action="bookdealservlet" method="post">
	<tr><td>Duration::</td><td><input type="text" name="du"></td></tr>
	<tr><td>Date of Booking::</td><td><input type="text" name="da"></td></tr>
	<tr><td>No of person::</td><td><input type="text" name="no"></td></tr>
	<tr><td>Do you want food?:</td><td><select name="food"><option value="yes">Yes</option><option value="no">No</option></select></td></tr>
	<input type="submit" value="Proceed">
	
	</form>
</table>

<div id="footer">

Copyright © SNPS MAKE 2016
</div>


</body>

</html>