<%--
  Created by IntelliJ IDEA.
  User: ismayilovasgar
  Date: 10/10/2025
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Dear employee, You are welcome</h1>

<%--<br>--%>
<%--<p>your name: ${param.employeeName}</p>--%>
<%--<p>your name: ${empName}</p>--%>
<%--<a href="<c:url value='/v1/'/>">Back to Home</a>--%>
<%--<br>--%>
<br>
<h2>Your Name: ${employee.name}</h2>
<br>
<h2>Your Surname: ${employee.surname}</h2>
<br>
<h2>Your Salary: ${employee.salary}</h2>
<br>
<h2>Your Department: ${employee.department}</h2>
<br>
<%--<h2>Your Salary: ${employee.carBrand}</h2>--%>
<br>
<h2>Your carBrand: ${employee.carBrand}</h2>
<br>
</body>
</html>
