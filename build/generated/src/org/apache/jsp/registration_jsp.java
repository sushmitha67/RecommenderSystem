package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title></title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("       \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom-styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/component.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome-ie7.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"js/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("                <div class=\"site-header\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                     <!-- Site Name starts here -->\n");
      out.write("\n");
      out.write("                    <div class=\"site-name\">\n");
      out.write("                        <h1><font color=\"white\">Job Recommendation System</font></h1>\n");
      out.write("                        <!--<h5>your caption goes here</h5>-->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Site Name ends -->\n");
      out.write("\n");
      out.write("                     <!-- Menu starts here -->\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("                        <div class=\"navbar\">\n");
      out.write("                            <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("                               <i class=\"fw-icon-th-list\"></i>\n");
      out.write("                            </a>\n");
      out.write("                           <div class=\"nav-collapse collapse\">\n");
      out.write("                                <ul class=\"nav\">\n");
      out.write("                                     \n");
      out.write("                                    <li ><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                   <li class=\"active\"><a href=\"registration.jsp\">Registration</a></li>\n");
      out.write("                                   \n");
      out.write("                                    </ul>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Menu ends -->\n");
      out.write("                   \n");
      out.write("       \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Banner starts here -->\n");
      out.write("\n");
      out.write("             <div class=\"banner\">\n");
      out.write("                  \n");
      out.write("                   <!-- <div class=\"carousel slide\" id=\"myCarousel\">-->\n");
      out.write("                                    <!-- Carousel items -->\n");
      out.write("                       <div class=\"carousel-inner\">\n");
      out.write("                             \n");
      out.write("                            <div class=\"item active\">\n");
      out.write("                               \n");
      out.write("                                <img src=\"img/banner-image.jpg\" alt=\"\">\n");
      out.write("                               \n");
      out.write("                                <div class=\"carousel-caption\">\n");
      out.write("                                      ");
 String reg = "";
            if (session.getAttribute("msg") != null) {
                reg = session.getAttribute("msg").toString();
}

      out.write("        \n");
      out.write("        \n");
      out.write("                               \n");
      out.write("                                    \n");
      out.write("                               \n");
      out.write("                                  <h1>Registration</h1>\n");
      out.write("                                  <form action=\"./registration\" method=\"post\">\n");
      out.write("                                      <table>\n");
      out.write("                                          <tr>\n");
      out.write("                                              <td>Name</td><td><input type=\"text\" name=\"name\" id=\"name\"/></td>\n");
      out.write("                                          </tr>\n");
      out.write("                                          <tr>\n");
      out.write("                                              <td>Email</td><td><input type=\"text\" name=\"email\" id=\"email\"/></td>\n");
      out.write("                                          </tr>\n");
      out.write("                                          <tr>\n");
      out.write("                                              <td>Mobile</td><td><input type=\"text\" name=\"mob\" id=\"mob\"/></td>\n");
      out.write("                                          </tr>\n");
      out.write("                                          <tr>\n");
      out.write("                                              <td>Password</td><td><input type=\"password\" name=\"pass\" id=\"pass\"/></td>\n");
      out.write("                                          </tr>\n");
      out.write("                                          <tr>\n");
      out.write("                                              <td>Confirm Password</td><td><input type=\"password\" name=\"cpass\" id=\"cpass\"/></td>\n");
      out.write("                                          </tr>\n");
      out.write("                                          <tr>\n");
      out.write("                                              <td></td><td><input type=\"submit\" name=\"submit\" value=\"Register\"/></td>\n");
      out.write("                                          </tr>\n");
      out.write("                                      </table>\n");
      out.write("                                      \n");
      out.write("                                  </form>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                      <div class=\"carousel-inner\">\n");
      out.write("                          <div class=\"item active\">\n");
      out.write("                             \n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"carousel-control left\" href=\"#myCarousel1\" data-slide=\"prev\"><i class=\"fw-icon-chevron-left\"></i></a>\n");
      out.write("                        <a class=\"carousel-control right\" href=\"#myCarousel1\" data-slide=\"next\"><i class=\"fw-icon-chevron-right\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("                                    \n");
      out.write("       <script src=\"js/jquery-1.9.1.js\"></script> \n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("<script src=\"js/masonry.pkgd.min.js\"></script>\n");
      out.write("    <script src=\"js/imagesloaded.js\"></script>\n");
      out.write("    <script src=\"js/classie.js\"></script>\n");
      out.write("    <script src=\"js/AnimOnScroll.js\"></script>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("      new AnimOnScroll( document.getElementById( 'grid' ), {\n");
      out.write("        minDuration : 0.4,\n");
      out.write("        maxDuration : 0.7,\n");
      out.write("        viewportFactor : 0.2\n");
      out.write("      } );\n");
      out.write("    </script>\n");
      out.write("<script>\n");
      out.write("$('#myCarousel').carousel({\n");
      out.write("    interval: 1800\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   </body>\n");
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
