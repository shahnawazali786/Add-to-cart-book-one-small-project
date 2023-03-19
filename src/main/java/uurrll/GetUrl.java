package uurrll;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/get")
public class GetUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
			PrintWriter pw=response.getWriter();
			String s1=request.getParameter("b1");
			String s2=request.getParameter("b2");
			String s3=request.getParameter("b3");
			pw.println("<html><body bgcolor=yellow text=blue>");
			pw.println("<h1>Selected Books:</h1>");
			if(!(s1.equals("null")))
			{
			pw.println(s1);
			}
			if(!(s2.equals("null")))
			{
				pw.println(s2);
				}
				if(!(s3.equals("null")))
				{
				pw.println(s3);
				}
				pw.println("</body></html>");
				}
				}