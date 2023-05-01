package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005fLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Similarity Search for Encrypted Images in Secure Cloud Computing</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    \n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Abril+Fatface&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("\t<div id=\"colorlib-page\">\n");
      out.write("\t\t<a href=\"#\" class=\"js-colorlib-nav-toggle colorlib-nav-toggle\"><i></i></a>\n");
      out.write("\t\t\t\t<aside id=\"colorlib-aside\" role=\"complementary\" class=\"js-fullheight img\" style=\"background-image: url(images/cld1.jpg);\">\n");
      out.write("\t\t\t<h1 id=\"colorlib-logo\" class=\"mb-4\"><a href=\"index.html\"></a></h1>\n");
      out.write("\t\t\t<nav id=\"colorlib-main-menu\" role=\"navigation\">\n");
      out.write("                            <ul style=\"margin-top: -20px;\">\n");
      out.write("\t\t\t\t\t<li class=\"colorlib-active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"ownerlogin.jsp\">Data Owner</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"User_Login.jsp\">Data User</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"cloudlogin.jsp\">Cloud Server</a></li>\n");
      out.write("                                         <li><a href=\"index.html\">Logout</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"colorlib-footer\">\n");
      out.write("\t\t\t\t<div class=\"mb-4\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("            \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</aside> <!-- END COLORLIB-ASIDE -->\n");
      out.write("\t\t<div id=\"colorlib-main\">\n");
      out.write("\t\t<section class=\"ftco-section ftco-no-pt ftco-no-pb bg-light\">\n");
      out.write("\t    \t<div class=\"container px-0\">\n");
      out.write("\t    \t\t<div class=\"row no-gutters\">\n");
      out.write("\t\t                  <div class=\"text p-4\">\n");
      out.write("\t\t              <h3 class=\"mb-2\"><a href=\"#\"></a>Similarity Search for Encrypted Images in Secure Cloud Computing</h3>\n");
      out.write("\t\t\t\t<style>\n");
      out.write("      table{\n");
      out.write("          font-family: cambria;\n");
      out.write("          width: 50%;\n");
      out.write("          color: #e43c5c;\n");
      out.write("          margin-left: 25%;\n");
      out.write("          font-size: 20px;\n");
      out.write("      }\n");
      out.write("      tr,td{\n");
      out.write("          padding-bottom: 10px;\n");
      out.write("      }\n");
      out.write("     \n");
      out.write("  </style>\n");
      out.write("        <!-- Page Content  -->\n");
      out.write("        <div id=\"content\" class=\"p-4 p-md-5 pt-5\" >\n");
      out.write("       <h2 style=\"margin-top: 20px; color:maroon; margin-left: 250px;font-family: cambria;font-weight: bold; font-size: 30px;\">Data User Login</h2><br>\n");
      out.write("        <form action=\"User_Login_Action\" >\n");
      out.write("        <table>\n");
      out.write("          <tr><td><strong>Username: </strong></td><td><input type=\"text\" name=\"user\" style=\"border-radius: 2px;\" required></td></tr>\n");
      out.write("          <tr><td><strong>Password: </strong></td><td><input type=\"password\" name=\"pass\" required></td></tr>\n");
      out.write("          <tr><td align=\"center\" colspan=\"2\"><button type=\"submit\">LOGIN</button></td></tr>\n");
      out.write("         </table></form>\n");
      out.write("         <h1 style=\"font-family: cursive; font-size: 23px; color: red;margin-left: 200px; \">New Registration?<a href=\"Register1.jsp\" style=\"font-family: cursive; font-size: 28x;\">Click here</a></h1>\n");
      out.write("        </div>\n");
      out.write("\t\n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("\t\t              </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("\t    \t</div>\n");
      out.write("\t    </section>\n");
      out.write("\t\t</div><!-- END COLORLIB-MAIN -->\n");
      out.write("\t</div><!-- END COLORLIB-PAGE -->\n");
      out.write("\n");
      out.write("  <!-- loader -->\n");
      out.write("  <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("  <script src=\"js/popper.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("  <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("  <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("  <script src=\"js/aos.js\"></script>\n");
      out.write("  <script src=\"js/jquery.animateNumber.min.js\"></script>\n");
      out.write("  <script src=\"js/scrollax.min.js\"></script>\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("  <script src=\"js/google-map.js\"></script>\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
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
