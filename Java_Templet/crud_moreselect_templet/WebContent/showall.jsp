<%@page import="com.dao.Dao"%>
<%@page import="com.bean.Bean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ page isELIgnored="false" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示全部信息</title>
</head>
<body>
<!-- <form  action="showAllServlet" method="post"> -->
 <tr><h3>所有信息：</h3></tr>
 <hr/>
   <table>
   		<tr>
   			<td>姓名：</td>
   			<td>性别:</td>
   			<td>民族：</td>
   			<td>注册时间：</td>
   			<td>年龄：</td>
   			<td>政治面貌：</td>
   			<td>服务类别：</td>
   		</tr>
   		<c:forEach items="${listbean}" var="item">
   		<tr>
   		   <td>${item.name}</td>
   		   <td>${item.sex}</td>
   		   <td>${item.nation}</td>
   		    <td>${item.time}</td>
   		   <td>${item.age}</td>
   		   <td>${item.kind}</td>
   		    <td>${item.serve}</td>
   		</tr>
   		  </c:forEach> 
   </table>
   	 <a href="index.jsp">返回主界面</a>
   	 </form>
</html>