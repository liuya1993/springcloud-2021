package cn.siwen.springcloud.service.impl;

import cn.siwen.springcloud.entity.Payment;
import cn.siwen.springcloud.mapper.PaymentMapper;
import cn.siwen.springcloud.service.PaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
