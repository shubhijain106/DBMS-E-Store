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

public final class adminOrderProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
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
      out.write("\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\"> <a href=\"#\"><img src=\"ELECTRONICS_LOGO_1.gif\"  alt=\"\" border=\"0\" width=\"237\" height=\"140\" /></a> </div>\n");
      out.write("                <!-- end of oferte_content-->\n");
      out.write("            </div>\n");
      out.write("            <div id=\"main_content\">\n");
      out.write("                <div id=\"menu_tab\">\n");
      out.write("                    <div class=\"left_menu_corner\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"c\">\n");
      out.write("                        <h4>Order Product: </h4>\n");
      out.write("                        \n");
      out.write("                        <table width=\"59%\" border=\"2\">\n");
      out.write("                            <tr><td>Index</td><td>Item Name</td>\n");
      out.write("                                <td>Item Category</td>\n");
      out.write("                                <td>Item Price</td>\n");
      out.write("                                <td>Item Manufacture</td>\n");
      out.write("                                <td>Item Last Order date</td>\n");
      out.write("                                <td>quantity Left</td>\n");
      out.write("                                <td>Reorder Amount</td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                                <tr><td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(   rs.getString("Item_Name"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(   rs.getString("CName"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(   rs.getString("Price"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(   rs.getString("Item_Manufacturer"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(   rs.getString("Last_reorder_date"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(   rs.getString("Qleft"));
      out.write("</td>\n");
      out.write("                                    <td><a href=");
      out.print("\"adminorderRedir.jsp?Id="+itemid+"\"");
      out.write(">Reorder</a></td>\n");
      out.write("                              \n");
      out.write("                                </tr>\n");
      out.write("                            \n");
      out.write("                            ");
i++;
                                }if (c != null) {c.close();
                                }
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
