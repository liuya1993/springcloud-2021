package cn.siwen.springcloud.controller;


import cn.siwen.springcloud.config.CommonResult;
import cn.siwen.springcloud.entity.Payment;
import cn.siwen.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paymentController {
    @Autowired
    private PaymentService paymentService;


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/get/{id}")
    public CommonResult findByIdPayment(@PathVariable("id") Long id){

            return new CommonResult(200,serverPort+"查询出来的数据为:",id);

    }


}
