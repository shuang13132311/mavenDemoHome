<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>20201110</title>
</head>
<script src="/js/jquery.min.js"></script>
<script>
	$(function(){
		//跳转到注册界面
		$("#toRegisterBt").click(function(){
			window.location.href="register.jsp";
		})

		//AJAX登录
		$("#loginBt").click(function(){
			var formData = $("#frm").serialize();
			$.post(
					"login",
					formData,
					function (result){
						console.log(result);
						alert(result);
						/*window.location.href="index.jsp";*/
					},"json"
			)
		})


	})


</script>
<body>

		<form method="post" id="frm">
			用户名:	<input type="text" name="userName">
			密   码:	<input type="password" name="userPassword">
					<input type="button" value="登陆" id="loginBt"><br />
					<input type="button" id="toRegisterBt" value="没有账号?点击注册!">
		</form>


</body>
</html>
