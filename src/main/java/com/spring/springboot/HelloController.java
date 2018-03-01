package com.spring.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther YC
 * @create 2018-03-01 17:47
 */
@RestController
@RequestMapping("/home.php")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, SpringBoot!";
    }
}
