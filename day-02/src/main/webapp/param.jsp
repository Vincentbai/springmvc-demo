<%--
  Created by IntelliJ IDEA.
  User: korio
  Date: 16/10/2021
  Time: 4:38 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="testParam" method="post">
    username: <input type="text" name="username" /> <br/>
    password: <input type="password" name="password" /> <br/>
    age: <input type="text" name="age" /> <br/>
    state: <input type="text" name="state" /> <br/>
    city: <input type="text" name="city" /> <br/>
    country: <input type="text" name="country" /> <br/>
    <input type="submit" value="testParam" /> <br/>
</form>

<br/><br/>

<form action="testRequestHeader" method="post">
    <input type="submit" value="testRequestHeader" />
</form>

<br/><br/>

<form action="testCookieValue" method="post">
    <input type="submit" value="testCookieValue" />
</form>

<br/><br/>

<form action="testPOJO" method="post">
    username: <input type="text" name="username" /> <br/>
    password: <input type="password" name="password" /> <br/>
    age: <input type="text" name="age" /> <br/>
    state: <input type="text" name="address.state" /> <br/>
    city: <input type="text" name="address.city" /> <br/>
    country: <input type="text" name="address.country" /> <br/>
    <input type="submit" value="testPOJO" /> <br/>
</form>

<br/><br/>

<form action="testModelAndView" method="post">
    <input type="submit" value="testModelAndView" />
</form>

<br/><br/>

<form action="testMap" method="post">
    <input type="submit" value="testMap" />
</form>

<br/><br/>

<form action="testModel" method="post">
    <input type="submit" value="testModel" />
</form>

<br/><br/>

</body>
</html>
