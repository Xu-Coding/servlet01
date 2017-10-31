package web.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServletDemo1 extends HttpServlet{
	public void service (HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(true);
//		session.setMaxInactiveInterval(10);  //timeout
		String sessionId=session.getId();
		System.out.println(sessionId);
		Integer count=(Integer)session.getAttribute("count");
		if(count==null){
			count=1;
		}else{
			count++;
		}
		session.setAttribute("count",count);
		out.println("you are visiting for the "+count+"  time");
//		session.invalidate();
		out.close();
	}
}
