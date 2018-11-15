<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resultful测试</title>
    <script src="js/jquery-1.12.4.min.js"></script>
    <script>

        /*请求key/value,输出json*/
        function resultfulTest() {
            $.ajax({
                type:"get",
                url:'/userView/1',
                success:function (data) {
                    alert(data.id,data.name);
                }
            });
        }

    </script>
</head>
<body>
<input type="button" onclick="resultfulTest();" value="测试resultFul">

</body>
</html>