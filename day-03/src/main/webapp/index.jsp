<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>

<a href="testView">Test View</a>

<br/>
<br/>

<a href="testRedirectView">Test Redirect View</a>

<br/>
<br/>

<form action="testCharset" method="post">
    <input type="text" name="username" />
    <input type="submit" value="Save">
</form>

</body>
</html>