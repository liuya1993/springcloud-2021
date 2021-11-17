package cn.siwen.springcloud.Service.impl;

import cn.siwen.springcloud.Service.PaymentFeignService;
import org.springframework.stereotype.Service;

@Service
public class PaymentFallbackFeignService implements PaymentFeignService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "400 请求失败！";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "400 请求失败！";
    }
}
