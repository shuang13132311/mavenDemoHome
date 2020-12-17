<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%-- 引入jQuery --%>
<script src="/js/jquery.min.js"></script>
<script>
	/*加载jQuery*/
	$(function(){

		$("#submitBt").click(function (){
			/*form表单序列化成的拼接字符串参数*/
			/*var strData = $("#frm").serialize();
			alert(strData);
			console.log(strData);*/

			/*JSON对象*/
			var userName = $("#userName").val();
			var userPassword = $("#userPassword").val();
			var userSex = $("input[name='userSex']:checked").val();
			var userPhone = $("#userPhone").val();
			var jsonData = {"userPhone":userPhone,
							"userPassword":userPassword,
							"userName":userName,
							"userSex":userSex
							};
			alert(jsonData);
			console.log(jsonData);
			console.log(jsonData.userName);
			console.log(typeof jsonData);

			$.ajax({
				type : "post",
				url : "/userController/register",
				Data :jsonData,
				DataType : 'json',
				success : function (msg){
					if("00" == msg){
						alert(msg);
						/*window.location.href="#";*/
					}
				}
			})

		})
	})

</script>

<body>
	<form method="post" id="frm">
		请输入账户:		<input type="text" name="userName" id="userName"><br />
		请输入密码:		<input type="password" name="userPassword" id="userPassword">
		<%--请再次请输入密码:	<input type="password" id="p2"><br />--%>
		请选择性别:		<input type="radio" name="userSex" value="男">男
						<input type="radio" name="userSex" value="女">女<br />
		请输入电话号码:	<input type="text" name="userPhone" id="userPhone">
						<input type="button" value="提交" id="submitBt"> <!-- //提交按钮，并触发前台验证 -->
	</form>
</body>
</html>