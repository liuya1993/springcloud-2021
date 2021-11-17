package cn.siwen.springcloud.Service.impl;

import cn.siwen.springcloud.Service.PaymentFeignService;
import cn.siwen.springcloud.config.CommonResult;
import cn.siwen.springcloud.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentFallbackFeignService implements PaymentFeignService {
    @Override
    public CommonResult getPaymentById(Long id) {
        return new CommonResult(404, "OpenFeign兜底方法", new Payment(id, "errorSerial"));
    }
}
