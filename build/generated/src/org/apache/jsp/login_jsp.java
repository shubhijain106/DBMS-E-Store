package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <title>Electronix Store</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("        <!--[if IE 6]>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\n");
      out.write("        <![endif]-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/boxOver.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main_container\">\n");
      out.write("            <div class=\"top_bar\">\n");
      out.write("                <div class=\"top_search\">\n");
      out.write("                    <div class=\"search_text\"><a href=\"#\">Advanced Search</a></div>\n");
      out.write("                    <input type=\"text\" class=\"search_input\" name=\"search\" />\n");
      out.write("                    <input type=\"image\" src=\"search.gif\" class=\"search_bt\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"languages\">\n");
      out.write("                    <div class=\"lang_text\">Languages:</div>\n");
      out.write("                    <a href=\"#\" class=\"lang\"><img src=\"en.gif\" alt=\"\" border=\"0\" /></a> <a href=\"#\" class=\"lang\"><img src=\"de.gif\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\"> <a href=\"#\"><img src=\"logo.png\" alt=\"\" border=\"0\" width=\"237\" height=\"140\" /></a> </div>\n");
      out.write("                <div class=\"oferte_content\">\n");
      out.write("                    <div class=\"top_divider\"><img src=\"header_divider.png\" alt=\"\" width=\"1\" height=\"164\" /></div>\n");
      out.write("                    <div class=\"oferta\">\n");
      out.write("                        <div class=\"oferta_content\"> <img src=\"laptop.png\" width=\"94\" height=\"92\" alt=\"\" border=\"0\" class=\"oferta_img\" />\n");
      out.write("                            <div class=\"oferta_details\">\n");
      out.write("                                <div class=\"oferta_title\">Samsung GX 2004 LM</div>\n");
      out.write("                                <div class=\"oferta_text\"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>\n");
      out.write("                                <a href=\"details.html\" class=\"details\">details</a> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"oferta_pagination\"> <span class=\"current\">1</span> <a href=\"#\">2</a> <a href=\"#\">3</a> <a href=\"#\">4</a> <a href=\"#\">5</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"top_divider\"><img src=\"header_divider.png\" alt=\"\" width=\"1\" height=\"164\" /></div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end of oferte_content-->\n");
      out.write("            </div>\n");
      out.write("            <div id=\"main_content\">\n");
      out.write("                <div id=\"menu_tab\">\n");
      out.write("                    <div class=\"left_menu_corner\"></div>\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                        <li><a href=\"home.jsp\" class=\"nav1\"> Home</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\" class=\"nav2\">Products</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\" class=\"nav3\">Profile</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"registration.jsp\" class=\"nav4\">Sign Up</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\" class=\"nav5\">About</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"contact.html\" class=\"nav6\">Contact Us</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("                        <table cellpadding=\"5\" cellspacing=\"10\" align=\"center\">\n");
      out.write("                            <tr><td>Email </td><td><input id=\"username\" name=\"username\" value=\"\" type=\"text\" ></input></td></tr>\n");
      out.write("\n");
      out.write("                            <tr><td>Password</td><td><input id=\"password\" name=\"password\" value=\"\" type=\"password\" ></input></td></tr>\n");
      out.write("\n");
      out.write("                            <tr><td colspan =\"2\" align=\"center\"><input type=\"submit\" value=\"Login\" class=\"sign-in-button\"/></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"footer\">\n");
      out.write("                        <div class=\"left_footer\"> <img src=\"footer_logo.png\" alt=\"\" width=\"170\" height=\"49\"/> </div>\n");
      out.write("                        <div class=\"center_footer\"> Template name. All Rights Reserved 2008<br />\n");
      out.write("                            <a href=\"http://csscreme.com\"><img src=\"csscreme.jpg\" alt=\"csscreme\" border=\"0\" /></a><br />\n");
      out.write("                            <img src=\"payment.gif\" alt=\"\" /> </div>\n");
      out.write("                        <div class=\"right_footer\"> <a href=\"#\">home</a> <a href=\"#\">about</a> <a href=\"#\">sitemap</a> <a href=\"#\">rss</a> <a href=\"contact.html\">contact us</a> </div>\n");
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
