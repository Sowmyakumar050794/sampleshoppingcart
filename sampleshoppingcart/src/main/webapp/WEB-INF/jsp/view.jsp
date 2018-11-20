<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.teamsankya.sampleshoppingcart.*" %>  
<%  
String spageid=request.getParameter("page");  
int pageid=Integer.parseInt(spageid);  
int total=5;  
if(pageid==1){}  
else{  
    pageid=pageid-1;  
    pageid=pageid*total+1;  
}  
 /* List<ProductsBean> list=ProductsDAO.getRecords(pageid,total);  
  
out.print("<h1>Page No: "+spageid+"</h1>");  
out.print("<table border='1' cellpadding='4' width='60%'>");  
out.print("<tr><th>Id</th><th>Name</th><th>Price</th>");  
for(ProductsBean pb:list){  
    out.print("<tr><td>"+pb.getId()+"</td><td>"+pb.getName()+"</td><td>"
	+pb.getPrice()+"</td></tr>");  
}  
out.print("</table>");   */
%>   
<a href="view.jsp?page=1">1</a>  
<a href="view.jsp?page=2">2</a>  
<a href="view.jsp?page=3">3</a>  


<footer>
		<div class="pagination">
			<a href="#">&laquo;</a> <a href="./1?category=pen" class="active">1</a> <a
				href="./2?category=pen">2</a> <a href="./3?category=pen">3</a> 
				<a href="#">&raquo;</a> <br>
			
		</div>
	</footer>