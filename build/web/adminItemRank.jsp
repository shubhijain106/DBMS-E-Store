<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
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


                    <div class="c">
                        <h4>Item List: </h4>
                        <table width="59%" border="2">
                            <tr><td>Row Number</td>
                                <td>Item ID</td>
                                <td>Item Name</td>
                                <td>Rank</td>
                            </tr>

                            <%
                                int i=0;
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection c = DriverManager
                                        .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                Statement st = c.createStatement();
                                ResultSet rs = st.executeQuery("select ITEM_ID, ITEM_NAME from item where ITEM_ID in (select ITEMREV_ID from reviews where STAR5_RATINGS = 1)");
                                while (rs.next()) {
                                    i++;
                            %>
                            <tr><td><%=i%></td>
                                <td><%=   rs.getString("ITEM_ID")%></td>
                                <td><%=   rs.getString("ITEM_NAME")%></td>
                                <td>Excellent Rank * * * * *</td></tr>
                            <%  }
                            %>
                            
                            <%
                                Statement st2 = c.createStatement();
                                ResultSet rs2 = st2.executeQuery("select ITEM_ID, ITEM_NAME from item where ITEM_ID in (select ITEMREV_ID from reviews where STAR4_RATINGS = 1)");
                                while (rs2.next()) {
                                    i++;
                            %>
                            <tr><td><%=i%></td>
                                <td><%=   rs2.getString("ITEM_ID")%></td>
                                <td><%=   rs2.getString("ITEM_NAME")%></td>
                                <td>Good Rank * * * *</td></tr>
                            <%  }
                            %>
                            
                            <%
                                Statement st3 = c.createStatement();
                                ResultSet rs3 = st3.executeQuery("select ITEM_ID, ITEM_NAME from item where ITEM_ID in (select ITEMREV_ID from reviews where STAR3_RATINGS = 1)");
                                while (rs3.next()) {
                                    i++;
                            %>
                            <tr><td><%=i%></td>
                                <td><%=   rs3.getString("ITEM_ID")%></td>
                                <td><%=   rs3.getString("ITEM_NAME")%></td>
                                <td>Average Rank * * *</td></tr>
                            <%  }
                            %>
                            
                            <%
                                Statement st4 = c.createStatement();
                                ResultSet rs4 = st4.executeQuery("select ITEM_ID, ITEM_NAME from item where ITEM_ID in (select ITEMREV_ID from reviews where STAR2_RATINGS = 1)");
                                while (rs4.next()) {
                                    i++;
                            %>
                            <tr><td><%=i%></td>
                                <td><%=   rs4.getString("ITEM_ID")%></td>
                                <td><%=   rs4.getString("ITEM_NAME")%></td>
                                <td>Poor Rank * *</td></tr>
                            <%  }
                            %>
                            
                            <%
                                Statement st5 = c.createStatement();
                                ResultSet rs5 = st5.executeQuery("select ITEM_ID, ITEM_NAME from item where ITEM_ID in (select ITEMREV_ID from reviews where STAR1_RATINGS = 1)");
                                while (rs5.next()) {
                                    i++;
                            %>
                            <tr><td><%=i%></td>
                                <td><%=   rs5.getString("ITEM_ID")%></td>
                                <td><%=   rs5.getString("ITEM_NAME")%></td>
                                <td>Very Poor Rank *</td></tr>
                            <%  }
                                if (c != null) {c.close();}
                            %>
                            
                        </table>
                        <input type="submit" value="Continue Shopping"></input><br></br><br></br>
                    </div>
 <div class="footer">
                        <div class="left_footer"> </div>
                        <div class="center_footer"> 
                            <a href="http://csscreme.com"><img src="csscreme.jpg" alt="csscreme" border="0" /></a><br />
                            <img src="payment.gif" alt="" /> </div>
                        <div class="right_footer"></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end of main_container -->
    </body>
</html>