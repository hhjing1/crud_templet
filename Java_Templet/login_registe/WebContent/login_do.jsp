<%@page import="com.util.DBUtil"%>
<%@page import="com.model.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	
	User user=DBUtil.VerifyAccount(username, password);
	if(user==null)
	{
		//out.println("登录失败，用户名或密码错误！");
	  request.setAttribute("message", "<font color='red'>登录失败，用户名或密码错误</font>");
	  request.getRequestDispatcher("login.jsp").forward(request,response);
	}
	else
	{
		 int number=0;
		  if(application.getAttribute("usernumber")!=null)
		  {
			  number=(Integer)application.getAttribute("usernumber");
		  }
		  number++;
		  application.setAttribute("username",number);
		//out.println("登录成功");
	request.setAttribute("user", user);
	request.getRequestDispatcher("personCenter.jsp").forward(request, response);
	}
	
%>
</body>
</html>