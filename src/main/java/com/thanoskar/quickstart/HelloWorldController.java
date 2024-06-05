package com.thanoskar.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //provided by Spring Web dependency
public class HelloWorldController {

    @GetMapping(path="/hello")
    public String helloWorld(){
        return "Hello World";
    }

}
