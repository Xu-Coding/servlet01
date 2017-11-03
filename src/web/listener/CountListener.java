package web.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CountListener implements HttpSessionListener{

	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("session is created...");
		HttpSession session=arg0.getSession();  //get session by httpsession event
		ServletContext sctx=session.getServletContext();  //get servletcontext by sesssion object
		Integer count=(Integer)sctx.getAttribute("count");
		if(count==null){
			count=1;
		}else{
			count++;
		}
		sctx.setAttribute("count", count);
		System.out.println(count);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("session is destroyed..");
		HttpSession session=arg0.getSession();
		ServletContext sctx=session.getServletContext();
		Integer count=(Integer)sctx.getAttribute("count");
//		count--;
		sctx.setAttribute("count", count);
		System.out.println(count);
	}
	
}
