package com.feign.feign;

import com.feign.entity.Student;
import com.feign.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)
public interface OpenFeign {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();
}
