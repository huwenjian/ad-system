package com.createtom.ad.client;

import com.createtom.ad.client.vo.AdPlan;
import com.createtom.ad.client.vo.AdPlanGetRequest;
import com.createtom.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Date: 2019/2/27 15:41
 * Description: 断路器 熔断
 * Modify:
 *
 * @author huwenjian
 */
@Component
public class SponsorClientHystrix implements SponsorClient {


    /**
     * Feign 方式调用
     * Feign 可以实现声明式的 Web 服务客户端
     * 通过 @FeignClient 指定调用的服务名称
     * 在接口上声明 @RequestMapping 指明调用服务的地址与请求类型
     * 通过在 @FeignClient 中配置 fallback 指定熔断
     * 实现接口：SponsorClient.java，熔断：SponsorClientHystrix.java
     */
    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(AdPlanGetRequest request) {
        return new CommonResponse<>(-1, "eureka-client-ad-sponsor error");
    }

}
