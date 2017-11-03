package web.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class A extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ServletContext sctx=getServletContext();
		
		sctx.setAttribute("userlist","≤‚ ‘1£¨≤‚ ‘2");

		String company=sctx.getInitParameter("listenerParam");
		out.println(company);
		
		out.close();

	}

}

