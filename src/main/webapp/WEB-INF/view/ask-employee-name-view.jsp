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
    <form:errors path="name"/>
    <br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    Phone Number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    Department:
    <form:select path="department">
        <%--        <form:option value="Information Technology" label="IT"/>--%>
        <%--        <form:option value="Human Resources" label="HR"/>--%>
        <%--        <form:option value="Sales" label="Sales"/>--%>

        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>

    <%--    <form:radiobutton path="carBrand" value="BMW"/>BMW--%>
    <%--    <form:radiobutton path="carBrand" value="Audi"/>Audi--%>
    <%--    <form:radiobutton path="carBrand" value="Mercedes"/>Mercedes--%>

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    <h3>Please choose language that you know </h3>
    <form:checkbox path="languages" value="English"/>EN
    <form:checkbox path="languages" value="Russian"/>RU
    <form:checkbox path="languages" value="Turkish"/>TR
    <%--    <form:checkboxes path="languages" items="${languageOptions}"/>--%>

    <br><br>
    <input type="submit" value="Ok">

</form:form>

</body>
</html>
