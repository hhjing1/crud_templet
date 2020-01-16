<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>删除课程</title>
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

	<form align="center" action="deleteServlet" method="post">
	  <div>
	  <h4><a href="index.jsp">返回主界面</a></h4>
	   <table>
	      <tr>
	        <td>根据名字进行删除：</td>
	      </tr>
	      <tr>
	      	<td>请输入需要删除课程的名字：</td>
	      	<td><input type="text" name="delete" value=""></td>
	      </tr>
	      <tr>
	        <input type="submit" value="确定" id="">
	      </tr>
	   </table>
	  </div>
	</form>
</body>
</html>