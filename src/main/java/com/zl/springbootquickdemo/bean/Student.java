package com.zl.springbootquickdemo.bean;

/**
 * Copyright (C)，XX
 * FileName: Student
 * Author: zl
 * Date: 2019/1/9  21:42
 * Description: YAML测试的实体类
 **/
public class Student {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
