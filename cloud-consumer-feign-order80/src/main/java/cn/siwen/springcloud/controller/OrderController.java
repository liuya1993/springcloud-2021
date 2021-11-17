package cn.siwen.springcloud.controller;


import cn.siwen.springcloud.Service.PaymentFeignService;
import cn.siwen.springcloud.config.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

   @Resource
   PaymentFeignService paymentFeignService;

    @GetMapping("/order/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){

        return paymentFeignService.getPaymentById(id);
    };






}
