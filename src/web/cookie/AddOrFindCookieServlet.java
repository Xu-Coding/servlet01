package web.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddOrFindCookieServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		Cookie[] cookies=request.getCookies();
		if(cookies!=null){
			boolean flag=false;
			for (int i = 0; i < cookies.length; i++) {
				Cookie c=cookies[i];
				if("cart".equals(c.getName())){
					out.println("cart:"+c.getValue());
					flag=true;
				}
			}
			if(!flag){
				out.println("there is cookie,but no cart.adding...</br>");
				Cookie cookie=new Cookie("cart","1234");
				response.addCookie(cookie);
				out.println("add cookie success");
			}
		}else{
			out.println("there is not cookie,but it is being added now.wait...</br>");
			Cookie cookie=new Cookie("cart","123");
			response.addCookie(cookie);
			out.println("add cookie success");
		}
		out.close();
	}
}
