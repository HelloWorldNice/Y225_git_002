<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-12-2
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/account/register" method="POST">
        用户名:<input type="text" name="name"/><br/>
        年龄:<input type="text" name="age"/><br/>
        余额:<input type="text" name="balance"/><br/>
        <input value="注册" type="submit"/>
    </form>


</body>
</html>
