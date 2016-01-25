package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class adminAddCat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\"> <a href=\"#\"><img src=\"ELECTRONICS_LOGO_1.gif\" alt=\"\" border=\"0\" width=\"237\" height=\"140\" /></a> </div>\n");
      out.write("                <!-- end of oferte_content-->\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"main_content\">\n");
      out.write("                <div id=\"menu_tab\">\n");
      out.write("                    <div class=\"left_menu_corner\"></div>\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                        <li><a href=\"home1.jsp\" class=\"nav1\"> Home</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"login.jsp\" class=\"nav4\">Log In</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <form>\n");
      out.write("                        <table cellpadding=\"5\" cellspacing=\"10\" align=\"left\">\n");
      out.write("                            <tr><td><h3>Add Category</h3></td></tr>\n");
      out.write("                            <tr><td>Category Name</td><td><input id=\"IName\" name=\"IName\" value=\"\" type=\"text\" placeholder=\"     \"></input></td></tr>\n");
      out.write("                            <tr><td colspan =\"2\" align=\"left\"><input type=\"submit\" value=\"Add Category\" onclick=\"addcat()\"/></input></td></tr>\n");
      out.write("                            <tr><td><h3><a href=\"adminprofile.jsp\">Back To Admin Profile</a></h3></td></tr>\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                function addcat() {\n");
      out.write("                                ");

                                    PrintWriter out1 = response.getWriter();
                                    String catName = request.getParameter("IName");
                                    if (catName != null) {
                                        Class.forName("oracle.jdbc.driver.OracleDriver");
                                        Connection c = DriverManager
                                                .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                        Statement st = c.createStatement();
                                        String query = "select MAX(CAST(SUBSTR(C_ID, 4) AS INT)) as currentcat from Category";

                                        ResultSet rs = st.executeQuery(query);
                                        int i = 0;
                                        while (rs.next()) {
                                            i = rs.getInt("currentcat");
                                        }
                                        int newid = i + 1;
                                        String catID = "cID" + newid;

                                        Statement st2 = c.createStatement();
                                        String query2 = "INSERT INTO Category (C_ID, CNAME) VALUES ('" + catID + "','" + catName + "')";

                                        ResultSet rs2 = st2.executeQuery(query2);

                                        if (c != null) {
                                            c.close();
                                        }
                                    }
                                
      out.write("\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div class=\"footer\">\n");
      out.write("                        <div class=\"left_footer\">  </div>\n");
      out.write("                        <div class=\"center_footer\">\n");
      out.write("                            <a href=\"http://csscreme.com\"><img src=\"csscreme.jpg\" alt=\"csscreme\" border=\"0\" /></a><br />\n");
      out.write("                            <img src=\"payment.gif\" alt=\"\" /> </div></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end of main_container -->\n");
      out.write("                </body>\n");
      out.write("                </html>");
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
