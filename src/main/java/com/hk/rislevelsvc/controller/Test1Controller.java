package com.hk.rislevelsvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxi
 */
@RestController
@RequestMapping("v1/test")
public class Test1Controller {

    @GetMapping("demo")
    public String getMessage(){
        return "this is springboot test";
    }
}
