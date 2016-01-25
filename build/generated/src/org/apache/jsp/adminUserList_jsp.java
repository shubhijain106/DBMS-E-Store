package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class adminUserList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div id=\"main_content\">\n");
      out.write("                <div id=\"menu_tab\">\n");
      out.write("                    <div class=\"left_menu_corner\"></div>\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                        <li><a href=\"home.jsp\" class=\"nav1\"> Home</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                         <li><a href=\"adminprofile.jsp\" class=\"nav3\">Profile</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"LogoutServlet\" class=\"nav3\">Logout</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"c\">\n");
      out.write("                        <h4>User List: </h4>\n");
      out.write("                        <table width=\"59%\" border=\"2\">\n");
      out.write("                            <tr><td>User Name</td>\n");
      out.write("                                <td>Email Address</td>\n");
      out.write("                                <td>Number of Item Purchased</td>\n");
      out.write("                                <td>Total amount Spent</td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            ");

                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection c = DriverManager
                                        .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                Statement st = c.createStatement();
                                String query = "SELECT UName,Email,NPur,Tprice "
                                        + "FROM customer,(SELECT userht_ID, count(*) as NPur, SUM(Price) as Tprice FROM history GROUP BY userht_ID) "
                                        + "WHERE User_ID= userht_ID ORDER BY NPur DESC, Tprice DESC";

                                ResultSet rs = st.executeQuery(query);
                                while (rs.next()) {
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <tr><td>");
      out.print(   rs.getString("UName"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("Email"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("NPur"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(   rs.getString("Tprice"));
      out.write("</td></tr>\n");
      out.write("                                ");
  }
                                    if (c != null) {
                                        c.close();
                                    }
                                
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        <input type=\"submit\" value=\"Continue Shopping\"></input><br></br><br></br>\n");
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
