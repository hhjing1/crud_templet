<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询页面</title>

<script>
var i=1;
var j=1;
document.getElementById('number1').value=i;
document.getElementById('number2').value=j;
function demoDisplay(){
	if(document.getElementById("p2").style.display=="none"){
		i++;
		j++;
		document.getElementById("p2").style.display="inline";
		document.getElementById('number1').value=i;
		document.getElementById('number2').value=j;
// 		alert(i);
// 		alert(j);
		return;
	}else if(document.getElementById("p3").style.display=="none")
		{
			i++;
			j++;
			document.getElementById("p3").style.display="inline";
			document.getElementById('number1').value=i;
			document.getElementById('number2').value=j;
// 			alert(i);
// 			alert(j);
			return;
		}else if(document.getElementById("p4").style.display=="none")
		{
			i++;
			j++;
			document.getElementById("p4").style.display="inline";
			document.getElementById('number1').value=i;
			document.getElementById('number2').value=j;
// 			alert(i);
// 			alert(j);
			return;
		}else if(document.getElementById("p5").style.display=="none")
		{
			i++;
			j++;
			document.getElementById("p5").style.display="inline";
			document.getElementById('number1').value=i;
			document.getElementById('number2').value=j;
// 			alert(i);
// 			alert(j);
			return;
		}
}
function demoVisibility(){
	if(document.getElementById("p5").style.display=="inline")
	{
		i--;
		j--;
		document.getElementById("p5").style.display="none";
		document.getElementById('number1').value=i;
		document.getElementById('number2').value=j;
		//System.out.println("i:"+i+"j"+j);
		return;
	}else if(document.getElementById("p4").style.display=="inline")
	{
		i--;
		j--;
		document.getElementById("p4").style.display="none";
		document.getElementById('number1').value=i;
		document.getElementById('number2').value=j;
		//System.out.println("i:"+i+"j"+j);
		return;
	}else if(document.getElementById("p3").style.display=="inline")
	{
		i--;
		j--;
		document.getElementById("p3").style.display="none";
		document.getElementById('number1').value=i;
		document.getElementById('number2').value=j;
		//System.out.println("i:"+i+"j"+j);
		return;
	}else if(document.getElementById("p2").style.display=="inline")
	{
		i--;
		j--;
		document.getElementById("p2").style.display="none";
		document.getElementById('number1').value=i;
		document.getElementById('number2').value=j;
		//System.out.println("i:"+i+"j"+j);
		return;
	}
}
</script>

</head>
<body>
<%
	Object message=request.getAttribute("message");
	if(message!=null&&!"".equals(message)){
		%>
	
	<script type="text/javascript">
		alert("<%=request.getAttribute("message")%>");
	</script>
 <%}%>
<form  action="VagueServlet" method="post">
<br>
&nbsp;&nbsp;
<button type="button" onclick="demoDisplay()" class="layui-btn layui-btn-primary layui-btn-sm"><i class="layui-icon">+</i></button>
<button type="button" onclick="demoVisibility()" class="layui-btn layui-btn-primary layui-btn-sm"><i class="layui-icon">-</i></button><br>

&nbsp;&nbsp;
<div id="p1">
&nbsp;&nbsp;
	<select name="g22" style="visibility:hidden">
	<option value="且">且</option>
	<option value="或">或</option>
	</select>
	<select name="s1" >
	<option>名字</option>
	<option>性别</option>
	<option>民族</option>
	<option>注册日期</option>
	<option>年龄</option>
	</select>
	<input type="text" name="shuru1" value="" />
	<select name="c1">
	<option>精确</option>
	<option>模糊</option>
	</select>
	<br>
</div>

<div id="p2" style="display:none">
&nbsp;&nbsp;
	<select name="g1" >
	<option value="且">且</option>
	<option value="或">或</option>
	</select>
	<select name="s2">
	<option>名字</option>
	<option>性别</option>
	<option>民族</option>
	<option>注册日期</option>
	<option>年龄</option>
	</select>
	<input type="text" name="shuru2" value="" />
	<select name="c2">
	<option>精确</option>
	<option>模糊</option>
	</select>
	<br>
</div>

<div id="p3" style="display:none">
&nbsp;&nbsp;
<select name="g2">
	<option value="且">且</option>
	<option value="或">或</option>
	</select>
	<select name="s3">
	<option>名字</option>
	<option>性别</option>
	<option>民族</option>
	<option>注册日期</option>
	<option>年龄</option>
	</select>
	<input type="text" name="shuru3" value="" />
	<select name="c3">
	<option>精确</option>
	<option>模糊</option>
	</select>
	<br>
</div>

<div id="p4" style="display:none">
&nbsp;&nbsp;
<select name="g3">
	<option value="且">且</option>
	<option value="或">或</option>
	</select>
	<select name="s4">
	<option>名字</option>
	<option>性别</option>
	<option>民族</option>
	<option>注册日期</option>
	<option>年龄</option>
	</select>
	<input type="text" name="shuru4" value="" />
	<select name="c4">
	<option>精确</option>
	<option>模糊</option>
	</select>
	<br>
</div>

<div id="p5" style="display:none">
&nbsp;&nbsp;
<select name="g4">
	<option value="且">且</option>
	<option value="或">或</option>
	</select>
	<select name="s5">
	<option>名字</option>
	<option>性别</option>
	<option>民族</option>
	<option>注册日期</option>
	<option>年龄</option>
	</select>
	<input type="text" name="shuru5" value="" />
	<select name="c5">
	<option>精确</option>
	<option>模糊</option>
	</select>
</div>
<p hidden>
<input type="text" value="1" id="number1" name="number1">
<input type="text" value="1" id="number2" name="number2">
</p>
<br>
    <input type="submit" name="submit" value="查询" >
  </form>
  <br>
<h4 align="left">
<%--  一共查询到了<span style="color:red"><%=list.size() %></span>条数据  --%>
</h4>
<table class="table table-striped">
    <thead>
    <tr>
        <th>平台编号</th>
        <th>平台名称</th>
        <th>批准年月</th>	
        <th>平台级别</th>
        <th>服务的主要国民经济行业</th>
        <th>所属的主要学科</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    </thead>
 </table>

</body>
</html>