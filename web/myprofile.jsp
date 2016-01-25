<%@page import="java.lang.String"%>
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
    .initials{margin-left: 490px; margin-top: 70px;}
    .buttons{margin-left: 490px; margin-top: 100px;}
</style>
</head>
<body>
<div id="main_container">
  <div class="top_bar">
    <div class="top_search">
      <div class="search_text"></div>
      
    </div>
    <div class="languages">
      <div class="lang_text">Languages:</div>
      <a href="#" class="lang"><img src="en.gif" alt="" border="0" /></a> <a href="#" class="lang"><img src="de.gif" alt="" border="0" /></a> </div>
  </div>
  <div id="header">
    <div id="logo"> <a href="#"><img src="ELECTRONICS_LOGO_1.gif"  alt="" border="0" width="237" height="140" /></a> </div>
    <div class="oferte_content">
      <div class="top_divider"><img src="header_divider.png" alt="" width="1" height="164" /></div>
      <div class="oferta">
        <div class="oferta_content"> 
          <div class="oferta_details">
            <div class="oferta_title"></div>
            <div class="oferta_text"></div>
           </div>
        </div>
        <div class="oferta_pagination"> <span class="current">1</span>  </div>
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
         <li><a href="LogoutServlet" class="nav1"> Logout</a></li>
        <li class="divider"></li>
       
        
      </ul>
    </div></div>
    <div class="first" align="center">
        <h1>My Profile</h1>
    </div>
    
    <div class="serv">
<% 
        
                 String name=request.getParameter("Id");
                 String uid = new String();
              try{   
                 Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager
					.getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl","shubhi","Anjali144");

			Statement st = c.createStatement();

			ResultSet rs = st.executeQuery("SELECT user_id FROM customer where uname ='"+name+"'");
                        while(rs.next()){
                            uid= rs.getString(1);
                        }
                             c.close();   

        }
		catch (SQLException e) {
			out.println("SQL Exception " + e.getMessage());
			e.printStackTrace();
		}
          
                %>

                <table align="left">
                    <tr><td><h3>Account</h3></td></tr>
                    <tr><td><h3><%=name%></h3></td></tr>
                    <tr><td><h3><a href=<%="\"viewmycart.jsp?Id="+uid+"\""%>>My Cart</a></h3></td></tr>
                    <tr><td><h3><a href=<%="\"viewmywishlist.jsp?Id="+uid+"\""%>>My Wishlist</a></h3></td></tr>
                    <tr><td><h3><a href=<%="\"myhistory.jsp?Id="+uid+"\""%>>My History</a></h3></td></tr>
                    <tr><td><h3><a href="settings.jsp">Settings</a></h3></td></tr>
                </table>
    </div>
                    
                    <div class="initials">
                        <h2><%=name%></h2>
                    </div>
                    
                    <div class="buttons">
                        <form action="home1.jsp">    
                    <input type="submit" value="Continue Shopping"/>
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
