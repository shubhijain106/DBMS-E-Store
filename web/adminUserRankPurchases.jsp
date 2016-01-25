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
                        <h2>Top 10 Active Users (total Purchased items : time duration)</h3>
                        <table width="59%" border="2">
                            <tr><td>Row Number</td>
                                <td>Customer ID</td>
                                <td>Number of Products</td>
                                <td>Duration in Month</td>
                            </tr>
                            <%
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection c2 = DriverManager
                                        .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");

                                Statement stx = c2.createStatement();
                                int ix=0;
                                String queryx = "select userht_id,diff,numofproducts from (select userht_id,round((TRUNC(SYSDATE)-mindate)/12) as diff,numofproducts from v1 order by numofproducts desc, diff asc) where  rownum<=10";

                                ResultSet rsx = stx.executeQuery(queryx);
                                while (rsx.next()) {
                                    ix++;
                            %>
                                <tr><td><%=ix%></td>
                                <td><%=   rsx.getString("userht_id")%></td>
                                <td><%=   rsx.getString("numofproducts")%></td>
                                <td><%=   rsx.getString("diff")%></td></tr>
                            <%  }if (c2 != null) {   //end while and closing loop
                                        c2.close();
                                }
                            %>
                            
                            
                            
                        </table>
                        
                        
                        
                        
                        <h2>User Rank by Purchases: </h2>
                        <h3>Rank 4 for less than $1000</h3>
                        <h3>Rank 3 for more than $1000</h3> 
                        <h3>Rank 2 for more than $5000</h3>
                        <h3>Rank 1 for more than $10,000</h3> 
                        
                        <table width="59%" border="2">
                            <tr><td>Row Number</td>
                                <td>Customer Name</td>
                                <td>Customer Email</td>
                                <td>Customer ID</td>
                                <td>Number of Items</td>
                                <td>Total Purchases</td>
                                <td>Rank by Purchases</td>
                            </tr>
                            <%
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection c = DriverManager
                                        .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");

                                Statement st = c.createStatement();
                                int i=0;
                                int purRank=0;
                                String query = "select customer.UNAME as cname, customer.EMAIL as cemail, uhID, numberItems, totalPurchases from customer,(select USERHT_ID as uhID, count(*) as numberItems, sum(price) as totalPurchases from history group by USERHT_ID order by sum(price) DESC) where customer.USER_ID = uhID";

                                ResultSet rs = st.executeQuery(query);
                                while (rs.next()) {
                                    i++;
                                    purRank = Integer.parseInt(rs.getString("totalPurchases"));
                                    if(purRank<1000){
                            %>
                                <tr><td><%=i%></td>
                                <td><%=   rs.getString("cname")%></td>
                                <td><%=   rs.getString("cemail")%></td>
                                <td><%=   rs.getString("uhID")%></td>
                                <td><%=   rs.getString("numberItems")%></td>
                                <td><%=   rs.getString("totalPurchases")%></td>
                                <td>Rank# 4</td></tr>
                            <%  }//first if
                                else if(purRank > 1000 && purRank <5000){
                            %>
                                <tr><td><%=i%></td>
                                <td><%=   rs.getString("cname")%></td>
                                <td><%=   rs.getString("cemail")%></td>
                                <td><%=   rs.getString("uhID")%></td>
                                <td><%=   rs.getString("numberItems")%></td>
                                <td><%=   rs.getString("totalPurchases")%></td>
                                <td>Rank# 3</td></tr>
                            <%  }//end of elseif
                                else if(purRank >5000 && purRank <10000){ 
                            %>
                                <tr><td><%=i%></td>
                                <td><%=   rs.getString("cname")%></td>
                                <td><%=   rs.getString("cemail")%></td>
                                <td><%=   rs.getString("uhID")%></td>
                                <td><%=   rs.getString("numberItems")%></td>
                                <td><%=   rs.getString("totalPurchases")%></td>
                                <td>Rank# 2</td></tr>
                            <%  }//end of elseif  
                                else{
                            %>
                                <tr><td><%=i%></td>
                                <td><%=   rs.getString("cname")%></td>
                                <td><%=   rs.getString("cemail")%></td>
                                <td><%=   rs.getString("uhID")%></td>
                                <td><%=   rs.getString("numberItems")%></td>
                                <td><%=   rs.getString("totalPurchases")%></td>
                                <td>Rank# 1</td></tr>
                            <%  }//end of else  
                                
                                }if (c != null) {   //end while and closing loop
                                        c.close();
                                }
                            %>
                            
                            
                            
                        </table>
                        <input type="submit" value="Generate Graph"></input>
                        <input type="submit" value="cancel"></input><br></br><br></br>
                    </div>

                   <div class="footer">
                        <div class="left_footer">  </div>
                        <div class="center_footer"> 
                            <a href="http://csscreme.com"><img src="csscreme.jpg" alt="csscreme" border="0" /></a><br />
                            <img src="payment.gif" alt="" /> </div>
                        <div class="right_footer"> </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end of main_container -->
    </body>
</html>