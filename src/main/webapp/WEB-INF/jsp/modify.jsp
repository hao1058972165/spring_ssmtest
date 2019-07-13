<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 10589
  Date: 2019/6/28
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="modify" enctype="multipart/form-data" method="post">
<table>
    <tr><td>编号：</td><td><input type="text" value="${detail.id}" name="id"></td></tr>
    <tr><td>姓名：</td><td><input type="text" value="${detail.name}" name="name"></td></tr>
    <tr><td>生日：</td><td><input type="text" value="${detail.birthday}" name="birthday"></td></tr>
    <tr><td>性别：</td><td><input type="text" value="${detail.gender}" name="gender"></td></tr>
    <tr><td>职业：</td><td><input type="text" value="${detail.career}" name="career"></td></tr>
    <tr><td>住所：</td><td><input type="text" value="${detail.address}" name="address"></td></tr>
    <tr><td>电话</td><td><input type="text" value="${detail.mobile}" name="mobile"></td></tr>
    <tr><td>头像：</td><td><input type="file" name="file"></td></tr>
    <tr><td><input type="submit" value="修改"><button><a href="page">返回</a></button></td></tr>
</table>
</form>
</body>
</html>
