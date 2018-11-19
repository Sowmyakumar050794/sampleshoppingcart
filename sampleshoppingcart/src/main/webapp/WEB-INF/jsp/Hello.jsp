<%@page import="java.util.List"%>

<%@page import="com.teamsankya.sampleshoppingcart.dto.ProductsBean"%>
<%@ page contentType="text/html; charset = UTF-8"%>
<html>
<head>
<title>Hello World</title>
<style>

* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Times New Roman, Helvetica, sans-serif;
	/* background-image: url("imagebg.jpg"); */
	background-color: blue; 
}
.topnav {
	overflow: hidden;
	background-color: #333/* #e9e9e9 */;
}

.topnav a {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd ;
	color: black;
}

.topnav a.active {
	background-color:#4CAF50/*  #2196F3 */;
	color: white;
}
.column {
	float: left;
	width: 33.33%;
	padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
	content: "";
	clear: both;
	display: table;
}

.pagination {
	display: inline-block;
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
	font-size: 12px;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}
.pagination
 
a
:hover
:not
 
(
.active
 
)
{
background-color
:
 
#ddd
;


}
</style>
</head>

<body >
<!-- <div class="bg"> -->
		<div class="topnav">
			<a class="active" href="/sampleshoppingcart/index.jsp">Home</a> 
			<a href="#about">About</a> <a
				href="#contact">Contact</a></div>
	<%-- <h2>${productdetail}</h2> --%>


	<%
		List<ProductsBean> beans = (List<ProductsBean>) request.getAttribute("productsbean");
	%>
	<div class="row">
		<%
			for (ProductsBean bean : beans) {
		%>
		<div class="column">
			<tr><img src="product1.jpg"/>
				Id:<%=bean.getId()%><br> Name:<%=bean.getName()%><br>
				
				Price:<%=bean.getPrice()%>
			</tr>
		</div>

		<%
			}
		%>
	</div>
	<footer>
		<div class="pagination">
			<a href="#">&laquo;</a> <a href="./1?category=pen" class="active">1</a> <a
				href="./2?category=pen">2</a> <a href="./3?category=pen">3</a> 
				<a href="#">&raquo;</a> <br>
			
		</div>
	</footer>
</body>
</html>