<%--
  Created by IntelliJ IDEA.
  User: ismayilovasgar
  Date: 12/10/2025
  Time: 23:28
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<br>

<%--<form action="showName" method="POST">--%>
<%--    <label>--%>
<%--        <input type="text" name="employeeName" placeholder="write your name">--%>
<%--        <input type="submit">--%>
<%--    </label>--%>
<%--</form>--%>

<form:form action="showDetail" modelAttribute="employee">

    Name: <form:input path="name"/>
    <br>
    Surname: <form:input path="surname"/>
    <br>
    Salary: <form:input path="salary"/>
    <br>
    Department:
    <form:select path="department">
        <form:option value="Information Technology" label="IT"/>
        <form:option value="Human Resources" label="HR"/>
        <form:option value="Sales" label="Sales"/>
    </form:select>
    <br>
    <input type="submit" value="Ok">

</form:form>

</body>
</html>
