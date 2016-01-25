<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
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
.a {height: 200px; width: 250px; margin-left: 90px; }
.b {margin-top: 100px; margin-left: 40px;}
.c {margin-left: 500px; margin-top: -325px;}
.d {margin-top: 200px; margin-left: 40px;}
.e {margin-left: 500px; margin-top: -170px;}
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
        <div class="oferta_pagination"> <span class="current">1</span></div>
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
       <% String category=request.getParameter("Item");
        String[] parts = category.split("/");%>
       <li><a href=<%="\"myprofile.jsp?Id="+parts[1]+"\""%>>Profile</a></li>
                        <li class="divider"></li>
        <li><a href="LogoutServlet" class="nav4">Logout</a></li>
        <li class="divider"></li>
       
          <li><a href="contact.html" class="nav6"></a></li>
        <li class="divider"></li>
       
        <li><a href="contact.html" class="nav6"><%=parts[1]%></a></li>
        <li class="divider"></li>
        
      </ul>
      <%    
          
                
                PrintWriter out1 = response.getWriter();
                
                    String image =new String();
                    String iname =new String();
                    String desc = new String();
                    int price = 0;
                    String cat_id = new String();
                    String Cname = new String();
                    String manf=new String();
                    String item_id=new String();
                    
                    int star1=0;
                    int star2=0;
                    int star3=0;
                    int star4=0;
                    int star5=0;
                    
                    
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager
					.getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl","shubhi","Anjali144");

			Statement st = c.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM ITEM where item_name ='"+parts[0]+"'");
                        
                       while(rs.next())
                       { iname= rs.getString(1);
                          image=  rs.getString(5);
                          price=rs.getInt(2);
                          desc=rs.getString(3);
                          cat_id=rs.getString(10);
                          manf=rs.getString(4);
                          item_id=rs.getString(9);
                          
                          
                       }  
                       
                       Statement st1 = c.createStatement();

			ResultSet rs1 = st1.executeQuery("SELECT cname FROM category where c_id ='"+cat_id+"'");
                          
                       while(rs1.next())
                       { Cname=rs1.getString(1);}
                       
                       Statement st2 = c.createStatement();
                       Statement st3 = c.createStatement();
                       Statement st4 = c.createStatement();
                       Statement st5 = c.createStatement();
                       Statement st6 = c.createStatement();
                       

			ResultSet rs2 = st2.executeQuery("SELECT count(star1_ratings) FROM reviews where itemrev_ID ='"+item_id+"' and star1_ratings = 1");
                        ResultSet rs3 = st3.executeQuery("SELECT count(star2_ratings) FROM reviews where itemrev_ID ='"+item_id+"' and star2_ratings = 1");
                        ResultSet rs4 = st4.executeQuery("SELECT count(star3_ratings) FROM reviews where itemrev_ID ='"+item_id+"' and star3_ratings = 1");
                        ResultSet rs5 = st5.executeQuery("SELECT count(star4_ratings) FROM reviews where itemrev_ID ='"+item_id+"' and star4_ratings = 1");
                        ResultSet rs6 = st6.executeQuery("SELECT count(star5_ratings) FROM reviews where itemrev_ID ='"+item_id+"' and star5_ratings = 1");
                        while(rs2.next())
                        { star1=rs2.getInt(1);}
                        while(rs3.next())
                        { star2=rs3.getInt(1);}
                        while(rs4.next())
                        { star3=rs4.getInt(1);}
                        while(rs5.next())
                        { star4=rs5.getInt(1);}
                        while(rs6.next())
                        { star5=rs6.getInt(1);}
      
                        c.close();
      %>
      
      <div class="a" align="left">
          <img src="<%= image %>"/>
      </div>
     
      <div class="b">
          <table >
              <tr><td><h2>Category:</h2></td><td><h3><%=Cname%></h3></td></tr>
          <tr><td><h2>Manufacturer:</h2></td><td><h3><%=manf%></h3></td></tr>
          <tr><td><h2>Description:</h2></td><td colspan="1"><h3><%=desc%></h3></td></tr>
          </table>
      </div>
      
       <div class="c">
           <table>
          <tr><td><h2>Product Name:</h2></td><td><h3><%=iname%></h3></td></tr>
          <tr><td><h2>Price:</h2></td><td><h3>$<%=price%></h3></td></tr>
           </table>
          <form>Quantity: <select>
                  <option>1</option>
                  <option>2</option>
                  <option>3</option>
                  <option>4</option>
                  <option>5</option>
              </select></form>
      </div>
      
      <div class="d">
          <table>
          <tr><td><h3>Reviews</h3></td><td></td></tr>
          <tr><td><h2>*****</h2></td><td><h3><%=star5%></h3></td></tr>
          <tr><td><h2>****</h2></td><td><h3><%=star4%></h3></td></tr>
          <tr><td><h2>***</h2></td><td><h3><%=star3%></h3></td></tr>
          <tr><td><h2>**</h2></td><td><h3><%=star2%></h3></td></tr>
          <tr><td><h2>*</h2></td><td><h3><%=star1%></h3></td></tr>
          </table>
      </div>
      
      <div class="e">
          <h2> <a href="home1.jsp">Continue Shopping</a></br>
          </h2><br><br>              <h2><a href=<%="\"mycart.jsp?Id="+iname+"/"+parts[1]+"\""%>>Add to Cart</a></br></h2><br><br>
                  <h2><a href=<%="\"mywishlist.jsp?Id="+iname+"/"+parts[1]+"\""%>>Add to Wishlist</a></br></h2>
      </div>
      
      <div class="footer">
    <div class="left_footer"></div>
    <div class="center_footer"><br />
      <a href="http://csscreme.com"><img src="csscreme.jpg" alt="csscreme" border="0" /></a><br />
      <img src="payment.gif" alt="" /> </div>
    <div class="right_footer"></div>
  </div>
</div>
  
<!-- end of main_container -->

</body>
</html>