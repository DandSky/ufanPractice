<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/3
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>This is the second pages</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>用户名</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${HelloAll}" var="one"><%--这里的c就是上面那个，item就是传过来的列表，var就是每一遍循环的对象（可以自己命名）--%>
        <tr>
            <td>${one.id}</td>            <%--这个user和上面保持一致--%>
            <td>${one.name}</td>
            <td>${one.password}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
