package com.createtom.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Date: 2019/2/27 14:59
 * Description:
 * Modify:
 *
 * @author huwenjian
 */

@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableHystrixDashboard
public class SearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class);
    }



    /**
     * 注册到 Eureka Server 的各个微服务之间可以通过 SpringCloud 自带的组件实现服务之间的调用
     *
     * Ribbon 方式调用
     * Ribbon 是一个客户端负载均衡器，可以很好的控制 HTTP 和 TCP 客户端的行为
     *
     * SearchApplication.java 中完成注入，并标记 @LoadBalanced 开启负载均衡的功能
     *
     * SearchController.java 中通过 RestTemplate 调用服务接口，与常见的 RestTemplate 不同的是，调用使用的不再是 ip + port，而是服务名。这是通过注册中心（Eureka Server）实现的。
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
