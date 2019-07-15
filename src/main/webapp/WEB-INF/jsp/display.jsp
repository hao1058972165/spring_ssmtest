<%--
  Created by IntelliJ IDEA.
  User: 10589
  Date: 2019/6/28
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>登录页面</h3>
<form action="login" method="post">
    <table align="center">
        <tr>
            <td>
                <span>用户名：</span>
            </td>
            <td>
                <input type="text" name="username" />
            </td>
        </tr>
        <tr>
            <td>
                <span>密码：</span>
            </td>
            <td>
                <input type="text" name="password" />
            </td>
        </tr>
        <tr>
            <td>
                角色：
            <td>
                <input type="radio" name="status" value="0" >讲师
                <input type="radio" name="status" value="1"checked>学生
            </td>
            </td>
        </tr>
        <tr>
            <td>
                <button>登录</button>
            </td>
        </tr>
    </table>
</form>



</body>
</html>
