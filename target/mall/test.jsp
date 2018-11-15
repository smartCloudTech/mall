<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <script>
        function deleteUser() {
            var info = document.getElementsByName("userInfo")[0];
            info.action="/deleteUser.action";
            info.submit();
        }
    </script>
</head>
<body>
<h2>用户信管理</h2>
<form action="" name="userInfo">
    <table border="1">
        <tr><input type="button" value="批量删除" onclick="deleteUser();"> </tr>
        <tr>
            <td>选择</td>
            <td>姓名</td>
            <td>密码</td>
            <td>年龄</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="id" value="1"></td>
            <td>aaa</td>
            <td>aaa</td>
            <td>23</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="id" value="2"></td>
            <td>bbb</td>
            <td>bbb</td>
            <td>25</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="id" value="3"></td>
            <td>ccc</td>
            <td>ccc</td>
            <td>22</td>
        </tr>
    </table>
</form>
<br>
<h2>用户登录</h2>
<form action="/user/login.action" method="post">
    <input type="text" name="name" placeholder="用户名"><br>
    <input type="password" name="password" placeholder="密码"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>