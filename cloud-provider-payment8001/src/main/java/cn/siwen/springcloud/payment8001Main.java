package cn.siwen.springcloud;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("cn.siwen.springcloud.mapper")
@EnableEurekaClient
public class payment8001Main {
    public static void main(String[] args) {
        SpringApplication.run(payment8001Main.class,args);
    }
}
