<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2019/7/10
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.4.1.js"></script>
    <script type="application/javascript">
        $(function () {
            $(".btn").click(function () {
                    var id = $(this).attr("id")
                    alert("1222");
                $.get("/updateList",{lid:id},function (data){
                    alert("处理完成");
                    $("#tr"+id).remove();
                },"text")
            })

        })
    </script>
</head>
<body>
<table border="1">
    <tr>
        <th>序号</th>
        <th>请假人</th>
        <th>开始时间</th>
        <th>结束时间</th>
        <th>请假理由</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${leaveList}" var="hh" varStatus="i">
        <tr id="tr${hh.lid}">
            <td>${i.count}</td>
            <td>${hh.user.username}</td>
            <td>${hh.startdate}</td>
            <td>${hh.enddate}</td>
            <td>${hh.reason}</td>
            <td><button class="btn" id="${hh.lid}" >kkp</button></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>