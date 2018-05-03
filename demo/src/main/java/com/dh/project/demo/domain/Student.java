package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;

public class Student {
    @Id
    private String id;
    private  long ci;
    private  String name;

    public Student() {
    }

    public Student(long ci, String name) {
        this.id = id;
        this.ci = ci;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
