<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登入 - layuiAdmin</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layuiadmin/style/login.css" media="all">
</head>
<body>

<div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">
    <div class="layadmin-user-login-main">
        <div class="layadmin-user-login-box layadmin-user-login-header">
            <h2>学生宿舍管理系统</h2>
            <p>看起来很有用却很没用的新登录页</p>
        </div>
        <form class="layadmin-user-login-box layadmin-user-login-body layui-form" action="/login" method="post">
            <span class="layui-text-center">${msg}</span>
            <div class="layui-form-item">
                <label class="layadmin-user-login-icon layui-icon layui-icon-username"
                       for="a_username"></label>
                <input type="text" name="a_username" id="a_username"  placeholder="用户名"
                       class="layui-input">
            </div>
            <div class="layui-form-item">
                <label class="layadmin-user-login-icon layui-icon layui-icon-password"
                       for="a_password"></label>
                <input type="password" name="a_password" id="a_password"
                       placeholder="密码" class="layui-input">
            </div>
            <div class="layui-form-item" style="margin-bottom: 20px;">
                <input type="checkbox" name="remember" lay-skin="primary" title="记住密码">
            </div>
            <div class="layui-form-item">
                <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="LAY-user-login-submit">登录</button>
            </div>
        </form>
    </div>
    <div class="layui-trans layadmin-user-login-footer">
        <p>© 2020 <a href="/">/</a></p>
    </div>

</div>

<script src="${pageContext.request.contextPath}/lib/layuiadmin/layui/layui.js"></script>
</body>
<script>
    layui.config({
        base: '/lib/layuiadmin' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    });
</script>
</html>
