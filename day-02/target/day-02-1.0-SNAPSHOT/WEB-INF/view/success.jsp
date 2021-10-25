<%--
  Created by IntelliJ IDEA.
  User: korio
  Date: 15/10/2021
  Time: 10:22 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SUCCESS!!!</title>
</head>
<body>

    <h1>SUCCESS!!!</h1><br/>

    <%--  EL 表達式 四個作用域：PageContext, Request, Session, Application --%>
    ${ requestScope.username }

</body>
</html>
