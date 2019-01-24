**关于 ad-eureka 的介绍及作业**
### 构造应用的 pom.xml 文件及注释信息

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
    <artifactId>ad-eureka</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <!-- 模块名及描述信息 -->
    <name>ad-eureka</name>
    <description>Spring Cloud Eureka</description>
    
#### Eureka 的介绍
`核心功能`
    
    ** Service Registry（服务注册）**
    ** Service Discovery（服务发现）**

`基本架构`

    ** Eureka 由三个角色组成：**
    
    ** Eureka Server（这一章实现的功能），提供服务注册与发现 **
    
    ** Service Provider，服务提供方，将自身服务注册到 Eureka Server 上，从而让 Eureka Server 持有服务的元信息，让其他的服务消费方能够找到当前服务 **
    
    ** Service Consumer，服务消费方，从 Eureka Server 上获取注册服务列表，从而能够消费服务 **
    
    ** Service Provider/Consumer 相对于 Server，都叫做 Eureka Client **    
    
#### Eureka Server 的高可用
** 问题说明：
    
    单节点的 Eureka Server 虽然能够实现基础功能，但是存在单点故障的问题，不能实现高可用。因为 Eureka Server 中存储了整个系统中所有的微服务的元数据信息，单节点一旦挂了，所有的服务信息都会丢失，造成整个系统的瘫痪。 **

** 解决办法：

    搭建 Eureka Server 集群，让各个 Server 节点之间互相注册，从而实现微服务元数据的复制/备份，即使单个节点失效，其他的 Server 节点仍可以继续提供服务 **

** Eureka Server 集群架构如下图所示 **    
    
    https://coding.imooc.com/lesson/310.html#mid=21645
    
_作业1：Eureka Server 维护了系统中服务的元信息，这些元信息包含什么你知道吗 ？_    
_作业2：元信息又是怎么存储的呢 ？_