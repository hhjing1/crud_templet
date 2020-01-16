<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示所要修改的课程</title>
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
<h3 align="center">信息修改</h3>
<hr/>
 <form action="updateServlet" method="post">
          <tr>
 	          <td>请输入所要修改的课程的名字：</td>
 	          <td><input type="text" name="selectname" value=""></td>
          </tr>
          <tr>
	          <td><input type="submit" value="确定" id=""></td>
	      </tr>
 </form>
</body>
</html>