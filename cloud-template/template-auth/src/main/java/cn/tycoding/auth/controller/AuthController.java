package cn.tycoding.auth.controller;

import cn.tycoding.auth.feignservice.AuthFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    AuthFeignService authFeignService;
    @GetMapping("/feignHello/{name}")
    public String hello(@PathVariable String name){
        return authFeignService.hello(name);
    }
    @GetMapping("/hello/{name}")
    public String hellos(@PathVariable String name){
        return "hello " + name + ", this is template-admin";
    }

}
