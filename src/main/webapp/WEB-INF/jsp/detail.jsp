<%--
  Created by IntelliJ IDEA.
  User: 10589
  Date: 2019/6/28
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<tr><td>编号：</td><td>${detail.id}</td></tr>
<tr><td>姓名：</td><td>${detail.name}</td></tr>
<tr><td>生日：</td><td>${detail.birthday}</td></tr>
<tr><td>性别：</td><td>${detail.gender}</td></tr>
<tr><td>职业：</td><td>${detail.career}</td></tr>
<tr><td>住所：</td><td>${detail.address}</td></tr>
<tr><td>电话:</td><td>${detail.mobile}</td></tr>
<tr><td>头像:</td></tr>
    <tr><td><img src="${detail.picture}" width="66px"></td></tr>
</table>
</body>
</html>
