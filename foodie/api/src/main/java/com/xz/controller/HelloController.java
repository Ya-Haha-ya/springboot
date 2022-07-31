package com.xz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class HelloController {

    private int count = 0;

    @GetMapping(path = "/hello")
    public Object hello() {
        count++;
        return "Hello world " + count;
    }
}
