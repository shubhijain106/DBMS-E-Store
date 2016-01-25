<%@page import="java.sql.SQLException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>DBMS Store</title>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
        <link rel="stylesheet" type="text/css" href="style.css" />
        <!--[if IE 6]>
        <link rel="stylesheet" type="text/css" href="iecss.css" />
        <![endif]-->
        <script type="text/javascript" src="js/boxOver.js"></script>
        <style>
            .first{margin-top: 20px;}
            .serv {margin-top: 50px; margin-left: 80px;}
            .initials{margin-left: 490px; margin-top: 70px;}
            .buttons{margin-left: 490px; margin-top: 100px;}
        </style>
    </head>
    <body>
        <div id="main_container">
            <div id="header">
                <div id="logo"> <a href="#"><img src="ELECTRONICS_LOGO_1.gif" alt="" border="0" width="237" height="140" /></a> </div>
                <!-- end of oferte_content-->
            </div>

            <div id="main_content">
                <div id="menu_tab">
                    <div class="left_menu_corner"></div>
                    <ul class="menu">
                        <li><a href="home.jsp" class="nav1"> Home</a></li>
                        <li class="divider"></li>
                         <li><a href="adminprofile.jsp" class="nav3">Profile</a></li>
                        <li class="divider"></li>
                        <li><a href="LogoutServlet" class="nav3">Logout</a></li>
                        <li class="divider"></li>
                      
                    </ul>
                </div>
            </div>

            <div class="first" align="center">
                <h1>My Profile</h1>
            </div>

            <div class="serv">
                <table align="left">
                    <tr><td><h1>Admin Account</h3></td></tr>
                    <tr><td><h2>Administrative Options</h3></td></tr>
                    <tr><td><h3><a href="adminAddCat.jsp">Add new Category</a></h3></td></tr>
                    <tr><td><h3><a href="adminAddItem.jsp">Add new Item</a></h3></td></tr>
                    <tr><td><h3><a href="adminItemHistory.jsp">View item history</a></h3></td></tr>
                    <tr><td><h3><a href="adminItemList.jsp">View item list</a></h3></td></tr>
                    <tr><td><h3><a href="adminOrderProduct.jsp">Order Products</a></h3></td></tr>
                    <tr><td><h3><a href="adminUserList.jsp">View User list</a></h3></td></tr>
                    <tr><td><h3><a href="adminUserHistory.jsp">View User history</a></h3></td></tr>
                    <tr><td><h3><a href="adminUserRankPurchases.jsp">View User Rank for Purchases</a></h3></td></tr>
                    <tr><td><h3><a href="adminItemManufacture.jsp">View Item Manufacture</a></h3></td></tr>
                    <tr><td><h3><a href="adminItemRank.jsp">View Item Rank</a></h3></td></tr>
                    <tr><td><h3></h3></td></tr>
                    <%
                        String name = "";
                        PrintWriter out12 = response.getWriter();
                        try {

                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            Connection c = DriverManager
                                    .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");

                            Statement st = c.createStatement();

                            ResultSet rs = st.executeQuery("SELECT SUM(MAX1) as max12 FROM (SELECT COUNT(*) AS MAX1 FROM CUSTOMER UNION SELECT COUNT(*) AS MAX1 FROM WISHLIST UNION SELECT COUNT(*) AS MAX1 FROM REVIEWS UNION SELECT COUNT(*) AS MAX1 FROM CART UNION SELECT COUNT(*) AS MAX1 FROM HISTORY UNION SELECT COUNT(*) AS MAX1 FROM ITEM UNION SELECT COUNT(*) AS MAX1 FROM CATEGORY)");
                            
                            while (rs.next()) {
                                name = "We have total of "+rs.getString("max12")+" entries for 6 database Tables";
                            }
                            c.close();

                        } catch (SQLException e) {
                            out.println("SQL Exception " + e.getMessage());
                            e.printStackTrace();
                        }
                    %>
                
                    <tr><td><h3><%=name%></h3></td></tr>    
                </table>
            </div>


            <div class="buttons">
                <form action="home.jsp">    
                    <input type="submit" value="Continue Shopping"/>
                </form>

               
            </div>


           <div class="footer">
                        <div class="left_footer">  </div>
                        <div class="center_footer"> 
                            <a href="http://csscreme.com"><img src="csscreme.jpg" alt="csscreme" border="0" /></a><br />
                            <img src="payment.gif" alt="" /> </div>
                        <div class="right_footer"> </div>
                    </div>
        </div>
        <!-- end of main_container -->
    </body>
</html>
