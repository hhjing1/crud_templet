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
  <form action="deleteServlet" method="post">


  <table>
  	<tr>
  		<td>删除人姓名：</td>
  		<td><input type="text" name="" value="<%=b2.getName()%>"></td>
  	</tr>
  	<tr>
  		<td>删除人性别：</td>
  		<td><input type="text" name="" value="<%=b2.getSex()%>"></td>
  	</tr>
  	<tr>
  		<td>删除人民族：</td>
  		<td><input type="text" name="" value="<%=b2.getNation()%>"></td>
  	</tr>
  	<tr>
  		<td>删除人注册时间：</td>
  		<td><input type="text" name="" value="<%=b2.getTime()%>"></td>
  	</tr>
  	<tr>
  		<td>删除人的年龄：</td>
  		<td><input type="text" name="" value="<%=b2.getAge()%>"></td>
  	</tr>
  	<tr>
  		<td>删除人的政治面貌：</td>
  		<td><input type="text" name="" value="<%=b2.getKind()%>"></td>
  	</tr>
  	<tr>
  		<td>删除人的服务类型：</td>
  		<td><input type="text" name="" value="<%=b2.getServe()%>"></td>
  	</tr>
           <tr>
	        <input type="submit" value="确定" id="">
	      </tr>
  </table>

 <a href="index.jsp">返回主界面</a>
 
 </form>
</body>
</html>