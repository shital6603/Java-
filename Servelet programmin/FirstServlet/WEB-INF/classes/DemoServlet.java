import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResposne response) 
	                     throws ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Hello Readers</h1>");
		out.println("</body></html>");
	}
}
