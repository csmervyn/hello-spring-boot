package org.github.mervyn.core.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexinxin
*  Date: 2017/8/15
*  Time: 15:08
*  Description:
 */
@RestController
public class HelloSpringBootController {
    @RequestMapping("/")
    public String helloSpringBoot(){
        return "Hello Spring Boot!";
    }
    @RequestMapping("/whoAreYou")
    public String whoAreYou(){
        return "A:我们是谁？  " +
                "B:程序员  " +
                "A:我们是干什么的？  " +
                "B:堆代码  " +
                "A:最好的语言是什么？  " +
                "B:PHP!!!";
    }
}
