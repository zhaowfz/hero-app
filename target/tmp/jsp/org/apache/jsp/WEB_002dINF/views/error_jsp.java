package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"zh\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\"/>\r\n");
      out.write("\r\n");
      out.write("  <title>伟夫子 官方网站</title>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  var _hmt = _hmt || [];\r\n");
      out.write("  (function() {\r\n");
      out.write("    var hm = document.createElement(\"script\");\r\n");
      out.write("    hm.src = \"/my-jquery-plug/sky-special-effects/hm.js\";\r\n");
      out.write("    var s = document.getElementsByTagName(\"script\")[0];\r\n");
      out.write("    s.parentNode.insertBefore(hm, s);\r\n");
      out.write("  })();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"center-block\" style=\"width:200px\">\r\n");
      out.write("      人未尽,杯莫停.\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- jQuery (Bootstrap 插件需要引入) -->\r\n");
      out.write("  <script src=\"/my-jquery-plug/js/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("  <!-- 包含了所有编译插件 -->\r\n");
      out.write("  <script src=\"/bootstrap3/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" color=\"102,185,255\" zIndex=\"-10\" opacity=\"50\" count=\"99\" src=\"/my-jquery-plug/sky-special-effects/canvas-nest.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/bootstrap3/dist/css/bootstrap.min.css\">\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<main>\r\n");
      out.write("  <div class=\"progress\">\r\n");
      out.write("    <div class=\"progress-bar progress-bar-success\" role=\"progressbar\"\r\n");
      out.write("         aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\"\r\n");
      out.write("         style=\"width: 100%;\">\r\n");
      out.write("      <span class=\"sr-only\">100%</span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <img src=\"/img/error.jpg\" alt=\"出错了\" class=\"center-block\" style=\"border-image-repeat: round;width: 40%;height: 40%\"/>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
