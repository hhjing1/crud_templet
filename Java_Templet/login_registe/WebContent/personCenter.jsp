<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.util.DBUtil"%>
<%@page import="com.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人中心</title>
</head>
<body>
	<%
		User user=(User)request.getAttribute("user");
	%>
	用户名：<%=user.getUsername() %>
	密码：<%=user.getPassword() %>
	年龄：<%=user.getAge() %>
	性别：<%=user.getSex() %>
</body>
</html>