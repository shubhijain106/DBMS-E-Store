<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
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
                <div id="logo"> <a href="#"><img src="ELECTRONICS_LOGO_1.gif"  alt="" border="0" width="237" height="140" /></a> </div>
                <!-- end of oferte_content-->
            </div>
            <div id="main_content">
                <div id="menu_tab">
                    <div class="left_menu_corner"></div>


                    <div class="c">
                        <h4>Order Product: </h4>
                        
                        <table width="59%" border="2">
                            <tr><td>Index</td><td>Item Name</td>
                                <td>Item Category</td>
                                <td>Item Price</td>
                                <td>Item Manufacture</td>
                                <td>Item Last Order date</td>
                                <td>quantity Left</td>
                                <td>Reorder Amount</td>
                            </tr>

                            <%
                                String itemid=new String();
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection c = DriverManager
                                        .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                Statement st = c.createStatement();
                                String query = "SELECT Item_ID,Item_Name,CName,Price,Item_Manufacturer,Last_reorder_date,(Quantity_ordered-sold) as Qleft"
                                        + " FROM item, category,(SELECT count(*) as sold,itemht_ID FROM history GROUP BY itemht_ID)"
                                        + " WHERE C_ID= Cat_ID AND Item_ID = itemht_ID";

                                ResultSet rs = st.executeQuery(query);
                                int i = 1;
                                String value = "";
                                while (rs.next()) {
                                    itemid=rs.getString(1);
                            %>
                            
                                <tr><td><%=i%></td>
                                    <td><%=   rs.getString("Item_Name")%></td>
                                    <td><%=   rs.getString("CName")%></td>
                                    <td><%=   rs.getString("Price")%></td>
                                    <td><%=   rs.getString("Item_Manufacturer")%></td>
                                    <td><%=   rs.getString("Last_reorder_date")%></td>
                                    <td><%=   rs.getString("Qleft")%></td>
                                    <td><a href=<%="\"adminorderRedir.jsp?Id="+itemid+"\""%>>Reorder</a></td>
                              
                                </tr>
                            
                            <%i++;
                                }if (c != null) {c.close();
                                }
                            %>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>