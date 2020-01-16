<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="com.util.DBUtil"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
 <%
	     Object msg=request.getAttribute("message") ;
	 if(msg!=null){
	     out.println(msg);
	 }
   %>
  <form action="register_do.jsp"  method="post">
  <table>
  <tr>
    <td> 用户名：</td>
    <td><input type="text" name="username"></td>
  </tr>
  <tr>
     <td>密码：</td>
     <td><input type="password" name="password"></td>
  </tr>
  <tr>
    <td>性别：</td>
    <td>男<input type="radio" name="sex" value="男">女<input type="radio" name="sex" value="女"></td>
  </tr>
  <tr> 
    <td>年龄：</td>
    <td><input type="text" name="age"></td>
  </tr>
  <tr>
      <td><input type="submit" value="注册"></td>
      <td><input type="reset" value="重置" onclick="formReset()"></td>
 </tr>
 </table>
  </form>
  <script type="text/javascript">
  function formReset() 
	{
		document.getElementById("form").reset();
	}
  </script>
</body>
</html>