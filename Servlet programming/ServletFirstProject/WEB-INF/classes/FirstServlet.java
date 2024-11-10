import jakarta.servlet.*;
import java.io.*;

public class FirstServlet extends GenericServlet {

    public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
        PrintWriter pw = res.getWriter();
        pw.println("Chin tapak dum dum");
        pw.close();
    }
    @Override
    public void init() {

    }
    @Override
    public void destroy() {

    }
}