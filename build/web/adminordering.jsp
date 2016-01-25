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
            <div class="oferta_text">mod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>
            <a href="details.html" class="details"></a> </div>
        </div>
        <div class="oferta_pagination"> <span class="current">1</span> <a href="#">2</a> <a href="#">3</a> <a href="#">4</a> <a href="#">5</a> </div>
      </div>
      <div class="top_divider"><img src="header_divider.png" alt="" width="1" height="164" /></div>
    </div>
    <!-- end of oferte_content-->
  </div>
  <div id="main_content">
    <div id="menu_tab">
      <div class="left_menu_corner"></div>
      <ul class="menu">
        <li><a href="home.jsp" class="nav1"> Home</a></li>
        <li class="divider"></li>
        <li><a href="#" class="nav2">Products</a></li>
        <li class="divider"></li>
        <li><a href="#" class="nav3">Profile</a></li>
        <li class="divider"></li>
        <li><a href="registration.jsp" class="nav4">Sign Up</a></li>
        <li class="divider"></li>
        <li><a href="#" class="nav5">About</a></li>
        <li class="divider"></li>
        <li><a href="contact.html" class="nav6">Contact Us</a></li>
        <li class="divider"></li>
        
      </ul>
    </div></div>
    <div class="first" align="center">
        <h1>My Wishlist</h1>
    </div>
    
    <div class="serv">
               <% 
                   
                   
                   String itemid = request.getParameter("itemid");
                   int quantity = Integer.parseInt(request.getParameter("order"));
                  
                   
                    PrintWriter out1 = response.getWriter();
                    
                    
                    
                    
                try {
                        
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager
					.getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl","shubhi","Anjali144");

			
			Statement st=c.createStatement();
                       
                        
                        int r = st.executeUpdate("Update item set quantity_ordered=quantity_ordered+"+quantity+" , quantity_left=quantity_left+"+quantity+",Last_Reorder_Date=(to_date(sysdate, 'dd/mm/yyyy')) where item_id='"+itemid+"'");
                        
                        if (r>0)
                        {
                          
                          
                          request.getRequestDispatcher("adminprofile.jsp").forward(request, response);
                        }
			
                }
		
		catch (SQLException e) {
			out.println("SQL Exception " + e.getMessage());
			e.printStackTrace();
		}
 
         %> 
                

             
                    <div class="buttons">
                        <form action="home.jsp">    
                    <input type="submit" value="Continue Shopping"/>
                    </form>
                        </br></br>           <form action="mycart.jsp">   
                    <input type="submit" value="Add to Cart"/>
                    </form>
                    </br></br>           <form action="LogoutServlet">   
                    <input type="submit" value="Logout"/>
                    </form>

                           </div>
     
                
      <div class="footer">
    <div class="left_footer"> <img src="footer_logo.png" alt="" width="170" height="49"/> </div>
    <div class="center_footer"> Template name. All Rights Reserved 2008<br />
      <a href="http://csscreme.com"><img src="csscreme.jpg" alt="csscreme" border="0" /></a><br />
      <img src="payment.gif" alt="" /> </div>
    <div class="right_footer"> <a href="#">home</a> <a href="#">about</a> <a href="#">sitemap</a> <a href="#">rss</a> <a href="contact.html">contact us</a> </div>
  </div>
</div>
<!-- end of main_container -->
</body>
</html>

