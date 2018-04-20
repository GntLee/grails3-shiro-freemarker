#grails集成shiro+freemarker+shiro-freemraker-tags


本domo主要集成Grails3+shiro+freemarker+shiro-freemarker-tags实现简单的权限管理功能
    
   重点

```
    *集成shiro
    *集成freemarker
    *集成shiro-freemarker权限管理标签
```

疑问？

```
    1.freemarker模板存放在哪里的？
        答：freemarker模板是存放在src/main/webapp/web/xxx.ftl的文件
    
    2.新建一个控制器如何不登录就访问？
        答：本demo所有控制器都有对应的iterceptor拦截器，通过拦截器来配置拦截是否需要权限，拦截器里面有个order字段为拦截器的优先级，该值越小越优先
        里面的map==>anon为不需要权限的控制器及方法
```
注：本项目还简单配置了urlMapping实现伪静态。




页面标签使用参考：[CSDN](https://blog.csdn.net/ljzdiamond/article/details/8941596)