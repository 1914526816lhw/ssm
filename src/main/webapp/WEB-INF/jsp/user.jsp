<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
id:${requestScope.user.userId}<br/>
姓名:${requestScope.user.userName}<br/>
性别:${requestScope.user.userSex}<br/>
年龄:${requestScope.user.userAge}<br/>
测试变量:${requestScope.time}<br/>

</body>
</html>