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
  	<tr>
  		<td>课程名字：</td>
  		<td><input type="text" name="" value="<%=b2.getName()%>"></td>
  	</tr>
  	<tr>
  		<td>课程教师：</td>
  		<td><input type="text" name="" value="<%=b2.getTeacher()%>"></td>
  	</tr>
  	<tr>
  		<td>课程地点：</td>
  		<td><input type="text" name="" value="<%= b2.getClassroom()%>"></td>
  	</tr>
 	
  </table>
  <hr/>
  <h4>修改后的课程信息</h4>
  <table>
    <tr>
    	<td>请输入所要修改的课程名称：</td>
    	<td><input type="text" name="updatename" value=""></td>
    </tr>
    <tr>
    	<td>请输入修改后的课程教师：</td>
    	<td><input type="text" name="updateteacher" value=""></td>
    <tr>
        <td>请输入修改后的上课地点：</td>
        <td><input type="text" name="updateclassroom" value=""></td>
    </tr>
     <tr>
	        <input type="submit" value="确定" id="">
	      </tr>
  </table>
  <a href="index.jsp">返回主页面</a>
  </form>
</body>
</html>