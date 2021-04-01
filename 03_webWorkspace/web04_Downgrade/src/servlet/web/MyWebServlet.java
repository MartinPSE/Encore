package servlet.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// J2SE SPEC 에서 --> WEB을 활용하기 위한 J2EE SPEC
// extends HttpServlet 을 해줘야지.

// xml기반으로 만들어서 --> WAS가 접근하기 쉬워진다.


public class MyWebServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<h2>Hello MyWebServlet</h2>");
		out.println("</body></html>");
		out.close();
		
		
		
		
	}

}
