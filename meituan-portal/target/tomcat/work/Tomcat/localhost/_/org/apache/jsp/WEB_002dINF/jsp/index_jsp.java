/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-15 13:29:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>越秀区仲恺农业工程学院(海珠校区)附近外卖送餐网站_电话-美团外卖</title>\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/index.css\"/>\r\n");
      out.write("\t\t<script src=\"/js/ajax.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script src=\"/js/index.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script src=\"/js/jquery-1.6.4.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script src=\"/js/jquery.cookie.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<!--页面头部分-->\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div class=\"top-nav banxin\">\r\n");
      out.write("\t\t\t\t<div class=\"top-left\">\r\n");
      out.write("\t\t\t\t\t<span class=\"addressimg\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"address\">越秀区&nbsp;&nbsp;仲恺农业工程学院(海珠校区)</span>\r\n");
      out.write("\t\t\t\t\t<i>丨</i>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">切换地址</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"top-right\">\r\n");
      out.write("\t\t\t\t\t<span id=\"name\"><span id=\"uname\"></span> <span id=\"down\">▼</span>\r\n");
      out.write("\t\t\t\t\t<div id=\"xialikuang\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">我的订单</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">我的收藏</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" onclick=\"exit();\">退出</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<a href=\"register.html\" class=\"register\" id=\"register\">注册</a>\r\n");
      out.write("\t\t\t\t\t<i id=\"fenge\">丨</i>\r\n");
      out.write("\t\t\t\t\t<a href=\"login.html\" class=\"login\" id=\"login\">登录</a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"mobileVer\">&nbsp;手机版</a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"meituanwang\">&nbsp;美团网</a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"contact\">&nbsp;联系我们</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<!--页面头部分结束-->\r\n");
      out.write("\t\t<!--导航栏部分开始-->\r\n");
      out.write("\t\t<div class=\"nav\">\r\n");
      out.write("\t\t\t<div class=\"nav-in banxin\">\r\n");
      out.write("\t\t\t\t<!--logo部分-->\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img src=\"/images/logo.png\" height=\"42px\" title=\"美团外卖\"/></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--小导航栏部分-->\r\n");
      out.write("\t\t\t\t<ul class=\"navitem\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">我的订单</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">入驻加盟</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!--搜索框部分-->\r\n");
      out.write("\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"\" id=\"\" placeholder=\"搜索商家、美食\" />\r\n");
      out.write("\t\t\t\t\t<button><span></span></button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--导航栏部分结束-->\r\n");
      out.write("\t\t<!--分类二部分开始-->\r\n");
      out.write("\t\t<div class=\"sort2 banxin\">\r\n");
      out.write("\t\t\t<ul id=\"ul\">\r\n");
      out.write("\t\t\t\t<li ><img src=\"/images/icon_sort2.png\"/>商家分类</li>\r\n");
      out.write("\t\t\t\t<li class=\"selected\" ><a href=\"javascript:void(0);\" id=\"\" onclick=\"f(this.id)\" >全部</a></li>\r\n");
      out.write("\t\t\t\t<li ><a href=\"javascript:void(0);\" id=\"meishi\" onclick=\"f(this.id)\" >美食</a></li>\r\n");
      out.write("\t\t\t\t<li ><a href=\"javascript:void(0);\" id=\"zhengcan\" onclick=\"f(this.id)\">正餐优选</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\" id=\"chaoshi\" onclick=\"f(this.id)\">超市</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\" id=\"xiaochi\" onclick=\"f(this.id)\">精选小吃</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\" id=\"xianguo\" onclick=\"f(this.id)\">鲜果购</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\" id=\"xiawu\" onclick=\"f(this.id)\">下午茶</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\" id=\"yaopin\" onclick=\"f(this.id)\">药品</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--分类二部分结束-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--主体部分-->\r\n");
      out.write("\t\t<div class=\"banner banxin\" id=\"banner\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"loadmore banxin\"  id=\"\" onclick=\"add(this.id);\">\r\n");
      out.write("\t\t\t点击加载更多商家\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--主体部分结束-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--页面底部分开始-->\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<div class=\"footer-in banxin\">\r\n");
      out.write("\t\t\t\t<ul class=\"col1\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">开店申请</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">配送加盟</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">城市代理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">零售加盟</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"col1\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">开放平台</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">关于美团</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">媒体报道</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">平台制度</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"col1\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">常见问题</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">用户举报</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">诚信举报</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">加入我们</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"telephone\">\r\n");
      out.write("\t\t\t\t\t<h4>1010-9777</h4>\r\n");
      out.write("\t\t\t\t\t<p>周一至周日 9:00-23:00<br />\r\n");
      out.write("\t\t\t\t\t\t客服不受理商务合作</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"erweima\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/images/erweima_07.png\"/>\r\n");
      out.write("\t\t\t\t\t<h4>小程序下单</h4>\r\n");
      out.write("\t\t\t\t\t<p>更多商家，更多优惠</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t<!--页面底部分结束-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--版权信息-->\r\n");
      out.write("\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"/images/bq_16.png\"/></a>\r\n");
      out.write("\t\t\t<span>&copy;2015 meituan.com 京ICP证070791号 京公网安备11010502025545号</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--版权信息结束-->\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tvar MT=MEITUAN={\r\n");
      out.write("\t\t\tcheckLogin:function(){\r\n");
      out.write("\t\t\t\tvar _ticket= $.cookie(\"MT_TOKEN\");\r\n");
      out.write("\t\t\t\tif(!_ticket){\r\n");
      out.write("\t\t\t\t\treturn ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\t\t\turl:\"/token/\"+_ticket,\r\n");
      out.write("\t\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\t\tasync:true,\r\n");
      out.write("\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\tif(data.status==200){\r\n");
      out.write("\t\t\t\t\t\t\tvar username=data.data.username;\r\n");
      out.write("\t\t\t\t\t\t\tvar html=username;\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#uname\").html(html);\r\n");
      out.write("\t\t\t\t\t\t\tvar name=document.getElementById(\"name\");\r\n");
      out.write("\t\t\t\t\t\t\tvar register=document.getElementById(\"register\");\r\n");
      out.write("\t\t\t\t\t\t\tvar fenge=document.getElementById(\"fenge\");\r\n");
      out.write("\t\t\t\t\t\t\tvar login=document.getElementById(\"login\");\r\n");
      out.write("\t\t\t\t\t\t\tvar down=document.getElementById(\"down\");\r\n");
      out.write("\t\t\t\t\t\t\tdown.style.visibility=\"visible\";\r\n");
      out.write("\t\t\t\t\t\t\tname.style.visibility=\"visible\";\r\n");
      out.write("\t\t\t\t\t\t\tregister.style.visibility=\"hidden\";\r\n");
      out.write("\t\t\t\t\t\t\tfenge.style.visibility=\"hidden\";\r\n");
      out.write("\t\t\t\t\t\t\tlogin.style.visibility=\"hidden\";\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tMT.checkLogin();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfunction exit(){\r\n");
      out.write("\t\t\t\t\t\tvar name=document.getElementById(\"name\");\r\n");
      out.write("\t\t\t\t\t\t\tvar register=document.getElementById(\"register\");\r\n");
      out.write("\t\t\t\t\t\t\tvar fenge=document.getElementById(\"fenge\");\r\n");
      out.write("\t\t\t\t\t\t\tvar login=document.getElementById(\"login\");\r\n");
      out.write("\t\t\t\t\t\t\tvar down=document.getElementById(\"down\");\r\n");
      out.write("\t\t\t\t\t\t\tdown.style.visibility=\"hidden\";\r\n");
      out.write("\t\t\t\t\t\t\tname.style.visibility=\"hidden\";\r\n");
      out.write("\t\t\t\t\t\t\tregister.style.visibility=\"visible\";\r\n");
      out.write("\t\t\t\t\t\t\tfenge.style.visibility=\"visible\";\r\n");
      out.write("\t\t\t\t\t\t\tlogin.style.visibility=\"visible\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
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
