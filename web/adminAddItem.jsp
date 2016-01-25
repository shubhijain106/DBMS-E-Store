<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
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
                <div id="logo"> <a href="#"><img src="ELECTRONICS_LOGO_1.gif"alt="" border="0" width="237" height="140" /></a> </div>
                <!-- end of oferte_content-->
            </div>
            
            <div id="main_content">
                <div id="menu_tab">
                    <div class="left_menu_corner"></div>
                    <ul class="menu">
                        <li><a href="home.jsp" class="nav1"> Home</a></li>
                        <li class="divider"></li>
                       
                        <li><a href="login.jsp" class="nav4">Log In</a></li>
                        <li class="divider"></li>
                        <li><a href="LogoutServlet" class="nav5">Logout</a></li>
                        <li class="divider"></li>
                       

                    </ul>

                    <form>
                        <table cellpadding="5" cellspacing="10" align="left">
                            <tr><td><h2>Add Item</h3></td></tr>
                            <tr><td>Item Name:</td><td><input id="IName" name="IName" value="" type="text" placeholder="    "></input></td></tr>
                            <tr><td>Item Price:</td><td><input id="Iprice" name="Iprice" value="" type="text" placeholder="    "></input></td></tr>
                            <tr><td>Item Image URL:</td><td><input id="Iimage" name="Iimage" value="" type="text" placeholder="    "></input></td></tr>

                            <tr>
                                <td>
                                    <select name="categoryList">
                                        <%
                                            Class.forName("oracle.jdbc.driver.OracleDriver");
                                            Connection c2 = DriverManager
                                                    .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                            Statement st2 = c2.createStatement();
                                            String query2 = "select MAX(CAST(SUBSTR(Item_ID, 4) AS INT)) as currentitem from item";
                                            ResultSet rs2 = st2.executeQuery(query2);
                                            int i = 0;
                                            while (rs2.next()) {
                                                i = rs2.getInt("currentitem");
                                            }
                                            int newid = i + 1;
                                            String iTID = "iID" + newid;
                                            if (c2 != null) {
                                                c2.close();
                                            }

                                            Class.forName("oracle.jdbc.driver.OracleDriver");
                                            Connection c = DriverManager
                                                    .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                            Statement st = c.createStatement();
                                            String query = "select C_ID || '-' || CNAME As Namex from Category";
                                            ResultSet rs = st.executeQuery(query);
                                            while (rs.next()) {
                                        %>
                                        <option value="<%=rs.getString("Namex")%>"><%=rs.getString("Namex")%></option>
                                        <%}

                                            if (c != null) {
                                                c.close();
                                            }
                                        %>

                                    </select>
                                </td>
                            </tr>
                            <tr><td>Item Manufacture</td><td><input id="IMan" name="IMan" value="" type="text" placeholder="    "></input></td></tr>
                            <tr><td>Item Description</td><td><input id="IDes" name="IDes" value="" type="text" cols="50" rows="10"></input></td></tr>
                            <tr><td colspan ="2" align="left"><input type="submit" value="Add Item" onclick="additm()"/></input></td></tr>
                            <tr><td><h3><a href="adminprofile.jsp">Back To Admin Profile</a></h3></td></tr>
                            <script type="text/javascript">
                                function additm() {



                                <%
                                    PrintWriter out1 = response.getWriter();
                                    try {
                                        String IName = request.getParameter("IName");
                                        String Iprice = request.getParameter("Iprice");
                                        String Iimage = request.getParameter("Iimage");
                                        String ICatprev = request.getParameter("categoryList");
                                        String[] parts = ICatprev.split("-");
                                        String ICat = parts[0];
                                        String IMan = request.getParameter("IMan");
                                        String IDes = request.getParameter("IDes");
                                        Calendar cal = Calendar.getInstance();
                                        String datecal = cal.get(Calendar.DAY_OF_MONTH) + "-jan-" + cal.get(Calendar.YEAR);

                                        String query4 = "INSERT INTO item (Item_Name,Price,Description,Item_Manufacturer,ItemPicture,Quantity_ordered,Quantity_left,Last_reorder_date,Item_ID,Cat_ID) "
                                                + "VALUES ('" + IName + "'," + Iprice + ",'" + IDes + "','" + IMan + "','" + Iimage + "'," + 0 + "," + 0 + ",'" + datecal + "','" + iTID + "','" + ICat + "')";

                                        //out1.println(query4);
                                        Connection c3 = DriverManager
                                                .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                        Statement st3 = c3.createStatement();
                                        ResultSet rs3 = st3.executeQuery(query4);
                                        if (c3 != null) {
                                            c3.close();
                                        }

                                        out1.println("item inserted");
                                    } catch (Exception exc) {

                                        out1.println("Error detected");
                                    }


                                %>


                                }
                            </script>
                        </table>
                    </form>

                    <div class="footer">
                        <div class="left_footer"> </div>
                        <div class="center_footer"> 
                            <a href="http://csscreme.com"><img src="csscreme.jpg" alt="csscreme" border="0" /></a><br />
                            <img src="payment.gif" alt="" /> </div>
                        <div class="right_footer"> </div>
                    </div>
                </div>
                <!-- end of main_container -->
                </body>
                </html>