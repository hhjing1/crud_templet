<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="com.util.DBUtil"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册验证</title>
</head>
<body>
 <%
 String username=request.getParameter("username");
 String password=request.getParameter("password");
 //String username=new String(request.getParameter("username").getBytes("iso-8859-1"),"utf-8");
 //String password=new String(request.getParameter("password").getBytes("iso-8859-1"),"utf-8");
 String sex=new String(request.getParameter("sex").getBytes("iso-8859-1"),"utf-8");
 int age=Integer.parseInt(request.getParameter("age"));
 boolean isSuccess=DBUtil.addUser(username,password,sex,age);
  if(isSuccess){
	  request.setAttribute("message","注册成功，请登录！");
	  request.getRequestDispatcher("login.jsp").forward(request,response);
  }
  else{
	  request.setAttribute("message","注册失败，用户名重复，请重新注册！");
	  request.getRequestDispatcher("register.jsp").forward(request,response);
  }
 //if(isSuccess)
 //{%>
	
<%-- 	<font color='green'>欢迎<%=username %>注册成功</font> --%>
	<%
 //}else
 //{%>
	 
<!-- 	 <font color='red'>注册失败</font> -->
	 <%
 //}
 %>
</body>
</html>