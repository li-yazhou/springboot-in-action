package org.alpha.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
