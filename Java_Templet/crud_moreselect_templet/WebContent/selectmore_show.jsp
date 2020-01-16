<%@ page language="java" contentType="text/html; charse=tUTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>信息显示页面</title>
</head>
<body>
<a href="denglu.jsp">返回主界面</a>
<%
	Object message=request.getAttribute("message");
	if(message!=null&&!"".equals(message)){
		%>
	
	<script type="text/javascript">
		alert("<%=request.getAttribute("message")%>");
	</script>
 <%}%>
<table>
	<tr>
		<td>姓名</td>
		<td>性别</td>
		<td>民族</td>
		<td>注册日期</td>
		<td>年龄</td>
		<td>政治面貌</td>
		<td>服务类别</td>
	</tr>
<c:forEach items="${course11}" var="course1">
	<tr>
		<td>${course1.name}</td>
		<td>${course1.sex}</td>
		<td>${course1.nation}</td>
		<td>${course1.time}</td>
		<td>${course1.age}</td>
		<td>${course1.kind}</td>
		<td>${course1.serve}</td>
		
	</tr>
		</c:forEach>
</table>
</body>
</html>