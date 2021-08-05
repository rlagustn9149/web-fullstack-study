package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifecycleServlet")
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LifecycleServlet() {
        super();
        System.out.println("라이프사이클 생성");
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init test 호출");
	}


	public void destroy() {
		System.out.println("디스트로이 호출");
	}


	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		out.println("<form method='post' action='/firstweb/LifecycleServlet'>");
		out.println("name : <input type='text' name='name'><br>");
		out.println("<input type='submit' value='ok'><br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html ");
		PrintWriter out=response.getWriter();
		String name = request.getParameter("name");
		out.println("<h1> hello " +name +"</h1>");
		out.close();
	}


//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("service 호출");
//
//	}

}
