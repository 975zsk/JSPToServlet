package Servlet;import java.io.IOException;import java.io.PrintWriter;import javax.servlet.Servlet;import javax.servlet.ServletConfig;import javax.servlet.ServletException;import javax.servlet.ServletRequest;import javax.servlet.ServletResponse;import ServerContainer.MyServletResponse;public class Login implements Servlet {public void destroy() {}public ServletConfig getServletConfig() {return null;}public String getServletInfo() {return null;}public void init(ServletConfig arg0) throws ServletException {}public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {MyServletResponse res = (MyServletResponse) response;PrintWriter out = res.getWriter();out.println("<html><head><title>Login</title></head><body>    ");    if (request.getParameter("username") == null) {out.println("        <form action='?' method='get'><p>Your name: <input type='text' name='username'></p></form>    ");}else {out.println("        <p>Hello,  ");out.println(request.getParameter("username"));out.println(" !</p>    ");}out.println("</body></html>");out.close();   }}