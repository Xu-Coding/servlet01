package web.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1Filter1 implements Filter{
	private FilterConfig  config;
	
	public Demo1Filter1(){
		System.out.println("Demo1Filter1 construct is called...");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Demo1Filter1 filter is called begin...");
		HttpServletRequest request=(HttpServletRequest)arg0;
		HttpServletResponse response=(HttpServletResponse)arg1;
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String words=request.getParameter("words");
		
		String illgalStr=config.getInitParameter("illgalStr");
		if(words.indexOf(illgalStr)!=-1){
			out.println("评论不合法！");
		}else{
			arg2.doFilter(arg0, arg1);
		}
		System.out.println("Demo1Filter1 filter is end...");
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Demo1Filter1 init method called...");
		config=arg0;
		
	}
	
}
