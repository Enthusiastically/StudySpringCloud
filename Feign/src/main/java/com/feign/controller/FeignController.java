package com.feign.controller;

import com.feign.entity.Student;
import com.feign.feign.OpenFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private OpenFeign openFeign;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return openFeign.findAll();
    }
}
