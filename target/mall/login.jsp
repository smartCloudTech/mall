<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<h2>用户登录</h2>
<c:if test="${errorList!=null}">
    <c:forEach items="${errorList}" var="e">
        ${e.defaultMessage}<br>
    </c:forEach>
</c:if>
<form action="/user/login.action" method="post">
    <input type="text" name="name" placeholder="用户名" value="${u.name}"><br>
    <input type="password" name="password" placeholder="密码" value="${u.password}"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>