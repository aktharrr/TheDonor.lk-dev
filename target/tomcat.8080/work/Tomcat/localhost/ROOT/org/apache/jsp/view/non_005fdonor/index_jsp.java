/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-03-12 20:35:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.non_005fdonor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.thedonorlk.Bean.ProfileBean;
import org.apache.commons.codec.binary.Base64;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.example.thedonorlk.Bean.ProfileBean");
    _jspx_imports_classes.add("org.apache.commons.codec.binary.Base64");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write('\n');
      out.write('\n');
      out.write('\n');

    if (session.getAttribute("username") == null || session.getAttribute("role").equals("donor")) {
        response.sendRedirect(request.getContextPath() + "/login.jsp");
    }
    Object role = session.getAttribute("role");
    Object user_id = session.getAttribute("user_id");
    Object bloodbank = session.getAttribute("bloodbank");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>TheDonor.lk</title>\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/public/css/styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/public/css/styles2.css\">\n");
      out.write("\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/public/scripts/scripts.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<!-- <input type=\"checkbox\" id=\"nav-toggle\"> -->\n");
      out.write("\n");
      out.write("<div class=\"sidebar\" id=\"sidebar\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("        <img src=\"");
      out.print(request.getContextPath());
      out.write("/public/images/Logo%20-%20White.png\" height=\"100px\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"sidebar-menu\">\n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/dashboard\" target=\"iframe\"><span\n");
      out.write("                        class=\"las la-tachometer-alt\"></span>\n");
      out.write("                    <span>Dashboard</span></a>\n");
      out.write("            </li>\n");
      out.write("            ");
 if (role.equals("admin") || role.equals("bloodbank") || role.equals("nurse") || role.equals("doctor")) { 
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/donation\" target=\"iframe\"><span\n");
      out.write("                        class=\"las la-tint\"></span>\n");
      out.write("                    <span>Donations</span></a>\n");
      out.write("            </li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            ");
 if (role.equals("admin") || role.equals("bloodbank") || role.equals("doctor") || role.equals("nurse")) { 
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/campaign\" target=\"iframe\"><span\n");
      out.write("                        class=\"las la-users\"></span>\n");
      out.write("                    <span>Campaigns</span></a>\n");
      out.write("            </li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            ");
 if (role.equals("admin") || role.equals("bloodbank") || role.equals("doctor") || role.equals("nurse")) { 
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/appointment\" target=\"iframe\"><span\n");
      out.write("                        class=\"las la-clipboard-list\"></span>\n");
      out.write("                    <span>Appointments</span></a>\n");
      out.write("            </li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            ");
 if (role.equals("admin") || role.equals("bloodbank") || role.equals("doctor") || role.equals("nurse")) { 
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/emergency\" target=\"iframe\"><span\n");
      out.write("                        class=\"las la-ambulance\"></span>\n");
      out.write("                    <span>Emergency Requirements</span></a>\n");
      out.write("            </li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\"><span class=\"las la-percentage\"></span>\n");
      out.write("                    <span>Blood Stock Management</span></a>\n");
      out.write("                <ul class=\"stock-show\">\n");
      out.write("                    ");
 if (role.equals("admin") || role.equals("bloodbank") || role.equals("doctor") || role.equals("nurse")) { 
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/bloodStock?bank=all\" target=\"iframe\"><span\n");
      out.write("                            class=\"las la-angle-right\"></span><span>Blood\n");
      out.write("                                    Stock</span></a></li>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
 if (role.equals("admin") || role.equals("bloodbank")) { 
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/bloodRequestSent\" target=\"iframe\"><span\n");
      out.write("                            class=\"las la-angle-right\"></span><span>\n");
      out.write("                                    Request Sent</span></a></li>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
 if (role.equals("admin") || role.equals("bloodbank")) { 
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/bloodRequestReceived\"\n");
      out.write("                           target=\"iframe\"><span class=\"las la-angle-right\"></span><span>\n");
      out.write("                                        Request Received</span></a></li>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
 if (role.equals("admin") || role.equals("bloodbank")) { 
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/bloodTransfer\" target=\"iframe\"><span\n");
      out.write("                            class=\"las la-angle-right\"></span><span>\n");
      out.write("                                    Transfer History</span></a></li>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");
 if (role.equals("admin") || role.equals("bloodbank") || role.equals("doctor") || role.equals("nurse")) { 
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/donor\" target=\"iframe\"><span\n");
      out.write("                        class=\"las la-user-tag\"></span>\n");
      out.write("                    <span>Donors</span></a>\n");
      out.write("            </li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            ");
 if (role.equals("admin") || role.equals("bloodbank")) { 
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\"><span class=\"las la-user-circle\"></span>\n");
      out.write("                    <span>System Users</span></a>\n");
      out.write("                <ul class=\"user-show\">\n");
      out.write("                    ");
 if (role.equals("admin")) { 
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/userBloodBank\" target=\"iframe\"><span\n");
      out.write("                            class=\"las la-angle-right\"></span><span>Blood Banks</span></a></li>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
 if (role.equals("admin") || role.equals("bloodbank")) { 
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/userDoctor\" target=\"iframe\"><span\n");
      out.write("                            class=\"las la-angle-right\"></span><span>Doctors</span></a></li>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
 if (role.equals("admin") || role.equals("bloodbank")) { 
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/userNurse\" target=\"iframe\"><span\n");
      out.write("                            class=\"las la-angle-right\"></span><span>Nurses</span></a></li>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
 if (role.equals("admin")) { 
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/userAdmin\" target=\"iframe\"><span\n");
      out.write("                            class=\"las la-angle-right\"></span><span>System\n");
      out.write("                                    Admins</span></a></li>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            ");
 if (role.equals("admin")) { 
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/violation\" target=\"iframe\"><span\n");
      out.write("                        class=\"fa fa-exclamation-triangle\"></span>\n");
      out.write("                    <span>Violation Report</span></a>\n");
      out.write("            </li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            <!-- <li>\n");
      out.write("                <a href=\"\"><span class=\"las la-cog\"></span>\n");
      out.write("                    <span>Settings</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"\"><span class=\"las la-sign-out-alt\"></span>\n");
      out.write("                    <span>Logout</span></a>\n");
      out.write("            </li> -->\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"main-content\" id=\"main-content\">\n");
      out.write("    <header id=\"header\">\n");
      out.write("        <h2>\n");
      out.write("            <label>\n");
      out.write("                <span class=\"las la-bars\" id=\"sidebar_btn\"></span>\n");
      out.write("            </label>\n");
      out.write("            ");
 if (!role.equals("admin")) { 
      out.write("\n");
      out.write("                ");
      out.print(session.getAttribute("bloodbank"));
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </h2>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/public/scripts/sidebar_button.js\"></script>\n");
      out.write("        <div class=\"dropdown\">\n");
      out.write("            <div class=\"user-wrapper\">\n");
      out.write("                ");
 ProfileBean profile = (ProfileBean) request.getAttribute("profile");
                    String base64Encoded=null;
                    if (profile.getImgBytes() != null) {
                        byte[] bytes = profile.getImgBytes();
                        byte[] encodeBase64 = Base64.encodeBase64(bytes);
                        base64Encoded = new String(encodeBase64, "UTF-8");
                    }
                
      out.write("\n");
      out.write("                <img src=\"data:image/jpeg;base64,");
      out.print(base64Encoded);
      out.write("\" onerror=\"this.src='");
      out.print(request.getContextPath());
      out.write("/public/images/no-profile.jpg'\"\n");
      out.write("                     style=\"width:40px;height:40px;\">\n");
      out.write("                <div>\n");
      out.write("                    <h4>");
      out.print(session.getAttribute("username"));
      out.write("\n");
      out.write("                    </h4>\n");
      out.write("                    <small>");
      out.print(role);
      out.write("\n");
      out.write("                    </small>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dropdown-content\">\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/nonDonorShowSettingForm?id=");
      out.print( user_id );
      out.write("&role=");
      out.print( role );
      out.write("\"\n");
      out.write("                   target=\"iframe\">Settings</a>\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/logout\">Logout</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <iframe id=\"icontent\" target=\"_self\" name=\"iframe\"\n");
      out.write("                scrolling=\"yes\" style=\"width:100%;height:99vh;border:none;\"></iframe>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
