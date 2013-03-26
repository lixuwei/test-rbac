<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎您 ,登录质量系统</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/v3/js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
</head>
<body>
	<form id="forward" action="${pageContext.request.contextPath}/forward/to_mainPage.action" >
		用户名：<input type="text" name="loginName"/>
		密码:<input type="password" name="password"/>
	</form>
	<button id="smbtn">登录</button><button id="rebtn">重置</button>
</body>
</html>