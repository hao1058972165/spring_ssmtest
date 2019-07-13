<%--
  Created by IntelliJ IDEA.
  User: 10589
  Date: 2019/7/9
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.4.1.js"></script>
    <script>
        $(function(){
            $(".name").hidden(function () {
                var name = $(this).attr("name");
                alert(name);
            })
        });
    </script>
</head>
<body>
    <form>
        <table>
            <tr>
                <td>姓名</td>
                <td><input type="text" class="name"></td>
            </tr>
        </table>
    </form>
</body>
</html>
