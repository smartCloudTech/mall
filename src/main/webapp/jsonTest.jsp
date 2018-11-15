<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Json数据测试</title>
    <script src="js/jquery-1.12.4.min.js"></script>
    <script>
        /*请求json，输出json*/
        function requestJson() {
            $.ajax({
               type:'post',
                url:'/requestJson.action',
                contentType:'application/json;charset=utf-8',
                //数据格式是JSON
                data:'{"name":"aaa","password":"bbb"}',
                success:function (data) {
                    alert(data);
                }
            });
        }

        /*请求key/value,输出json*/
        function responseJson() {
            $.ajax({
                type:'post',
                url:'/responseJson.action',
                //数据格式是key/value
                data:"name=aaa&password=bbb",
                success:function (data) {
                    alert(data);
                }
            });
        }
        
    </script>
</head>
<body>

<input type="button" onclick="requestJson();" value="请求JSON输出JSON">
<input type="button" onclick="responseJson();" value="请求key/value，输出json">
</body>
</html>