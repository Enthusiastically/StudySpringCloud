package com.hystrix.controller;

import com.hystrix.entity.Student;
import com.hystrix.feign.OpenFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Resource
    private OpenFeign openFeign;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return openFeign.findAll();
    }
}
