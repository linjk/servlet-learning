package cn.linjk.pro20181218.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet implements Servlet {

    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String servletName = servletConfig.getServletName();
        String canCallUser = servletConfig.getInitParameter("user");
        if (canCallUser.equals("linjk")) {
            System.out.println("用户" + canCallUser + "可以调用该Servlet");
        }
        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.print("<html><head></head>" + "<body>Hello from "+ servletName + "</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "MyServlet";
    }

    @Override
    public void destroy() {

    }
}