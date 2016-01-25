package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class adminAddItem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <div id=\"logo\"> <a href=\"#\"><img src=\"ELECTRONICS_LOGO_1.gif\"alt=\"\" border=\"0\" width=\"237\" height=\"140\" /></a> </div>\n");
      out.write("                <!-- end of oferte_content-->\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"main_content\">\n");
      out.write("                <div id=\"menu_tab\">\n");
      out.write("                    <div class=\"left_menu_corner\"></div>\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                        <li><a href=\"home.jsp\" class=\"nav1\"> Home</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                       \n");
      out.write("                        <li><a href=\"login.jsp\" class=\"nav4\">Log In</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"LogoutServlet\" class=\"nav5\">Logout</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <form>\n");
      out.write("                        <table cellpadding=\"5\" cellspacing=\"10\" align=\"left\">\n");
      out.write("                            <tr><td><h2>Add Item</h3></td></tr>\n");
      out.write("                            <tr><td>Item Name:</td><td><input id=\"IName\" name=\"IName\" value=\"\" type=\"text\" placeholder=\"    \"></input></td></tr>\n");
      out.write("                            <tr><td>Item Price:</td><td><input id=\"Iprice\" name=\"Iprice\" value=\"\" type=\"text\" placeholder=\"    \"></input></td></tr>\n");
      out.write("                            <tr><td>Item Image URL:</td><td><input id=\"Iimage\" name=\"Iimage\" value=\"\" type=\"text\" placeholder=\"    \"></input></td></tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <select name=\"categoryList\">\n");
      out.write("                                        ");

                                            Class.forName("oracle.jdbc.driver.OracleDriver");
                                            Connection c2 = DriverManager
                                                    .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                            Statement st2 = c2.createStatement();
                                            String query2 = "select MAX(CAST(SUBSTR(Item_ID, 4) AS INT)) as currentitem from item";
                                            ResultSet rs2 = st2.executeQuery(query2);
                                            int i = 0;
                                            while (rs2.next()) {
                                                i = rs2.getInt("currentitem");
                                            }
                                            int newid = i + 1;
                                            String iTID = "iID" + newid;
                                            if (c2 != null) {
                                                c2.close();
                                            }

                                            Class.forName("oracle.jdbc.driver.OracleDriver");
                                            Connection c = DriverManager
                                                    .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                            Statement st = c.createStatement();
                                            String query = "select C_ID || '-' || CNAME As Namex from Category";
                                            ResultSet rs = st.executeQuery(query);
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(rs.getString("Namex"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("Namex"));
      out.write("</option>\n");
      out.write("                                        ");
}

                                            if (c != null) {
                                                c.close();
                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr><td>Item Manufacture</td><td><input id=\"IMan\" name=\"IMan\" value=\"\" type=\"text\" placeholder=\"    \"></input></td></tr>\n");
      out.write("                            <tr><td>Item Description</td><td><input id=\"IDes\" name=\"IDes\" value=\"\" type=\"text\" cols=\"50\" rows=\"10\"></input></td></tr>\n");
      out.write("                            <tr><td colspan =\"2\" align=\"left\"><input type=\"submit\" value=\"Add Item\" onclick=\"additm()\"/></input></td></tr>\n");
      out.write("                            <tr><td><h3><a href=\"adminprofile.jsp\">Back To Admin Profile</a></h3></td></tr>\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                function additm() {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                    PrintWriter out1 = response.getWriter();
                                    try {
                                        String IName = request.getParameter("IName");
                                        String Iprice = request.getParameter("Iprice");
                                        String Iimage = request.getParameter("Iimage");
                                        String ICatprev = request.getParameter("categoryList");
                                        String[] parts = ICatprev.split("-");
                                        String ICat = parts[0];
                                        String IMan = request.getParameter("IMan");
                                        String IDes = request.getParameter("IDes");
                                        Calendar cal = Calendar.getInstance();
                                        String datecal = cal.get(Calendar.DAY_OF_MONTH) + "-jan-" + cal.get(Calendar.YEAR);

                                        String query4 = "INSERT INTO item (Item_Name,Price,Description,Item_Manufacturer,ItemPicture,Quantity_ordered,Quantity_left,Last_reorder_date,Item_ID,Cat_ID) "
                                                + "VALUES ('" + IName + "'," + Iprice + ",'" + IDes + "','" + IMan + "','" + Iimage + "'," + 0 + "," + 0 + ",'" + datecal + "','" + iTID + "','" + ICat + "')";

                                        //out1.println(query4);
                                        Connection c3 = DriverManager
                                                .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");
                                        Statement st3 = c3.createStatement();
                                        ResultSet rs3 = st3.executeQuery(query4);
                                        if (c3 != null) {
                                            c3.close();
                                        }

                                        out1.println("item inserted");
                                    } catch (Exception exc) {

                                        out1.println("Error detected");
                                    }


                                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div class=\"footer\">\n");
      out.write("                        <div class=\"left_footer\"> </div>\n");
      out.write("                        <div class=\"center_footer\"> \n");
      out.write("                            <a href=\"http://csscreme.com\"><img src=\"csscreme.jpg\" alt=\"csscreme\" border=\"0\" /></a><br />\n");
      out.write("                            <img src=\"payment.gif\" alt=\"\" /> </div>\n");
      out.write("                        <div class=\"right_footer\"> </div>\n");
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
