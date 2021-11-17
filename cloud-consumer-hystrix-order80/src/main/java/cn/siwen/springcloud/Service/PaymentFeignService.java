package cn.siwen.springcloud.Service;


import cn.siwen.springcloud.Service.impl.PaymentFallbackFeignService;
import cn.siwen.springcloud.config.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "cloud-provider-hystrix-payment",fallback = PaymentFallbackFeignService.class)
public interface PaymentFeignService {
    @GetMapping("/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
