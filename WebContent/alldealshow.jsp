<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="p1.*" import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deals</title>
		<style type="text/css">
		
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
    border-color: blue;
    border-style: dotted;
    
}
		table{
		
			
			 
			
			border:none;
			background-image: url("orange.jpg");
			background-color: ;
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
		#seventeen{
			width:200px;
			height:150px;
			transition:3s height,width;
		}
		#seventeen.hover{
			width:220px;
			height:180px;
		}
		#five {
       margin-left:167px;
      margin-right:120px;
    font-family:cursive;
    text-align:center;
    background-color: orange;
    color:white;
    -webkit-animation-name: example; /* Chrome, Safari, Opera */
    -webkit-animation-duration: 4s; /* Chrome, Safari, Opera */
    animation-name: example;
    animation-duration: 10s;
}

/* Chrome, Safari, Opera */
@-webkit-keyframes example {
    0%   {background-color: red;}
    25%  {background-color: yellow;}
    50%  {background-color: blue;}
    100% {background-color: green;}
}

/* Standard syntax */
@keyframes example {
    0%   {background-color: red;}
    25%  {background-color: yellow;}
    50%  {background-color: blue;}
    100% {background-color: green;}
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
.four{
	font-weight:bold;
	font-family:cursive;
	font-size:medium;
	color:white;
	width:80px;
	height:40px;
	text-decoration: none;
	background-color: highlight;
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
  <li ><a class="four" href="">About Us</a></li>
  <li ><a class="four" href="">Contact Details</a></li>
  <li ><a class="four" href="">Customer Executive Login</a></li>
  
</ul>
</div>

<% 
//	String name=(String) session.getAttribute("name");
			ArrayList<Deals> list=(ArrayList<Deals>)session.getAttribute("DLIST"); 
			
			%>
			
			
	<h1 id="five">Available Deals</h1>
	
	<table border="none" >
	<tr><th>Title</th><th>Location</th><th>Description</th><th>Duration</th><th>Number Of Travelers</th><th>Valid From</th>
	<th>Valid Upto</th><th>FOOD COST</th><th>STAY COST</TH><th>TRAVEL COSTS</TH>
	<th>Total Expenditure
	<th>Image</th>
	</tr>
		
			
			
			<%	for(Deals d:list)
			{
				
				%>
				
		
				
				
				
				
							<tr>
							<td><%=d.getTitle() %></td>
							<td><%= d.getLocation()%></td><td><%=d.getDescription()%></td>
							
							<td><%=d.getDuration() %></td><td><%=d.getNumtravel() %></td>
							<td><%=d.getValidf() %></td><td><%=d.getValidt() %></td>
							<td><%= d.getFcost()%></td><td><%= d.getScost()%></td><td><%= d.getTcost()%></td>
							<td><%=d.getTotal() %></td>
							<td id="seventeen" ><img width="200px" height="150px" src="<%=d.getImage() %>"/></td>
							<td><a href="Customer_Login_Servlet?id=<%=d.getDid() %>">Book Now</a></td>
					
							
							</tr>
							
				
				
				
				
		<% 	}	%>
		</table>
	<div id="footer">
Copyright © SNPS MAKE 2016
</div>
</body>
</html>
