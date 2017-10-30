package web.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

public class FindCookieServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		Cookie[] cookies=request.getCookies();
		if(cookies!=null){
			for (int i = 0; i < cookies.length; i++) {
				Cookie c=cookies[i];
				String name=c.getName();
				String value=c.getValue();
				out.println(name+":"+value+"</br>");
			}
		}else{
			out.println("there is no cookie");
		}
		
		out.close();
		
	}
}
