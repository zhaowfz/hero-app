package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class good_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/bootstrap3/dist/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"/my-jquery-plug/date-special-effects/css/jquery.range.css\" />\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"/my-jquery-plug/date-special-effects/css/css.css\" />\r\n");
      out.write("    <script type=\"application/javascript\" src=\"/my-jquery-plug/js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("    <script type=\"application/javascript\" src=\"/bootstrap3/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"application/javascript\" src=\"/my-jquery-plug/date-special-effects/js/jquery.range.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"time clearfix\">\r\n");
      out.write("       <div class=\"btn-group year_group fl\">\r\n");
      out.write("           <button data-toggle=\"dropdown\" class=\"btn dropdown-toggle\" type=\"button\">\r\n");
      out.write("               <span id=\"year\">2017年</span><i class=\"caret\"></i>\r\n");
      out.write("           </button>\r\n");
      out.write("           <ul class=\"dropdown-menu\">\r\n");
      out.write("               <li><a href=\"#\">2021年</a></li>\r\n");
      out.write("               <li><a href=\"#\">2020年</a></li>\r\n");
      out.write("               <li><a href=\"#\">2019年</a></li>\r\n");
      out.write("               <li><a href=\"#\">2018年</a></li>\r\n");
      out.write("               <li><a href=\"#\">2017年</a></li>\r\n");
      out.write("               <li><a href=\"#\">2016年</a></li>\r\n");
      out.write("               <li><a href=\"#\">2015年</a></li>\r\n");
      out.write("           </ul>\r\n");
      out.write("       </div>\r\n");
      out.write("       <div class=\"btn-group mon_group fl\">\r\n");
      out.write("           <button data-toggle=\"dropdown\" class=\"btn dropdown-toggle\" type=\"button\">\r\n");
      out.write("               <span id=\"month\">5月</span><i class=\"caret\"></i>\r\n");
      out.write("           </button>\r\n");
      out.write("           <ul class=\"dropdown-menu\">\r\n");
      out.write("               <li><a href=\"#\">1月</a></li>\r\n");
      out.write("               <li><a href=\"#\">2月</a></li>\r\n");
      out.write("               <li><a href=\"#\">3月</a></li>\r\n");
      out.write("               <li><a href=\"#\">4月</a></li>\r\n");
      out.write("               <li><a href=\"#\">5月</a></li>\r\n");
      out.write("               <li><a href=\"#\">6月</a></li>\r\n");
      out.write("               <li><a href=\"#\">7月</a></li>\r\n");
      out.write("               <li><a href=\"#\">8月</a></li>\r\n");
      out.write("               <li><a href=\"#\">9月</a></li>\r\n");
      out.write("               <li><a href=\"#\">10月</a></li>\r\n");
      out.write("               <li><a href=\"#\">11月</a></li>\r\n");
      out.write("               <li><a href=\"#\">12月</a></li>\r\n");
      out.write("           </ul>\r\n");
      out.write("       </div>\r\n");
      out.write("       <div class=\"demo fl\">\r\n");
      out.write("           <input type=\"hidden\" value=\"\" class=\"single-slider none\">\r\n");
      out.write("       </div>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <script type=\"application/javascript\">\r\n");
      out.write("       $(document).ready(function(){\r\n");
      out.write("           // 下拉选择框\r\n");
      out.write("           $('.dropdown-menu li').click(function(){\r\n");
      out.write("               var txt=$(this).text();\r\n");
      out.write("               $(this).parent().prev().find('span').eq(0).text(txt);\r\n");
      out.write("           })\r\n");
      out.write("\r\n");
      out.write("           changeY();\r\n");
      out.write("           $('.dropdown-menu li').click(function(){\r\n");
      out.write("               var name=$('a',this).text();\r\n");
      out.write("               $(this).parents('.btn-group').find('.dropdown-toggle span').text(name);\r\n");
      out.write("               changeY();\r\n");
      out.write("           })\r\n");
      out.write("\r\n");
      out.write("           function changeY(){\r\n");
      out.write("               var year=$('#year').text().replace(/[^0-9]/ig,\"\")\r\n");
      out.write("               var month=$('#month').text().replace(/[^0-9]/ig,\"\")\r\n");
      out.write("               var days=totalDays(year, month);\r\n");
      out.write("               var dayArr=[];\r\n");
      out.write("               for(var i=1;i<=days;i++)\r\n");
      out.write("               {\r\n");
      out.write("                   dayArr.push(i+'号');\r\n");
      out.write("               }\r\n");
      out.write("               var last=parseInt(dayArr[dayArr.length-1]);\r\n");
      out.write("               $('.demo').children().remove();\r\n");
      out.write("               var div='<input type=\"hidden\" value=\"\" class=\"single-slider none\">';\r\n");
      out.write("               $('.demo').html(div)\r\n");
      out.write("               //\r\n");
      out.write("               $('.single-slider').jRange({\r\n");
      out.write("                   from:1,\r\n");
      out.write("                   to:last,\r\n");
      out.write("                   step: 1,\r\n");
      out.write("                   scale: dayArr,\r\n");
      out.write("                   format: '%s',\r\n");
      out.write("                   width:850,\r\n");
      out.write("                   showLabels: true,\r\n");
      out.write("                   snap: true\r\n");
      out.write("               });\r\n");
      out.write("           }\r\n");
      out.write("\r\n");
      out.write("           //一个月的总天数\r\n");
      out.write("           function totalDays(years,months){\r\n");
      out.write("               var d = new Date(years, months, 0);\r\n");
      out.write("               return d.getDate();\r\n");
      out.write("           }\r\n");
      out.write("       })\r\n");
      out.write("   </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
