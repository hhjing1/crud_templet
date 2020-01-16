<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>信息登记</title>
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

<div style="width:100%;text-align:center">
<h3 align="center">信息登记</h3>
<hr/>
        <form id="form" action="addServlet" method="post" onsubmit="return checkAll()">
        <% //form用于提交，table用于布局，tr每行,td每列，使用时table > tr > td ，若报错Invalid location of tag，就是嵌套顺序不对%>
        <table>
            <tr>
                <td>姓名：</td>
               <td><input id="name" type=text"  name="name" onblur="checkName()" /></td>
               <td><span  style="font-size:13px" id="namespan"></span></td>
            </tr>
            <tr>
                <td>性别:</td>
                <td>
                                                         男:<input type="radio" value="男" name="sex"/>
                                                         女:<input type="radio" value="女" name="sex"/>
                </td>
            </tr>
             <tr>
                <td>民族：</td>
                <td><input type="text" name="nation" value=""></td>
             </tr>
             <tr>
                <td>注册时间：</td>
                <td><input type="text" name="time" value=""></td>
             </tr>
              <tr>
                <td>年龄：</td>
                <td><input type="text" name="age" value=""></td>
             </tr>
             <tr>
                <td>政治面貌：:</td>
                <td>
                    <select name="kind">
                        <option selected= "selected">群众</option>
                        <option>共青团员</option>
                        <option>中共党员</option> 
                    </select>
                </td>
            </tr>
           <tr>
      <form action="addServlet" method="post" name="serve"> 
		<td>服务类别</td>
		<tr>
		<td><label><input name="serve" type="checkbox" value="扶危济困" />扶危济困 </label> </td>
		<td>   <label><input name="serve" type="checkbox" value="敬老助残" />敬老助残 </label> </td>
		<td><label><input name="serve" type="checkbox" value="社区服务" /> 社区服务 </label> </td>
		<td><label><input name="serve" type="checkbox" value="秩序维护" />秩序维护 </label> </td>
		<td><label><input name="serve" type="checkbox" value="文体服务" />文体服务</label> </td>
		</tr>
		<tr>
		<td><label><input name="serve" type="checkbox" value="环境保护" /> 环境保护</label> </td>
		<td><label><input name="serve" type="checkbox" value="治安防范" />治安防范 </label> </td>
		<td> <label><input name="serve" type="checkbox" value="医疗救治" /> 医疗救治 </label> </td>
		<td> <label><input name="serve" type="checkbox" value="法律救援" />法律援助 </label> <td>
		<td> <label><input name="serve" type="checkbox" value="大型活动" />大型活动 </label> </td>
		</tr>
		<tr>
		<td><label><input name="serve"jingshenfuwei" type="checkbox" value="精神抚慰" />精神抚慰 </label> </td>
		<td> <label><input name="serve" type="checkbox" value="支教支医" />支教支医 </label> </td>
		<td> <label><input name="serve" type="checkbox" value="科学普及" />科学普及</label> </td>
		<td> <label><input name="serve" type="checkbox" value="救济应援" />应急救援 </label></td>
		</tr>
		<tr>
		<td> <label><input name="serve" type="checkbox" value="便民服务" />便民服务 </label> </td>
		<td><label><input name="serve" type="checkbox" value="民事调解" />民事调解 </label> </td>
		<td><label><input name="serve" type="checkbox" value="文明引导" />文明引导 </label> </td>
		<td><label><input name="serve" type="checkbox" value="安全生产" />安全生产 </label> </td>
		<td><label><input name="serve" type="checkbox" value="禁毒宣传" />禁毒宣传 </label> </td>
		</tr>
		</form> 
      
      </tr>

              
           <tr>
                <td><input type="submit" value="登记"/></td>
                <td><input type="button" name="" value="重置" onclick="formReset()" /></td>
            </tr>
            <tr>
            <a href="index.jsp">返回主页面</a>
            </tr>
        </table>
    </form>
</div>
    <script type="text/javascript">
        //重置按钮处添加onclick调用formReset %>
        function formReset() 
        {
            document.getElementById("form").reset();
        }
//         function checkId()
//         {
//             var id = document.getElementById("id").value;
//             var spanNode = document.getElementById("idspan");
//             //学号的正确形式
//            // var reg = /^[0-9a-zA-Z]{6}/;
//             if((id<"20180000")|| (id>"20189999"))
//             {
//                 spanNode.innerHTML = "学号格式不正确，请重新填写！".fontcolor("red");
//                 return false;
//             }
//             else{
//                 //不符合规则
//                 spanNode.innerHTML = "".fontcolor("green");
//                 return true;
//             }
//         }
//         function checkAll(){
//             var postbox = checkPostbox();
//             var id=checkId();
//             var zhanghao=checkZhanghao();
//             var password=checkPassword();
//             if(postbox&&id&&password&&zhanghao){
//                 return true;    
//             }else{       
//                 return false;     
//             }     
//         }
    </script>
</body>
</html>