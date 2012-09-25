import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Space extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Space Example</title>");
		out.println("</head>");
		out.println("<body>");
		DecimalFormat df = new DecimalFormat("#,###");
		out.println("  <h1>Current free space on the server is " +
				           df.format(getFreeSpace("/usr1")) + " bytes</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	private long getFreeSpace(String drive) {
		BufferedReader br = null;
		Process p = null;
		try {
			Runtime r = Runtime.getRuntime();
			p = r.exec("df "+drive);
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                	String line = br.readLine();
                	String lastLine = line;
                	while (line != null) {
                		lastLine = line;
                		line = br.readLine();
                	}
                	lastLine = lastLine.split("  *")[3];
                	long freeDiskSpace = Long.parseLong(lastLine)*1024;
                	return freeDiskSpace;
		} catch (IOException ex) {
			ex.printStackTrace();
			return -1;
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
 			return -1;
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) { /* Ignore */ }
			if (p == null) p.destroy();
		}
		
	}
	
}
