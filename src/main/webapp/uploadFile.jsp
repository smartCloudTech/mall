<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
图片上传
<form action="/fileUpload.action" method="post" enctype="multipart/form-data">
    <input type="file" name="img"><br>
    <input type="submit" value="上传">

</form>
<img src="${picName}">
</body>
</html>