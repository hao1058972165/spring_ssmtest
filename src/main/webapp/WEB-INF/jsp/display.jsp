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
    <title>主界面</title>
</head>
<body>
        <form action="login" method="post">
            <table align="center">
                <h3 align="center">人员档案管理系统</h3>
                <tr><td align="right">用户名：</td>
                    <td><input type="text" name="username"></td></tr>
                <tr><td align="right">密码：</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr><td></td>
                    <td><input type="submit" value="登录"><button><a href="register">注册</a></button></td>
                </tr>
            </table>
        </form>
</body>
</html>
