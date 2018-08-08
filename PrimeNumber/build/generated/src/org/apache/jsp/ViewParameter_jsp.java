package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewParameter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Concert+One\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #ea9696;\n");
      out.write("            font-family: 'Concert One', cursive;\n");
      out.write("        }\n");
      out.write("        .btn span.glyphicon {    \t\t\t\n");
      out.write("\topacity: 0;\t\t\t\t\n");
      out.write("        }\n");
      out.write("        .btn.active span.glyphicon {\t\t\t\t\n");
      out.write("                opacity: 1;\t\t\t\t\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-6 mx-auto bg-light rounded-100 mt-5 p-5\">\n");
      out.write("            <h1 class=\"text-center\">:: Favorite subject ::</h1>\n");
      out.write("            <form action=\"TestRequestParam\" method=\"post\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-6 input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <span class=\"input-group-text\">Student ID:</span>\n");
      out.write("                            </div>\n");
      out.write("                            <input class=\"col form-control\" type=\"text\" name=\"id\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-6 input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <span class=\"input-group-text\">Name:</span>\n");
      out.write("                            </div>\n");
      out.write("                            <input class=\"col form-control\" type=\"text\" name=\"name\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"m-3\">\n");
      out.write("                Favorite subject:\n");
      out.write("                    <div class=\"custom-control custom-checkbox\">\n");
      out.write("                        <!--<label class=\"custom-control-label\" for=\"customCheck1\">-->\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck1\" value=\"Web Programming\">\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customCheck1\">Web Programming</label><br>\n");
      out.write("<!--                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck2\" value=\"Computer Network\">\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customCheck2\">Computer Network</label><br>\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck3\" value=\"Network Programming\">\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customCheck3\">Network Programming</label><br>\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck4\" value=\"Database Administrator\">\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customCheck4\">Database Administrator</label><br>\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck5\" value=\"Computer Security\">\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customCheck5\">Computer Security</label><br>\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck6\" value=\"Software Process\">\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customCheck6\">Software Process</label><br>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\"/>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Student ID :</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Student Name :</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Your Favorite subject :</td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjectList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("str");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${str}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
