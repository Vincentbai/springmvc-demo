<%--
  Created by IntelliJ IDEA.
  User: korio
  Date: 15/10/2021
  Time: 9:59 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Restful</title>

    <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>

    <script type="text/javascript">

        function testAJAX(){
            $.ajax({
                url:"testAJAX_DELETE",
                type:"DELETE",
                data:{id: 1001},
                dataTypes:"json", // 預計服務器的返回結果，前端控制不了服務器的返回結果
                success: function (obj){
                    alert(obj);
                }
            })
        }

    </script>
</head>
<body>

<a href="testRestful/1001">測試 GET 請求</a>

<br/>
<br/>

<form method="post" action="testRestful">
    <input type="submit" value="測試 POST 請求">
</form>

<br/>
<br/>

<form method="post" action="testRestful">
    <input type="submit" value="測試 PUT 請求">
    <input type="hidden" name="_method" value="PUT">
</form>

<br/>
<br/>

<form method="post" action="testRestful/1001">
    <input type="submit" value="測試 DELETE 請求">
    <input type="hidden" name="_method" value="DELETE">
</form>

<br/>
<br/>

<input type="button" value="Test AJAX" onclick="testAJAX()" />


</body>
</html>
