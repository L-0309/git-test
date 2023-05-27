package com.atguigu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: git-test
 * @BelongsPackage: com.atguigu.controller
 * @Author: Tomcat
 * @CreateTime: 2023-05-27  16:26
 * @Description:
 * @Version: 1.0
 */
@RestController
public class IndexController {
    @GetMapping("/i")
    public String u(){
        return "hi,首次";
    }
    @GetMapping("/ip")
    public String uc(){
        return "uc";
    }
    @GetMapping("/im")
    public String um(){
        return "um";
    }
    @GetMapping("/test")
    public String test(){
        return "分支切换";
    }
    @GetMapping("/test1")
    public String test1(){
        return "master test";
    }
}
