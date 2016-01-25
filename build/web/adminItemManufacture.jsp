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
                        <li><a href="home.jsp" class="nav1"> Home</a></li>
                        <li class="divider"></li>
                        
                        <li><a href="adminprofile.jsp" class="nav3">Profile</a></li>
                        <li class="divider"></li>
                        <li><a href="LogoutServlet" class="nav3">Logout</a></li>
                        <li class="divider"></li>

                    </ul>


                    <div class="c">
                        <h4>Top 10 manufacturer in terms of number of purchased items</h4>
                        <table width="59%" border="2">
                            <tr><td>Row Number</td>
                                <td>Manufacturer</td>
                                <td>Item ID</td>
                                <td>Item Name</td>
                                <td>Number of Items</td>
                            </tr>
                            <%
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection c2 = DriverManager
                                        .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");

                                Statement stx = c2.createStatement();
                                int ix = 0;
                                ArrayList<String> MAN = new ArrayList<String>();
                                ArrayList<String> nitem = new ArrayList<String>();

                                String queryx = "select ITEM_MANUFACTURER, ITEM_ID, ITEM_NAME, numberItems from item,(select ITEMHT_ID, count(*) as numberItems from history group by ITEMHT_ID order by numberItems DESC)  where ITEMHT_ID = ITEM_ID and rownum <= 10";
                                ResultSet rsx = stx.executeQuery(queryx);
                                while (rsx.next()) {
                                    ix++;
                                    MAN.add(rsx.getString("ITEM_MANUFACTURER"));
                                    nitem.add(rsx.getString("numberItems"));
                            %>
                            <tr><td><%=ix%></td>
                                <td><%=   rsx.getString("ITEM_MANUFACTURER")%></td>
                                <td><%=   rsx.getString("ITEM_ID")%></td>
                                <td><%=   rsx.getString("ITEM_NAME")%></td>
                                <td><%=   rsx.getString("numberItems")%></td></tr>
                                <%  }
                                    //if (c2 != null) {   //end while and closing loop
                                    //        c2.close();
                                    //}
                                %>

                        </table>
                        <br></br><br></br>
                        <style>
                            .chart div {
                                font: 10px sans-serif;
                                background-color: steelblue;
                                text-align: right;
                                padding: 3px;
                                margin: 1px;
                                color: white;
                            }
                        </style>
                        <div class="chart">
                            <%
                                out.print(" ");
                                for (String item : MAN) {
                                    int num = Integer.parseInt(nitem.get(MAN.indexOf(item)));
                                    String display = item + " - " + num;
                                    //out.print(num);
                            %>
                            <div style="width: <%=num * 10%>px;"><%=display%></div>
                            <%}
                            %>
                        </div>     
                        <br></br><br></br> 
                        <h4>Top 10 manufacturer in terms of offered items</h4>
                        <table width="59%" border="2">
                            <tr><td>Row Number</td>
                                <td>Manufacturer</td>
                                <td>Number of Items</td>
                            </tr>
                            <%
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                c2 = DriverManager.getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");

                                Statement stx2 = c2.createStatement();
                                int ix2 = 0;
                                ArrayList<String> MAN2 = new ArrayList<String>();
                                ArrayList<String> nitem2 = new ArrayList<String>();
                                String queryx2 = "select ITEM_MANUFACTURER, numberItems from (select ITEM_MANUFACTURER, count(*) as numberItems from item group by ITEM_MANUFACTURER order by numberItems DESC) where rownum <=10";

                                ResultSet rsx2 = stx2.executeQuery(queryx2);
                                while (rsx2.next()) {
                                    ix2++;
                                    MAN2.add(rsx2.getString("ITEM_MANUFACTURER"));
                                    nitem2.add(rsx2.getString("numberItems"));
                            %>
                            <tr><td><%=ix2%></td>
                                <td><%=   rsx2.getString("ITEM_MANUFACTURER")%></td>
                                <td><%=   rsx2.getString("numberItems")%></td></tr>
                                <%  }
                                    if (c2 != null) {   //end while and closing loop
                                        c2.close();
                                    }
                                %>
                        </table>
                        <br></br><br></br>
                        <style>
                            .chart div {
                                font: 10px sans-serif;
                                background-color: steelblue;
                                text-align: right;
                                padding: 3px;
                                margin: 1px;
                                color: white;
                            }
                        </style>
                        <div class="chart">
                            <%
                                out.print(" ");
                                for (String item : MAN2) {
                                    int num = Integer.parseInt(nitem2.get(MAN2.indexOf(item)));
                                    String display = item + " - " + num;
                                    //out.print(num);
                            %>
                            <div style="width: <%=num * 10%>px;"><%=display%></div>
                            <%}
                                MAN2.clear();
                                MAN.clear();
                                nitem2.clear();
                                nitem.clear();
                            %>
                        </div>   
                        <br></br><br></br>
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