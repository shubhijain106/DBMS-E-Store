<%-- 
    Document   : adminorderRedir
    Created on : Apr 19, 2015, 8:56:31 PM
    Author     : cebdevelopment
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>PRODUCT ORDERING</h1>



        




        <div class="c">
           
            <%
                
                String username = request.getParameter("Id");
                out.println("Item to be ordered:"+username);
                %>
            <form action="adminordering.jsp" method="get" >
                Enter item id to be ordered:<input type="text" name="itemid"/></br>
               Number of Items to be Ordered:<input type="text" name="order"/>
               <input type="submit" value="Update"/>
            </form>
        </div>



    </body>
</html>
