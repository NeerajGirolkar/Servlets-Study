import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println("<html>" +
						"<body>" +
							"<h1 align=center> Beer Servlet </h1>" +
							"<br>" + today +
						"</body>" +
					"</html>");
	}
}