package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpFormServlet
 */
@WebServlet("/FormServlet")
public class HttpFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. Ŭ���̾�Ʈ Form ���� �޴´�.
		String name = request.getParameter("name"); // String ���� Form�� �̸��� ����.
		String addr = request.getParameter("address"); //
		
		// 2. ���� ���� DB���� �� �����ߴ� ! �����ϰ�
		// 3. �ٽ� ȭ������ (���� == response ) ���
		// name Hello!
		
		PrintWriter out =  response.getWriter();
		out.println("<html><body><h3>"); // ȭ�鿡 ����ϱ� ���ؼ�, html�� �־�����Ѵ�.
		out.println("Your Name Information...</h3><br>");
		out.println("<li> Your name is : "+name);
		out.println("</li></body></html>");
		out.close();
		
		
		
		
		
		
	}

}
