package uurrll;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/set")

public class SetUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
			String s1=request.getParameter("book1");
			String s2=request.getParameter("book2");
			String s3=request.getParameter("book3");
			PrintWriter pw=response.getWriter();
			pw.println("<html><body bgcolor=cyan text=red>");
			pw.println("<h1>Your Books Are Added To Cart</h1>");
			pw.println("<a href=get?b1="+s1+"&b2="+s2+"&b3="+s3+">Next</a>");

			pw.println("</body></html>");
			}
			}