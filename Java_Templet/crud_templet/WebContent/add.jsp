<%@page import="java.util.jar.Attributes.Name"%>
<%@page import="com.servlet.addServlet" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加课程</title>
</head>
<body>
<%
  String mess=(String)request.getAttribute("message");
     if(mess!=null&&!"".equals(mess)){
    	 %>
    	 <script type="text/javascript">
    	 alert("<%=mess%>");
    	 </script>
    	 <% 
     }
%>
<div align="center">
 <form action="addServlet" method="post">
   <a href="index.jsp"><h2>返回主界面</h2></a>
    <div >
    <table>
      <tr>
             <td>添加课程:</td>
             <td><input type="text" id="name" name="name"></td>
      </tr>
      <tr>
             <td>添加教师：</td>
             <td><input type="text" id="teacher" name="teacher"></td>
      </tr>
      <tr>
      		 <td>添加地点：</td>
      		 <td><input type="text" id="classroom" name="classroom"></td>
      </tr>
      <tr>
             <td><input align="center" type="submit" value="添加"></td>
      </tr>
      	</table>
    </div>
   </form>
</div>
</body>
</html>