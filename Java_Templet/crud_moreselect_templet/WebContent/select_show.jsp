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

<h3 align="center">详细信息显示</h3>
<hr/>
  <form action="selectServlet" method="post">

  <table>
  	<tr>
  		<td>显示姓名：</td>
  		<td><input type="text" name="" value="<%=b2.getName()%>"></td>
  	</tr>
  	<tr>
  		<td>显示性别：</td>
  		<td><input type="text" name="" value="<%=b2.getSex()%>"></td>
  	</tr>
  	<tr>
  		<td>显示民族：</td>
  		<td><input type="text" name="" value="<%=b2.getNation()%>"></td>
  	</tr>
  	<tr>
  		<td>显示注册时间：</td>
  		<td><input type="text" name="" value="<%=b2.getTime()%>"></td>
  	</tr>
  	<tr>
  		<td>显示年龄：</td>
  		<td><input type="text" name="" value="<%=b2.getAge()%>"></td>
  	</tr>
  	<tr>
  		<td>显示政治面貌：</td>
  		<td><input type="text" name="" value="<%=b2.getKind()%>"></td>
  	</tr>
  	<tr>
  		<td>显示服务类型：</td>
  		<td><input type="text" name="" value="<%=b2.getServe()%>"></td>
  	</tr>
 
  		
  </table>
 <a href="index.jsp">返回主界面</a>
 
 </form>
</body>
</html>