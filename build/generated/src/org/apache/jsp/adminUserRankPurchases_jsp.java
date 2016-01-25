package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class adminUserRankPurchases_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <title>DBMS Store</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("        <!--[if IE 6]>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\n");
      out.write("        <![endif]-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/boxOver.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            .first{margin-top: 20px;}\n");
      out.write("            .serv {margin-top: 50px; margin-left: 80px;}\n");
      out.write("            .initials{margin-left: 490px; margin-top: 70px;}\n");
      out.write("            .buttons{margin-left: 490px; margin-top: 100px;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main_container\">\n");
      out.write("            \n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\"> <a href=\"#\"><img src=\"ELECTRONICS_LOGO_1.gif\" alt=\"\" border=\"0\" width=\"237\" height=\"140\" /></a> </div>\n");
      out.write("                <!-- end of oferte_content-->\n");
      out.write("            </div>\n");
      out.write("            <div id=\"main_content\">\n");
      out.write("                <div id=\"menu_tab\">\n");
      out.write("                    <div class=\"left_menu_corner\"></div>\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                        <li><a href=\"home.jsp\" class=\"nav1\"> Home</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"adminprofile.jsp\" class=\"nav3\">Profile</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"LogoutServlet\" class=\"nav3\">Logout</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"c\">\n");
      out.write("                        <h2>Top 10 Active Users (total Purchased items : time duration)</h3>\n");
      out.write("                        <table width=\"59%\" border=\"2\">\n");
      out.write("                            <tr><td>Row Number</td>\n");
      out.write("                                <td>Customer ID</td>\n");
      out.write("                                <td>Number of Products</td>\n");
      out.write("                                <td>Duration in Month</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection c2 = DriverManager
                                        .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");

                                Statement stx = c2.createStatement();
                                int ix=0;
                                String queryx = "select userht_id,diff,numofproducts from (select userht_id,round((TRUNC(SYSDATE)-mindate)/12) as diff,numofproducts from v1 order by numofproducts desc, diff asc) where  rownum<=10";

                                ResultSet rsx = stx.executeQuery(queryx);
                                while (rsx.next()) {
                                    ix++;
                            
      out.write("\n");
      out.write("                                <tr><td>");
      out.print(ix);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rsx.getString("userht_id"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rsx.getString("numofproducts"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rsx.getString("diff"));
      out.write("</td></tr>\n");
      out.write("                            ");
  }if (c2 != null) {   //end while and closing loop
                                        c2.close();
                                }
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <h2>User Rank by Purchases: </h2>\n");
      out.write("                        <h3>Rank 4 for less than $1000</h3>\n");
      out.write("                        <h3>Rank 3 for more than $1000</h3> \n");
      out.write("                        <h3>Rank 2 for more than $5000</h3>\n");
      out.write("                        <h3>Rank 1 for more than $10,000</h3> \n");
      out.write("                        \n");
      out.write("                        <table width=\"59%\" border=\"2\">\n");
      out.write("                            <tr><td>Row Number</td>\n");
      out.write("                                <td>Customer Name</td>\n");
      out.write("                                <td>Customer Email</td>\n");
      out.write("                                <td>Customer ID</td>\n");
      out.write("                                <td>Number of Items</td>\n");
      out.write("                                <td>Total Purchases</td>\n");
      out.write("                                <td>Rank by Purchases</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("                                <tr><td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("cname"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("cemail"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("uhID"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("numberItems"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("totalPurchases"));
      out.write("</td>\n");
      out.write("                                <td>Rank# 4</td></tr>\n");
      out.write("                            ");
  }//first if
                                else if(purRank > 1000 && purRank <5000){
                            
      out.write("\n");
      out.write("                                <tr><td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("cname"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("cemail"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("uhID"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("numberItems"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("totalPurchases"));
      out.write("</td>\n");
      out.write("                                <td>Rank# 3</td></tr>\n");
      out.write("                            ");
  }//end of elseif
                                else if(purRank >5000 && purRank <10000){ 
                            
      out.write("\n");
      out.write("                                <tr><td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("cname"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("cemail"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("uhID"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("numberItems"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("totalPurchases"));
      out.write("</td>\n");
      out.write("                                <td>Rank# 2</td></tr>\n");
      out.write("                            ");
  }//end of elseif  
                                else{
                            
      out.write("\n");
      out.write("                                <tr><td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("cname"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("cemail"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("uhID"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("numberItems"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("totalPurchases"));
      out.write("</td>\n");
      out.write("                                <td>Rank# 1</td></tr>\n");
      out.write("                            ");
  }//end of else  
                                
                                }if (c != null) {   //end while and closing loop
                                        c.close();
                                }
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                        <input type=\"submit\" value=\"Generate Graph\"></input>\n");
      out.write("                        <input type=\"submit\" value=\"cancel\"></input><br></br><br></br>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                   <div class=\"footer\">\n");
      out.write("                        <div class=\"left_footer\">  </div>\n");
      out.write("                        <div class=\"center_footer\"> \n");
      out.write("                            <a href=\"http://csscreme.com\"><img src=\"csscreme.jpg\" alt=\"csscreme\" border=\"0\" /></a><br />\n");
      out.write("                            <img src=\"payment.gif\" alt=\"\" /> </div>\n");
      out.write("                        <div class=\"right_footer\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end of main_container -->\n");
      out.write("    </body>\n");
      out.write("</html>");
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
