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
 <tr><h3>所有课程信息：</h3></tr>
 <hr/>
   <table>
   		<tr>
   			<td>课程名称</td>
   			<td>课程教师</td>
   			<td>课程地点</td>
   		</tr>
   		<c:forEach items="${listbean}" var="item">
   		<tr>
   		   <td>${item.name}</td>
   		   <td>${item.teacher}</td>
   		   <td>${item.classroom}</td>
   		</tr>
   		  </c:forEach> 
   </table>
   	 <a href="index.jsp">返回主界面</a>
   	 </form>
</html>