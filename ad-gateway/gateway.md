
### 关于 ad-gateway 的介绍及作业  
    https://coding.imooc.com/lesson/310.html#mid=21646

**构造应用的 pom.xml 文件及注释信息**

    <?xml version="1.0" encoding="UTF-8"?>
    <project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <!-- 指定父pom, 在父pom中配置子模块的公共依赖 -->
    <parent>
        <artifactId>imooc-ad</artifactId>
        <groupId>com.imooc.ad</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <modelVersion>4.0.0</modelVersion>

    <!-- 当前项目/模块的坐标, groupId从父模块中继承 -->
    <artifactId>ad-gateway</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <!-- 模块名及描述信息 -->
    <name>ad-gateway</name>
    <description>ad-gateway</description>

    <dependencies>
    
Zuul 的介绍

    ** 在介绍 Zuul 可以提供的功能之前，请大家先考虑一个问题：
    微服务系统中往往包含很多个功能不同的子系统或微服务，那么，外部应用怎样去访问各种各样的微服务呢？这也是 Zuul 所要解决的一个主要问题。 **

    ** 在微服务架构中，后端服务往往不直接开放给调用端，而是通过一个服务网关根据请求的url，路由到相应的服务，即实现请求转发，效果如下图所示。**
    ** Zuul 提供了服务网关的功能，可以实现负载均衡、反向代理、动态路由、请求转发等功能。
       Zuul 大部分功能都是通过过滤器实现的，Zuul 中定义了四种标准的过滤器类型，同时，还支持自定义过滤器（课程中实现了两个自定义过滤器，用来记录访问延迟）。
       这些过滤器的类型也对应于请求的典型生命周期，如下图所示。**    
       
       pre：在请求被路由之前调用
       
       route：在路由请求时被调用
       
       post：在 route 和 error 过滤器之后被调用
       
       error：处理请求时发生错误时被调用
       
任务

    作业1：Zuul 的功能大部分都是由过滤器实现的，你还可以定义怎样的过滤器实现你想要的功能呢 ？
    说明：大家可以将自己的答案发布到右侧的问答区，老师会针对大家回答的情况给予点评。
    作业2：如果要给我们的系统接入用户模块（用户和权限），放在网关里面做合适吗 ？
    说明：大家可以将自己的答案发布到右侧的问答区，老师会针对大家回答的情况给予点评。       