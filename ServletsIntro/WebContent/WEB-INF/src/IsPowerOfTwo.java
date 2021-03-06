import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IsPowerOfTwo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String numStr = request.getParameter("num");

		out.println("<html>");
		out.println("<head>");
		out.println("<title>IsPowerOfTwo</title>");
		out.println("</head>");
		out.println("<body>");

		if (numStr != null) {
			try {
				long num = Long.parseLong(numStr);
				out.println("<h2>" + num + " is");
				if (!isPowerOfTwo(num))
					out.println("<font color=\"red\">NOT</font>");
				out.println(" a power of two.</h2>");
			} catch (NumberFormatException e) {
				out.println("<h2><font color=\"red\">\"" + numStr
						+ "\" is not a number!</font></h2>");
			}
		}

		out.println("<font size=\"+3\">");
		out.println("  <form action=\"IsPowerOfTwo\" method=\"GET\">");
		if (numStr != null)
			out.println("    Another");
		out.println("    Number Please: <input type=text size=20 name=num>");
		out.println("    <input type=submit value=\"Is It a Power of Two?\">");
		out.println("  </form>");
		out.println("</font>");
		out.println("</body>");
		out.println("</html>");
	}

	private boolean isPowerOfTwo(long x) {
		System.out.println("isPowerOfTwo(" + x + ") called.");
		return ((x & (x - 1)) == 0 && x > 0);
	}
}
