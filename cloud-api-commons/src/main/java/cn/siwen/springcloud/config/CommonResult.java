package cn.siwen.springcloud.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private  T data;
}
