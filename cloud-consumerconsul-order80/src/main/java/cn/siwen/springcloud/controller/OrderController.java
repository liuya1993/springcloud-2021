package cn.siwen.springcloud.controller;


import cn.siwen.springcloud.config.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    public static final String PAYMENT_URL = "http://consul-provider-payment";


    @GetMapping("/order/get")
    public String getPaymentById(){
      return   restTemplate.getForObject(PAYMENT_URL+"/payment/consul",String.class);
    };






}
