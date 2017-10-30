package web.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookieServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		Cookie cookie=new Cookie("username","King");
		response.addCookie(cookie);
		
		Cookie cookie2=new Cookie("city","beijing");
		response.addCookie(cookie2);
		
		out.println("successed add cookie!");
		out.close();
	}
}
