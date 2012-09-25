import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Time extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Time Example</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("  <h1>Current time in milliseconds is " +
				           System.currentTimeMillis() + "</h1>");
		out.println("  <hr/>");
		java.util.Date d = new java.util.Date();
		out.println("  <h1>The local time is "+d+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
