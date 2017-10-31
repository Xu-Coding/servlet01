package web.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterServletDemo1 extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		System.out.println("FilterServletDemo1 service begin...");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		String words=request.getParameter("words");
		out.println("your idea is:"+words);
		//out.close();
		System.out.println("FilterServletDemo1 service end...");
		
		
	}
	
}
