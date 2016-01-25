<%@page import="java.util.ArrayList"%>
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
                        <li><a href="home1.jsp" class="nav1"> Home</a></li>
                        <li class="divider"></li>
                        
                        <li><a href="login.jsp" class="nav4">Log In</a></li>
                        <li class="divider"></li>
                        
                        <li><a href="LogoutServlet" class="nav4">Logout</a></li>
                        <li class="divider"></li>

                    </ul>

                    <form>
                        <table cellpadding="5" cellspacing="10" align="left">
                            <tr><td><h3>Add Category</h3></td></tr>
                            <tr><td>Category Name</td><td><input id="IName" name="IName" value="" type="text" placeholder="     "></input></td></tr>
                            <tr><td colspan ="2" align="left"><input type="submit" value="Add Category" onclick="addcat()"/></input></td></tr>
                            <tr><td><h3><a href="adminprofile.jsp">Back To Admin Profile</a></h3></td></tr>
                            <script type="text/javascript">
                                function addcat() {
                                <%
                                    PrintWriter out1 = response.getWriter();
                                    String catName = request.getParameter("IName");
                                    if (catName != null) {
                                        Class.forName("oracle.jdbc.driver.OracleDriver");
                                        Connection c = DriverManager
                                                .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                        Statement st = c.createStatement();
                                        String query = "select MAX(CAST(SUBSTR(C_ID, 4) AS INT)) as currentcat from Category";

                                        ResultSet rs = st.executeQuery(query);
                                        int i = 0;
                                        while (rs.next()) {
                                            i = rs.getInt("currentcat");
                                        }
                                        int newid = i + 1;
                                        String catID = "cID" + newid;

                                        Statement st2 = c.createStatement();
                                        String query2 = "INSERT INTO Category (C_ID, CNAME) VALUES ('" + catID + "','" + catName + "')";

                                        ResultSet rs2 = st2.executeQuery(query2);

                                        if (c != null) {
                                            c.close();
                                        }
                                    }
                                %>
                                }
                            </script>
                        </table>
                    </form>

                    <div class="footer">
                        <div class="left_footer">  </div>
                        <div class="center_footer">
                            <a href="http://csscreme.com"><img src="csscreme.jpg" alt="csscreme" border="0" /></a><br />
                            <img src="payment.gif" alt="" /> </div></div>
                    </div>
                </div>
                <!-- end of main_container -->
                </body>
                </html>