/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-01 00:31:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("\t\t<title>登录&nbsp;丨肥肥外卖</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/login.css\"/>\r\n");
      out.write("\t\t<script src=\"/js/login.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" \t\t\t<!--登录页面logo-->\r\n");
      out.write("\t\t\t<div class=\"logo banxin\">\r\n");
      out.write("\t\t\t\t<a href=\"index.html\"><img src=\"/images/logo_03.png\"/></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--主体部分-->\r\n");
      out.write("\t\t\t<div class=\"main banxin\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<img src=\"/images/delogo.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t<div class=\"login\">\r\n");
      out.write("\t\t\t\t\t<p class=\"zi\">美团外卖</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\" id=\"info\"></div>\r\n");
      out.write("\t\t\t\t\t<span class=\"user\"></span>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"username\" placeholder=\"手机号/用户名/邮箱\"/><br />\r\n");
      out.write("\t\t\t\t\t<span class=\"lock\"></span>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\" placeholder=\"密码\"/>\r\n");
      out.write("\t\t\t\t\t<p ><a href=\"#\" class=\"forget\">忘记密码</a></p>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"登录\" id=\"btn\" />\r\n");
      out.write("\t\t\t\t\t<p class=\"no\">还没有账号？ <a href=\"#\">免费注册</a></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}