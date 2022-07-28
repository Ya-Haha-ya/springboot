package com.xz.controller;

import com.xz.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuFooController {

    @Autowired
    private StuService stuService;

    @GetMapping(path = "/getStu")
    public Object getStu(int id) {
        return stuService.getStuInfo(id);
    }

    @PostMapping(path = "/saveStu")
    public Object saveStu() {
        stuService.saveStu();
        return "OK";
    }

    @PostMapping(path = "/updateStu")
    public Object updateStu(int id) {
        stuService.updateStu(id);
        return "OK";
    }

    @PostMapping(path = "/deleteStu")
    public Object deleteStu(int id) {
        stuService.deleteStu(id);
        return "OK";
    }

}
