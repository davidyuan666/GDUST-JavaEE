<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>pages目录中的注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="post">
    用户名：<input type="text" name="username" value="${username}"/><br/>
    密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" value="${user.password}"/>
    <br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>

