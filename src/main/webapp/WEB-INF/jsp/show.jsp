<%--
  Created by IntelliJ IDEA.
  User: 10589
  Date: 2019/6/28
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>show</title>
    <script src="/js/jquery-3.4.1.js"></script>
    <script>
        $(function(){
            $(".delBtn").click(function(){
                var id = $(this).attr("id");
                // $("#tr" + id).remove();
                $.get("delete/"+id,function (d) {
                    alert(d.resp);
                    $("#tr" + id).remove();
                },"json")
            });
        })
    </script>
</head>
<body>
        <form >
            <table cellpadding="2">
                欢迎,${user.username}<a href="/display">退出</a><a href="/leave">申请请假</a>
                <a href="/leaveList">查看请假</a>
                    <tr>
                        <th>编号</th>
                        <th>姓名</th>
                        <th>生日</th>
                        <th>性别</th>
                        <th>职业</th>
                        <th>住所</th>
                        <th>电话</th>
                        <th>操作</th>
                        <th>所属管理</th>
                    </tr>
                    <c:forEach items="${show}" var="imp">
                        <tr id="tr${imp.id}">
                            <td>${imp.id}</td>
                            <td>${imp.name}</td>
                            <td>${imp.birthday}</td>
                            <td>${imp.gender}</td>
                            <td>${imp.career}</td>
                            <td>${imp.address}</td>
                            <td>${imp.mobile}</td>
                            <td><a href="detail?id=${imp.id}">明细</a>|<a href="premodify?id=${imp.id}">修改</a>|<a href="javascript:void(0)" class="delBtn" id="${imp.id}">删除</a></td>
                            <td>${imp.user.username}</td>
                        </tr>
                    </c:forEach>
            </table>
            共${page.pages}页
            <c:if test="${!page.isFirstPage}">
            <a href="/page?currentpage=${page.firstPage}">首页</a><a href="/page?currentpage=${page.prePage}">上一页</a>
        </c:if>
            <c:if test="${!page.isLastPage}">
                <a href="\[[0page?currentpage=${page.nextPage}">下一页</a>
                <a href="/page?currentpage=${page.lastPage}">尾页</a>
            </c:if>

        </form>
</body>
</html>
