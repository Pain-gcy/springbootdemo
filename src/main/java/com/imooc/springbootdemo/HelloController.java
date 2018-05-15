package com.imooc.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author E470
 * @create 2018 - 05 - 11 13:58
 */
@RestController
@RequestMapping("/demo")
public class HelloController {

    @Autowired
    private Girlpeoperties girlpeoperties;

    @Value("${test}")
    private String test;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world !"+test+"----"+girlpeoperties.getCupSize()+"----"+girlpeoperties.getAge();
    }

    @RequestMapping(value = "/helloo/{id}",method = RequestMethod.GET)
    public String helloo(@PathVariable("id") Integer id){
        return "hello world !"+id;
    }

    //@RequestMapping(value = "/hellooo",method = RequestMethod.GET)
    @GetMapping(value = "/hellooo")
    public String hellooo(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "hello world !"+id;
    }
}
