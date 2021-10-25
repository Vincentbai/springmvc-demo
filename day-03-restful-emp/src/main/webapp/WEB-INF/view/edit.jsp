<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: korio
  Date: 23/10/2021
  Time: 9:15 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Add Employee</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/index_work.css">
</head>
<body>
<%-- modelAttribut 自定义回显对象的属性名，默认为command --%>
<form:form action="${pageContext.servletContext.contextPath}/emp" method="post" modelAttribute="emp">
  
  <c:if test="${empty emp.id}" var="flag"></c:if>
  <c:if test="${flag}"
  
  <table>
    <tr>
      <th colspan="2">Add New Employee</th>
    </tr>
    <tr>
      <td>LASTNAME</td>
      <td>
<%--        <input type="text" name="lastName" />--%>
        <form:input path="lastName" />
      </td>
    </tr>
    <tr>
      <td>EMAIL</td>
      <td>
<%--        <input type="text" name="email" />--%>
        <form:input path="email" />
      </td>
    </tr>
    <tr>
      <td>GENDER</td>
      <td>
<%--        <input type="radio" name="gender" value="1"/> Male--%>
<%--        <input type="radio" name="gender" value="0"/> Female--%>
        <%--   将 genders 中的key作为 radio的value， 值作为标签     --%>
        <form:radiobuttons path="gender" items="${genders}" />

      </td>
    </tr>
    <tr>
      <td>DEPARTMENT</td>
      <td>
<%--        <select name="department.id">--%>
<%--          <option> - Please Select - </option>--%>
<%--          <c:forEach items="${depts}" var="dept">--%>
<%--            <option value="${dept.id}">${dept.departmentName}</option>--%>
<%--          </c:forEach>--%>
<%--        </select>--%>
        <form:select path="department.id" items="${depts}" itemLabel="departmentName" itemValue="id" />
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Save">
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>
