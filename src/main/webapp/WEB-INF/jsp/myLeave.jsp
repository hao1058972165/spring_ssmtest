<%--
  Created by IntelliJ IDEA.
  User: 10589
  Date: 2019/7/13
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>序号</th>
        <th>请假人</th>
        <th>开始时间</th>
        <th>结束时间</th>
        <th>请假理由</th>
    </tr>
    <c:forEach items="${myleave}" var="hh" varStatus="i">
        <tr>
            <td>${i.count}</td>
            <td>${hh.user.username}</td>
            <td>${hh.startdate}</td>
            <td>${hh.enddate}</td>
            <td>${hh.reason}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
