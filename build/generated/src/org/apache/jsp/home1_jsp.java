package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Electronix Store</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("<!--[if IE 6]>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\n");
      out.write("<![endif]-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/boxOver.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"main_container\">\n");
      out.write("  <div class=\"top_bar\">\n");
      out.write("    <div class=\"top_search\">\n");
      out.write("      <div class=\"search_text\"><a href=\"#\">Advanced Search</a></div>\n");
      out.write("      <input type=\"text\" class=\"search_input\" name=\"search\" />\n");
      out.write("      <input type=\"image\" src=\"search.gif\" class=\"search_bt\"/>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"languages\">\n");
      out.write("      <div class=\"lang_text\">Languages:</div>\n");
      out.write("      <a href=\"#\" class=\"lang\"><img src=\"en.gif\" alt=\"\" border=\"0\" /></a> <a href=\"#\" class=\"lang\"><img src=\"de.gif\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <div id=\"logo\"> <a href=\"#\"><img src=\"ELECTRONICS_LOGO_1.gif\" alt=\"\" border=\"0\" width=\"237\" height=\"140\" /></a> </div>\n");
      out.write("    <div class=\"oferte_content\">\n");
      out.write("      <div class=\"top_divider\"><img src=\"header_divider.png\" alt=\"\" width=\"1\" height=\"164\" /></div>\n");
      out.write("      <div class=\"oferta\">\n");
      out.write("        <div class=\"oferta_content\"> <img src=\"laptop.png\" width=\"94\" height=\"92\" alt=\"\" border=\"0\" class=\"oferta_img\" />\n");
      out.write("          <div class=\"oferta_details\">\n");
      out.write("            <div class=\"oferta_title\">Samsung GX 2004 LM</div>\n");
      out.write("            <div class=\"oferta_text\"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>\n");
      out.write("            <a href=\"details.html\" class=\"details\"></a> </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"oferta_pagination\"> <span class=\"current\">1</span> <a href=\"#\">2</a> <a href=\"#\">3</a> <a href=\"#\">4</a> <a href=\"#\">5</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"top_divider\"><img src=\"header_divider.png\" alt=\"\" width=\"1\" height=\"164\" /></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of oferte_content-->\n");
      out.write("  </div>\n");
      out.write("  <div id=\"main_content\">\n");
      out.write("    <div id=\"menu_tab\">\n");
      out.write("      <div class=\"left_menu_corner\"></div>\n");
      out.write("      <ul class=\"menu\">\n");
      out.write("           ");
  HttpSession ses=request.getSession(false);
                        String full=new String(); 
                         full=(String)ses.getAttribute("full");
       
      out.write("\n");
      out.write("        <li><a href=\"home.jsp\" class=\"nav1\"> Home</a></li>\n");
      out.write("        <li class=\"divider\"></li>   \n");
      out.write("        <li><a href=\"LogoutServlet\" class=\"nav1\"> Logout</a></li>\n");
      out.write("     <li><a href=");
      out.print("\"myprofile.jsp?Id="+full+"\"");
      out.write(">Profile</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <div class=\"right_menu_corner\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of menu tab -->\n");
      out.write("    <div class=\"crumb_navigation\"> Navigation: <span class=\"current\">Home</span> </div>\n");
      out.write("    <div class=\"left_content\">\n");
      out.write("      <div class=\"title_box\">Categories</div>\n");
      out.write("      <ul class=\"left_menu\">\n");
      out.write("         ");
 
             
            ArrayList<String> cat= new ArrayList<String>();
               
      
        String usid=new String();
        String cat1=new String();
        
        ArrayList<String> item= new ArrayList<String>();
        ArrayList<String> picture= new ArrayList<String>();
        ArrayList price= new ArrayList();
             Connection c=null;
         try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 c = DriverManager
					.getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl","shubhi","Anjali144");

			Statement st = c.createStatement();

			ResultSet rs = st.executeQuery("select user_id from customer where Uname='"+full+"'");
                        

			while (rs.next()){
                               usid=rs.getString(1);	
			}
                        ResultSet rs2=st.executeQuery("Select * from category");
                        while(rs2.next()){
                            cat.add(rs2.getString(2));
                        }
                         Statement st1 = c.createStatement();
                        
			ResultSet rs1 = st1.executeQuery("select item_name,price,itempicture from item where cat_id =(select cat_id from (select cat_id,count(*) as max from ( select item_name,cat_id from item where item_id in (select itemht_id  from history where USERHT_ID='"+usid+"')) group by cat_id order by max desc) where rownum=1) intersect select item_name,price,itempicture from item where price between (select price  from (select price from history where userht_id='"+usid+"' group by price order by count(*) desc) where rownum=1)  and (select price  from (select price from history where userht_id='"+usid+"' group by price order by count(*) desc) where rownum=1)+100"); 

			
                       while(rs1.next()){
                           item.add(rs1.getString(1));
                           picture.add(rs1.getString(3));
                           price.add(rs1.getInt(2));
			}
         }
		 catch (SQLException e) {
			out.println("SQL Exception " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {}
               
            
         for(int i=0;i<cat.size();i++)
         {
         
         
      out.write("\n");
      out.write("         \n");
      out.write("     <li class=\"odd\"><a href=");
      out.print("\"productbycat.jsp?Id="+cat.get(i)+"/"+full+"\"");
      out.write('>');
      out.print(cat.get(i));
      out.write("</a></li>\n");
      out.write("      \n");
      out.write("       ");
}
      out.write("\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"title_box\">Special Products</div>\n");
      out.write("      <div class=\"border_box\">\n");
      out.write("        <div class=\"product_title\"><a href=\"details.html\">Motorola 156 MX-VL</a></div>\n");
      out.write("        <div class=\"product_img\"><a href=\"details.html\"><img src=\"laptop.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("        <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"title_box\">Newsletter</div>\n");
      out.write("      <div class=\"border_box\">\n");
      out.write("        <input type=\"text\" name=\"newsletter\" class=\"newsletter_input\" value=\"your email\"/>\n");
      out.write("        <a href=\"#\" class=\"join\">join</a> </div>\n");
      out.write("      <div class=\"banner_adds\"> <a href=\"#\"><img src=\"bann2.jpg\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of left content -->\n");
      out.write("    <div class=\"center_content\">\n");
      out.write("       ");
      
        for(int i=0;i<item.size();i++)
        {
        
      out.write(" \n");
      out.write("      <div class=\"center_title_bar\"></div>\n");
      out.write("      \n");
      out.write("      <div class=\"prod_box\">\n");
      out.write("        <div class=\"top_prod_box\"></div>\n");
      out.write("        <div class=\"center_prod_box\"><h3>Recommended Products</h3></br></br></br>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"product_title\"><a href=");
      out.print("\"productdetail.jsp?Item="+item.get(i)+"/"+full+"\"");
      out.write('>');
      out.print(item.get(i));
      out.write("</a></div>\n");
      out.write("          <div class=\"product_img\"><a href=\"details.html\"><img src=\"");
      out.print(picture.get(i));
      out.write("\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("          <div class=\"prod_price\"><span class=\"reduce\"></span> <span class=\"price\">$");
      out.print(price.get(i));
      out.write("</span></div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
        c.close();
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"bottom_prod_box\"></div>\n");
      out.write("        <div class=\"prod_details_tab\"> <a href=\"#\" title=\"header=[Add to cart] body=[&nbsp;] fade=[on]\"><img src=\"cart.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Specials] body=[&nbsp;] fade=[on]\"><img src=\"favs.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Gifts] body=[&nbsp;] fade=[on]\"><img src=\"favorites.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"details.html\" class=\"prod_details\">details</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"prod_box\">\n");
      out.write("        <div class=\"top_prod_box\"></div>\n");
      out.write("        <div class=\"center_prod_box\">\n");
      out.write("          <div class=\"product_title\"><a </a></div>\n");
      out.write("          <div class=\"product_img\"><a href=\"details.html\"><img src=\"p4.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("          <div class=\"prod_price\"><span class=\"price\">270$</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom_prod_box\"></div>\n");
      out.write("        <div class=\"prod_details_tab\"> <a href=\"#\" title=\"header=[Add to cart] body=[&nbsp;] fade=[on]\"><img src=\"cart.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Specials] body=[&nbsp;] fade=[on]\"><img src=\"favs.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Gifts] body=[&nbsp;] fade=[on]\"><img src=\"favorites.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"details.html\" class=\"prod_details\">details</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"prod_box\">\n");
      out.write("        <div class=\"top_prod_box\"></div>\n");
      out.write("        <div class=\"center_prod_box\">\n");
      out.write("          <div class=\"product_title\"><a href=\"details.html\">Samsung Webcam</a></div>\n");
      out.write("          <div class=\"product_img\"><a href=\"details.html\"><img src=\"p5.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("          <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom_prod_box\"></div>\n");
      out.write("        <div class=\"prod_details_tab\"> <a href=\"#\" title=\"header=[Add to cart] body=[&nbsp;] fade=[on]\"><img src=\"cart.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Specials] body=[&nbsp;] fade=[on]\"><img src=\"favs.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Gifts] body=[&nbsp;] fade=[on]\"><img src=\"favorites.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"details.html\" class=\"prod_details\">details</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"prod_box\">\n");
      out.write("        <div class=\"top_prod_box\"></div>\n");
      out.write("        <div class=\"center_prod_box\">\n");
      out.write("          <div class=\"product_title\"><a href=\"details.html\">Motorola 156 MX-VL</a></div>\n");
      out.write("          <div class=\"product_img\"><a href=\"details.html\"><img src=\"laptop.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("          <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom_prod_box\"></div>\n");
      out.write("        <div class=\"prod_details_tab\"> <a href=\"#\" title=\"header=[Add to cart] body=[&nbsp;] fade=[on]\"><img src=\"cart.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Specials] body=[&nbsp;] fade=[on]\"><img src=\"favs.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Gifts] body=[&nbsp;] fade=[on]\"><img src=\"favorites.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"details.html\" class=\"prod_details\">details</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"prod_box\">\n");
      out.write("        <div class=\"top_prod_box\"></div>\n");
      out.write("        <div class=\"center_prod_box\">\n");
      out.write("          <div class=\"product_title\"><a href=\"details.html\">Iphone Apple</a></div>\n");
      out.write("          <div class=\"product_img\"><a href=\"details.html\"><img src=\"p4.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("          <div class=\"prod_price\"><span class=\"price\">270$</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom_prod_box\"></div>\n");
      out.write("        <div class=\"prod_details_tab\"> <a href=\"#\" title=\"header=[Add to cart] body=[&nbsp;] fade=[on]\"><img src=\"cart.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Specials] body=[&nbsp;] fade=[on]\"><img src=\"favs.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Gifts] body=[&nbsp;] fade=[on]\"><img src=\"favorites.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"details.html\" class=\"prod_details\">details</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"prod_box\">\n");
      out.write("        <div class=\"top_prod_box\"></div>\n");
      out.write("        <div class=\"center_prod_box\">\n");
      out.write("          <div class=\"product_title\"><a href=\"details.html\">Samsung Webcam</a></div>\n");
      out.write("          <div class=\"product_img\"><a href=\"details.html\"><img src=\"p5.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("          <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom_prod_box\"></div>\n");
      out.write("        <div class=\"prod_details_tab\"> <a href=\"#\" title=\"header=[Add to cart] body=[&nbsp;] fade=[on]\"><img src=\"cart.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Specials] body=[&nbsp;] fade=[on]\"><img src=\"favs.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Gifts] body=[&nbsp;] fade=[on]\"><img src=\"favorites.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"details.html\" class=\"prod_details\">details</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"center_title_bar\">Recommended Products</div>\n");
      out.write("      <div class=\"prod_box\">\n");
      out.write("        <div class=\"top_prod_box\"></div>\n");
      out.write("        <div class=\"center_prod_box\">\n");
      out.write("          <div class=\"product_title\"><a href=\"details.html\">Motorola 156 MX-VL</a></div>\n");
      out.write("          <div class=\"product_img\"><a href=\"details.html\"><img src=\"laptop.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("          <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom_prod_box\"></div>\n");
      out.write("        <div class=\"prod_details_tab\"> <a href=\"#\" title=\"header=[Add to cart] body=[&nbsp;] fade=[on]\"><img src=\"cart.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Specials] body=[&nbsp;] fade=[on]\"><img src=\"favs.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Gifts] body=[&nbsp;] fade=[on]\"><img src=\"favorites.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"details.html\" class=\"prod_details\">details</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"prod_box\">\n");
      out.write("        <div class=\"top_prod_box\"></div>\n");
      out.write("        <div class=\"center_prod_box\">\n");
      out.write("          <div class=\"product_title\"><a href=\"details.html\">Iphone Apple</a></div>\n");
      out.write("          <div class=\"product_img\"><a href=\"details.html\"><img src=\"p4.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("          <div class=\"prod_price\"><span class=\"price\">270$</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom_prod_box\"></div>\n");
      out.write("        <div class=\"prod_details_tab\"> <a href=\"#\" title=\"header=[Add to cart] body=[&nbsp;] fade=[on]\"><img src=\"cart.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Specials] body=[&nbsp;] fade=[on]\"><img src=\"favs.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Gifts] body=[&nbsp;] fade=[on]\"><img src=\"favorites.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"details.html\" class=\"prod_details\">details</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"prod_box\">\n");
      out.write("        <div class=\"top_prod_box\"></div>\n");
      out.write("        <div class=\"center_prod_box\">\n");
      out.write("          <div class=\"product_title\"><a href=\"details.html\">Samsung Webcam</a></div>\n");
      out.write("          <div class=\"product_img\"><a href=\"details.html\"><img src=\"p5.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("          <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom_prod_box\"></div>\n");
      out.write("        <div class=\"prod_details_tab\"> <a href=\"#\" title=\"header=[Add to cart] body=[&nbsp;] fade=[on]\"><img src=\"cart.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Specials] body=[&nbsp;] fade=[on]\"><img src=\"favs.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"#\" title=\"header=[Gifts] body=[&nbsp;] fade=[on]\"><img src=\"favorites.gif\" alt=\"\" border=\"0\" class=\"left_bt\" /></a> <a href=\"details.html\" class=\"prod_details\">details</a> </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of center content -->\n");
      out.write("    <div class=\"right_content\">\n");
      out.write("      <div class=\"shopping_cart\">\n");
      out.write("    <div class=\"cart_title\"></div> \n");
      out.write("        </div>\n");
      out.write("      <div class=\"title_box\">What?s new</div>\n");
      out.write("      <div class=\"border_box\">\n");
      out.write("        <div class=\"product_title\"><a href=\"details.html\">Motorola 156 MX-VL</a></div>\n");
      out.write("        <div class=\"product_img\"><a href=\"details.html\"><img src=\"p2.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("        <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"title_box\">Manufacturers</div>\n");
      out.write("      <ul class=\"left_menu\">\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Sony</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Samsung</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Daewoo</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">LG</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Fujitsu Siemens</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Motorola</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Phillips</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Beko</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"banner_adds\"> <a href=\"#\"><img src=\"bann1.jpg\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of right content -->\n");
      out.write("  </div>\n");
      out.write("  <!-- end of main content -->\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"left_footer\"> <img src=\"footer_logo.png\" alt=\"\" width=\"170\" height=\"49\"/> </div>\n");
      out.write("    <div class=\"center_footer\"> Template name. All Rights Reserved 2008<br />\n");
      out.write("      <a href=\"http://csscreme.com\"><img src=\"csscreme.jpg\" alt=\"csscreme\" border=\"0\" /></a><br />\n");
      out.write("      <img src=\"payment.gif\" alt=\"\" /> </div>\n");
      out.write("    <div class=\"right_footer\"> <a href=\"#\">home</a> <a href=\"#\">about</a> <a href=\"#\">sitemap</a> <a href=\"#\">rss</a> <a href=\"contact.html\">contact us</a> </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<!-- end of main_container -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
