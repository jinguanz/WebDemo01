import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloX extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello X</title>");
		out.println("</head>");
		out.println("<body>");
		if (name == null) {
			out.println("<font size=\"+3\">");
			out.println("  <form action=\"HelloX\" method=\"GET\">");
			out
					.println("    Name: <input type=\"text\" size=\"40\" name=\"name\">");
			out.println("    <input type=\"submit\">");
			out.println("  </form>");
			out.println("</font>");
		} else {
			out.println("<h1>Hello, " + name + "!</h1>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
