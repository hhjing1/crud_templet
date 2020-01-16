<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询课程信息</title>
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

 <h2 align="cneter">课程查询</h2>
 <hr/>
	<form align="center" action="selectNameServlet" method="post">
	  <div>
	   <table>
	      <tr>
	        <td>根据名字进行查询：</td>
	      </tr>
	      <tr>
	      	<td>请输入需要查询课程的名字：</td>
	      	<td><input type="text" name="selectname" value=""></td>
	      </tr>
	      <tr>
	        <input type="submit" value="确定" id="">
	      </tr>
	      <a href="index.jsp">返回主页面</a>
	   </table>
	  </div>
	</form>
</body>
</html>