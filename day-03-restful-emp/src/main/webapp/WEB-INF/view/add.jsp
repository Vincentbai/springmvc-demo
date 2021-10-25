<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: korio
  Date: 23/10/2021
  Time: 9:15 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/index_work.css">
</head>
<body>
<form action="emp" method="post">
  <table>
    <tr>
      <th colspan="2">Add New Employee</th>
    </tr>
    <tr>
      <td>LASTNAME</td>
      <td>
        <input type="text" name="lastName" />
      </td>
    </tr>
    <tr>
      <td>EMAIL</td>
      <td>
        <input type="text" name="email" />
      </td>
    </tr>
    <tr>
      <td>GENDER</td>
      <td>
        <input type="radio" name="gender" value="1"/> Male
        <input type="radio" name="gender" value="0"/> Female

      </td>
    </tr>
    <tr>
      <td>DEPARTMENT</td>
      <td>
        <select name="department.id">
          <option> - Please Select - </option>
          <c:forEach items="${depts}" var="dept">
            <option value="${dept.id}">${dept.departmentName}</option>
          </c:forEach>
        </select>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Save">
      </td>
    </tr>
  </table>
</form>
</body>
</html>
