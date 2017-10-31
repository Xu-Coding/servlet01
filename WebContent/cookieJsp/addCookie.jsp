<%@page pageEncoding="utf-8" %>   
<%
	Cookie cookie=new Cookie("cart","123");
	cookie.setPath("/servlet01");
	response.addCookie(cookie);
	response.setContentType("text/html;charset=UTF-8");
	out.println("添加cookie成功");
	out.println("add cookie success");
%>