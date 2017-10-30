package web.lifecycle;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomeServlet extends HttpServlet{
	public SomeServlet(){
		System.out.println("construct is called");
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		System.out.println("service method is called");
		ServletConfig config=getServletConfig();
		System.out.println(config);
		String str1=config.getInitParameter("company");
		System.out.println(str1 );
		
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method is called");
//		super.init();
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method is called");
//		super.destroy();
	}
	
}
