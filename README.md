
# sdk4 cloud example

sdk4.com 云服务架构项目示例，云服务基于 `spring cloud`。

## 项目说明

- sdk4-cloud-parent

    Maven Parent POMs，定义 jar 依赖，所有项目均使用该项目作为自己的 parent，不能自己定义依赖 jar 的版本，统一管理，防止冲突。

- sdk4-cloud-config

    统一配置中心，服务端口：`9010`

- sdk4-cloud-server

    服务注册中心，服务端口：`9011`

- sdk4-cloud-monitor

    链路监控，服务端口：`9012`

- sdk4-cloud-gateway

    服务网关，服务端口：`9020`

- sdk4-cloud-base

    基础通用部分，用户、菜单、权限、短信等基础通用功能，服务端口：`9030`

- sdk4-cloud-biz-xxx

    各业务模块，服务端口：`9051` ~ `9059`

- sdk4-cloud-demo-client

    客户端调用示例，服务端口：`9001`

- sdk4-cloud-ui

    UI主要用到以下框架：

    - [`ant.design pro`](http://ant-design-pro.gitee.io/index-cn)
    - [`Element`](http://element-cn.eleme.io/)

## Java 项目包名规范

- com.sdk4.cloud 云服务基础
    - com.sdk4.cloud.config 配置中心
    - com.sdk4.cloud.server 注册中心
    - com.sdk4.cloud.gateway 网关
    - com.sdk4.cloud.monitor 链路监控

- com.sdk4.base

    基础通用部分基础包名

- com.sdk4.biz.xxx

    业务模块基础包名

**基础包名下包名说明**

- annotation 注解
- config 配置
- domain 数据库实体类
- enums 枚举类型
- exception 异常类
- repository 数据库JPA
- service 服务接口
- service.impl 服务接口实现
- util 工具类
- web web服务层

## 代码规范

代码规范遵守：<https://vipshop.github.io/vjtools/#/standard/>

补充：

- 对一个数据库表的实体类的操作只能出现在一个服务类中，其他地方需要访问时，通过接口

## 编译发布

