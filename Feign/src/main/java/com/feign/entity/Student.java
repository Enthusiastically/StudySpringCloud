package com.feign.entity;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Student {
    private long id;
    private String name;
    private Integer age;
}
