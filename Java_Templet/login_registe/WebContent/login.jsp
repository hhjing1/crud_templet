<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
</head>
<body>
	 <form action="login_do.jsp"  method="post">
	 <%
	     Object msg=request.getAttribute("message") ;
	 if(msg!=null){
	     out.println(msg);
	 }
	     %>
	 登录<hr/>
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
     <td><input type="submit" name="" value="登录"></td>
     <td><input type="reset" name="" value="重置"></td>
  
 </table>
  </form>
  <script type="text/javascript">
  	function formReset(){
  		document.getElementById("form").reset();
  	}
  </script>
</body>
</html>