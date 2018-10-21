package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class display_005fdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Job Recommendation System</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.3.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/arial.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cuf_run.js\"></script>\n");
      out.write("<script>\n");
      out.write("    function validate(){\n");
      out.write("     \n");
      out.write("        var userid=document.getElementById(\"userid\").value;\n");
      out.write("        var password=document.getElementById(\"password\").value;\n");
      out.write("        if(userid==\"\"){\n");
      out.write("            \n");
      out.write("            alert(\"Enter userid\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("         if(password==\"\"){\n");
      out.write("            \n");
      out.write("            alert(\"Enter password\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(password.length<6){\n");
      out.write("            \n");
      out.write("            alert(\"Icorrect Password\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("       ");

        String login="",reg_msg="";
        if(session.getAttribute("login")!=null){
        
            login=session.getAttribute("login").toString();
        }
          if(session.getAttribute("reg_msg")!=null){
        
            reg_msg=session.getAttribute("reg_msg").toString();
        }


      out.write("\n");
      out.write("    \n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"main_resize\">\n");
      out.write("    <div class=\"header\">\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"#\">Job Recommendation System</a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"search\">\n");
      out.write("    \n");
      out.write("        <!--/searchform -->\n");
      out.write("        <div class=\"clr\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\">\n");
      out.write("        <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"update_dataset.jsp\">Update Dataset</a></li>\n");
      out.write("       \n");
      out.write("        </ul>\n");
      out.write("        <div class=\"clr\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"hbg\"> Matching Companies and Position:</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("   ");

        
        String data=session.getAttribute("data").toString();
        
        
      out.write("\n");
      out.write("   <textarea name=\"disp\" cols=\"100\" rows=\"100\" >");
      out.print(data);
      out.write("</textarea>\n");
      out.write("      <div class=\"content_bg\">\n");
      out.write("          <div class=\"mainbar\" style=\"margin-left: 186px;\">\n");
      out.write("          <div class=\"article\">\n");
      out.write("\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write(" \n");
      out.write(" \n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            <p></p>\n");
      out.write("          \n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"article\">\n");
      out.write("            <h2></h2>\n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("            <p class=\"post-data\"></p>\n");
      out.write("           <div class=\"clr\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"pagenavi\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("          <div class=\"gadget\">\n");
      out.write("            <h2 class=\"star\"></h2>\n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("            <ul class=\"sb_menu\">\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("          <div class=\"gadget\">\n");
      out.write("            <h2 class=\"star\"></h2>\n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("        \n");
      out.write("          </div>\n");
      out.write("          <div class=\"gadget\">\n");
      out.write("            <h2 class=\"star\"></h2>\n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("            <div class=\"testi\">\n");
      out.write("              <p></p>\n");
      out.write("              <p class=\"title\"></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clr\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"fbg\">\n");
      out.write("    <div class=\"fbg_resize\">\n");
      out.write("      <div class=\"col c1\">\n");
      out.write("        <h2></h2>\n");
      out.write("         </div>\n");
      out.write("     \n");
      out.write("        ");
 session.removeAttribute("login"); 
      out.write("\n");
      out.write("        ");
 session.removeAttribute("reg_msg"); 
      out.write("\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
