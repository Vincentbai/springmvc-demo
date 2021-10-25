<%--
  Created by IntelliJ IDEA.
  User: korio
  Date: 20/10/2021
  Time: 10:06 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>展示员工信息</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/index_work.css">
<%--    <link rel="stylesheet" href="/css/index_like.css">--%>
</head>

<body>

    <table>

        <tr>
            <th>ID</th>
            <th>LASTNAME</th>
            <th>EMAIL</th>
            <th>GENDER</th>
            <th>DEPARTMENT NAME</th>
            <th>OPTION (<a href="emp" >ADD</a>)</th>
        </tr>

        <%--   jstl Java Stand Tag Library / EL expression library (Page, Request, Session, Application)     --%>
        <c:forEach items="${emps}" var="emp">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.lastName}</td>
                <td>${emp.email}</td>
                <td>${emp.gender == 1? "Male":"Female" }</td>
                <td>${emp.department.departmentName}</td>
                <td>
                    <a href="emp/${emp.id}">UPDATE</a>
                    <a href="emp">DETELE</a>
                </td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
