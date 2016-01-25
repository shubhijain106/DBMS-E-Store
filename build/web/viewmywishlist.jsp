<%@page import="java.sql.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Electronix Store</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>
<style>
    .first{margin-top: 20px;}
    .serv {margin-top: 50px; margin-left: 80px;}
    
    .buttons{margin-left: 590px; margin-top: 50px; margin-bottom: 200px;}
</style>
</head>
<body>
<div id="main_container">
  <div class="top_bar">
    <div class="top_search">
      <div class="search_text"><a href="#"></a></div>
     
    </div>
    <div class="languages">
      <div class="lang_text">Languages:</div>
      <a href="#" class="lang"><img src="en.gif" alt="" border="0" /></a> <a href="#" class="lang"><img src="de.gif" alt="" border="0" /></a> </div>
  </div>
  <div id="header">
    <div id="logo"> <a href="#"><img src="ELECTRONICS_LOGO_1.gif" alt="" border="0" width="237" height="140" /></a> </div>
    <div class="oferte_content">
      <div class="top_divider"><img src="header_divider.png" alt="" width="1" height="164" /></div>
      <div class="oferta">
        <div class="oferta_content"> 
          <div class="oferta_details">
            <div class="oferta_title"></div>
            <div class="oferta_text"></div>
            <a href="details.html" class="details"></a> </div>
        </div>
        <div class="oferta_pagination"> <span class="current">1</span> </div>
      </div>
      <div class="top_divider"><img src="header_divider.png" alt="" width="1" height="164" /></div>
    </div>
    <!-- end of oferte_content-->
  </div>
  <div id="main_content">
    <div id="menu_tab">
      <div class="left_menu_corner"></div>
      <ul class="menu">
        <li><a href="home1.jsp" class="nav1"> Home</a></li>
        <li class="divider"></li>
        
        <li><a href="myprofile.jsp" class="nav3">Profile</a></li>
        <li class="divider"></li>
        <li><a href="LogoutServlet" class="nav2">Logout</a></li>
        <li class="divider"></li>
       
        
      </ul>
    </div></div>
    <div class="first" align="center">
        <h1>My Wishlist</h1>
    </div>
    
    <div class="serv">
               <% 
                   
                    
                   String id = request.getParameter("Id");
                  if(id==null){
                      id=(String)request.getAttribute("Id");
                  }
                    PrintWriter out1 = response.getWriter();
                    ArrayList<String> uid= new ArrayList<String>();
                    ArrayList<String> itemid= new ArrayList<String>();
                    ArrayList<Integer> subtotal= new ArrayList<Integer>();
                   ArrayList<Integer> price= new ArrayList<Integer>();
                   ArrayList<String> itemnames= new ArrayList<String>();
                    
                    int price1 =0;
                    String iname= new String();
                    Connection c=null;
                    
                try {
                        
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager
					.getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl","shubhi","Anjali144");

			
			Statement st=c.createStatement();
                       
                                 
                        ResultSet rs1 = st.executeQuery("select * from wishlist where userwl_id='"+ id + "'");
                        
                        	while(rs1.next()){
                                    
                                    uid.add(rs1.getString(1));
                                    itemid.add(rs1.getString(2));
                                    
                                    price.add(rs1.getInt(4));
                                }
                         for(int j=0;j<itemid.size();j++)
                         {
                             ResultSet rs4 = st.executeQuery("select * from item where item_id='"+itemid.get(j)+ "'");
                             while(rs4.next())
                             {
                                 itemnames.add(rs4.getString(1));
                             }
                         }
                        
                        
                }

		
		catch (SQLException e) {
			out.println("SQL Exception " + e.getMessage());
			e.printStackTrace();
		}
 
         %> 
                

                <table align="left" border="1" cellspacing="4" cellpadding="3">
                    
                    <tr><td><h2>Product Name</h2></td><td colspan="7"><h2>Price</h2></td><td colspan="7"><h2>Delete</h2></td><td colspan="7"><h2>Add to Cart</h2></td></tr>
                 <%   for(int i=0;i<uid.size();i++)
         {  %>
                    <tr><td><h2><%=itemnames.get(i)%></h2></td><td colspan="7"><h2><%=price.get(i)%></h2></td><td colspan="7"><h2><a href=<%="\"random1.jsp?Id="+itemid.get(i)+"/"+id+"\""%>>Delete</a></h2></td><td colspan="7"><h2><a href=<%="\"random3.jsp?Id="+itemid.get(i)+"/"+id+"/"+itemnames.get(i)+"/"+price.get(i)+"\""%>>ADD</a></h2></td></tr>  
                    <%}
                    c.close();
                    %>                                                                                                                              
                </table>
    </div>
                    
                   
                    <div class="buttons">
                        <form action="home1.jsp">    
                    <input type="submit" value="Continue Shopping"/>
                    </form>
                        </br></br><form action="mycart.jsp">   
                    <input type="submit" value="Add to Cart"/>
                    </form>
                    </br></br>          

                           </div>
     
                
      <div class="footer">
    <div class="left_footer">  </div>
    <div class="center_footer">
      <a href="http://csscreme.com"><img src="csscreme.jpg" alt="csscreme" border="0" /></a><br />
      <img src="payment.gif" alt="" /> </div>
    <div class="right_footer">  </div>
  </div>
</div>
<!-- end of main_container -->
</body>
</html>

