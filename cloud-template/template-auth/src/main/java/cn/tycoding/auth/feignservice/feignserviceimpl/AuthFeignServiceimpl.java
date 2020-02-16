package cn.tycoding.auth.feignservice.feignserviceimpl;

import cn.tycoding.auth.feignservice.AuthFeignService;
import org.springframework.stereotype.Component;
/**
熔断器使用时需要在@FeignClient注解里面标注熔断后跳转的接口实现类
 */
@Component
public class AuthFeignServiceimpl implements AuthFeignService {
    @Override
    public String hello(String name) {
        return "hello " + name + ", this is template-auth, but request error";
    }
}
