<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/2
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>

<head>
    <title>你想知道啥</title>
</head>

<body>
    <form action="hello" method="post">
        <input name="id" value="${id}">
        <button type="submit">查询</button>
    </form>
    <table>
        <tr>
            <th>ID </th>
            <th>NAME </th>
            <th>PASSWORD </th>
        </tr>
        <tr>
            <td>${one.id}</td>
            <td>${one.name}</td>
            <td>${one.password}</td>
        </tr>
    </table>
</body>

</html>
