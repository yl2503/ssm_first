<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>展示员工列表</title>
</head>
<body>
    <table border="1" cellspacing="0">
        <thead>
            <tr>
                <td>id</td>
                <td>lastName</td>
                <td>email</td>
                <td>gender</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${emps}" var="emp">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.lastName}</td>
                    <td>${emp.email}</td>
                    <td>${emp.gender}</td>
                </tr>
            </c:forEach>

        </tbody>
    </table>
</body>
</html>
