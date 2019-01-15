package com.zl.springbootquickdemo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C)，XX
 * FileName: Person
 * Author: zl
 * Date: 2019/1/9  21:31
 * Description: YML测试的实体类,将配置文件中每一个属性的值映射到Person这个组件中
 **/

@Component
@ConfigurationProperties(prefix = "person")
@Validated //校验注解
public class Person {

    private String  name;
    private Integer age;
    private boolean isMan;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Student student;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", student=" + student +
                ", email='" + email + '\'' +
                '}';
    }
}
