import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import jakarta.servlet.http.HttpServletResponse;

public class HelloWorldmextends HttpServlet
{

    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<html><head><title>");
        out.println("HelloWorld!");
        out.println("")
    }
}