<%@page import="com.bean.Bean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询显示</title>
</head>
<body>
<%
 Bean b2=(Bean)request.getAttribute("Bean");

%>
  <form action="selectServlet" method="post">

  <table>
  	<tr>
  		<td>显示课程名字：</td>
  		<td><input type="text" name="" value="<%=b2.getName()%>"></td>
  	</tr>
  	<tr>
  		<td>显示课程教师：</td>
  		<td><input type="text" name="" value="<%=b2.getTeacher()%>"></td>
  	</tr>
  	<tr>
  		<td>显示课程地点：</td>
  		<td><input type="text" naem="" value="<%= b2.getClassroom()%>"></td>
  	</tr>
  		
  </table>
 <a href="index.jsp">返回主界面</a>
 
 </form>
</body>
</html>