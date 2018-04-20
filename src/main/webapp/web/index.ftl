<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="${ctx.contextPath}/assets/index/css/public.css"/>
</head>
<body>

    <#include "header.ftl"/>

    <h2>欢迎您！</h2>
    项目根路径：${ctx.contextPath!}

    <@shiro.guest>
        您当前是游客，<a href="${ctx.contextPath}/auth/login.html" class="dropdown-toggle qqlogin" >登录</a>
    </@shiro.guest>

    <br/>
    <@shiro.user>
        欢迎[<@shiro.principal/>]登录，<a href="${ctx.contextPath}/auth/signOut.html">退出</a>
    </@shiro.user>

    <br/>
    <@shiro.authenticated>
	    用户[<@shiro.principal/>]已身份验证通过
    </@shiro.authenticated>

    <br/>
    <@shiro.notAuthenticated>
        当前身份未认证（包括记住我登录的）
    </@shiro.notAuthenticated>

    <br/>
    <@shiro.hasRole name="ROLE_ADMIN">
	    用户[<@shiro.principal/>]拥有角色admin<br/>
    </@shiro.hasRole>

    <br/>
    <@shiro.hasAnyRoles name="admin,user,member">
        用户[<@shiro.principal/>]拥有角色admin或user或member<br/>
    </@shiro.hasAnyRoles>

    <br/>
    <@shiro.lacksRole name="ROLE_USER">
        用户[<@shiro.principal/>]不拥有admin角色
    </@shiro.lacksRole>

    <br/>
    <@shiro.hasPermission name="user:add">
        用户[<@shiro.principal/>]拥有user:add权限
    </@shiro.hasPermission>

    <br/>
    <@shiro.lacksPermission name="user:add">
        用户[<@shiro.principal/>]不拥有user:add权限
    </@shiro.lacksPermission>

    <#include "footer.ftl"/>
</body>
</html>