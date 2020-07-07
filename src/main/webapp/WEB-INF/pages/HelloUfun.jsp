<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/7
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%-- <form action="ufun" method="post">
       id:  <input name="id" value="${id}"/> <br>
        <button type="submit" value="提交"/>
    </form>--%>

    <form action="" method="post">
        code : <input name="code" type="text" value="${user.code}"/> <br>
        password: <input type="text" value="${user.password} "><br>
        state : <input value="${user.state}">  <br>
        phone : <input value="${user.phone}">  <br>

        <input type="submit" value="查询"/>
    </form>


</body>
</html>
