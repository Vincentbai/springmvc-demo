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
    <title>Update Employee</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/index_work.css">
</head>
<body>
<%-- Action 应该写成绝对路径，如果只写 emp，最后的访问路径是 emp/emp--%>
<form action="${pageContext.servletContext.contextPath}/emp" method="post">
  <input type="hidden" name="id" value="${emp.id}">
  <input type="hidden" name="_method" value="PUT">
  <table>
    <tr>
      <th colspan="2">Update New Employee</th>
    </tr>
    <tr>
      <td>LASTNAME</td>
      <td>
        <input type="text" name="lastName" value="${emp.lastName}"/>
      </td>
    </tr>
    <tr>
      <td>EMAIL</td>
      <td>
        <input type="text" name="email" value="${emp.email}"/>
      </td>
    </tr>
    <tr>
      <td>GENDER</td>
      <td>
        <input type="radio" name="gender" value="1"  <c:if test="${emp.gender == 1}">checked = "checked"</c:if> Male
        <input type="radio" name="gender" value="0"  ${emp.gender == 0? "checked":""}/> Female

      </td>
    </tr>
    <tr>
      <td>DEPARTMENT</td>
      <td>
        <select name="department.id">
          <option> - Please Select - </option>
          <c:forEach items="${depts}" var="dept">
            <option value="${dept.id}" ${dept.id == emp.department.id?"selected":""}>${dept.departmentName}</option>
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
