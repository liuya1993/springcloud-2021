package cn.siwen.springcloud.controller;


import cn.siwen.springcloud.service.PaymentHystrixServier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class paymentController {

    @Autowired
    PaymentHystrixServier paymentHystrixServier;

    @GetMapping("/ok/{id}")
    public String paymentInfo_OK(@PathVariable Integer id) {
        return paymentHystrixServier.paymentInfo_OK(id);
    }

    @GetMapping("/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable Integer id) {
        log.info("timeout");
        return paymentHystrixServier.paymentInfo_TimeOut(id);
    }


    //===服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result = paymentHystrixServier.paymentCircuitBreaker(id);
        log.info("*******result:"+result);
        return result;
    }





}
