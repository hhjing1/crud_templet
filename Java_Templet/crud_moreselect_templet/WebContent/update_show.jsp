<%@page import="com.bean.Bean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改课程信息</title>
</head>
   <%
      Bean b2=(Bean)request.getAttribute("Bean");
   %>
   
 
<body>
 
     <form action="updatenewServlet"  method="post">	
  <table>
  <h4>修改前的课程信息：</h4>
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
  <hr/>
  <h4>修改后的课程信息</h4>
  <table>
   <tr>
  		<td>显示姓名：</td>
  		<td><input type="text" name="updatename" value=""></td>
  	</tr>
  	<tr>
  		<td>显示性别：</td>
  		<td><input type="text" name="updatesex" value=""></td>
  	</tr>
  	<tr>
  		<td>显示民族：</td>
  		<td><input type="text" name="updatenation" value=""></td>
  	</tr>
  	<tr>
  		<td>显示注册时间：</td>
  		<td><input type="text" name="updatetime" value=""></td>
  	</tr>
  	<tr>
  		<td>显示年龄：</td>
  		<td><input type="text" name="updateage" value=""></td>
  	</tr>
  	<tr>
  		<td>显示政治面貌：</td>
  		<td><input type="text" name="updatekind" value=""></td>
  	</tr>
  	<tr>
  		<td>显示服务类型：</td>
  		<td><input type="text" name="updateserve" value=""></td>
  	</tr>
     <tr>
	        <input type="submit" value="确定" id="">
	      </tr>
  </table>
  <a href="index.jsp">返回主页面</a>
  </form>
</body>
</html>