package app.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("============== ADD SERVLET INIT ==============");
        System.out.println("Servlet Name: " + getServletName());
        System.out.println("Servlet Config: " + getServletConfig());
        System.out.println("==============================================");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter writer = resp.getWriter();
        writer.println("Method GET from AddServlet");
    }
}
