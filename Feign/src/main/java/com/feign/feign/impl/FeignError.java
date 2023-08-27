package com.feign.feign.impl;

import com.feign.entity.Student;
import com.feign.feign.OpenFeign;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements OpenFeign {
    @Override
    public Collection<Student> findAll() {
        System.out.println("服务已被熔断！");
        return null;
    }
}
