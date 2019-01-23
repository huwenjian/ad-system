### spring-cloud 改变系统etc server name
 ~地址： C:\Windows\System32\drivers\etc\hosts

 ~增加如下内容

    127.0.0.1   server1 server2 server3

 ~打包

    mvn clean package -Dmaven.test.skip=true -U
    ~~~ 跳过test -U 强制打包


### 启动Eureka集群
    java -jar ad-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=server1
    java -jar ad-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=server2
    java -jar ad-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=server3
