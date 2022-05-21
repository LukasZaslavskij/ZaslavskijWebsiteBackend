package com.personalWebsite.ZaslavskijWebsite.entity;

import javax.persistence.*;
import java.io.Serializable;

public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private int id;
    @Column(nullable = false)
    private String name;
    private String level;
    private String practise;

    public Skill() {}

    public Skill(String name, String level, String practise) {
        this.name = name;
        this.level = level;
        this.practise = practise;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String getPractise() {
        return practise;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setPractise(String practise) {
        this.practise = practise;
    }
    @Override
    public String toString(){
        return "Skill{"+
                "name='" + name + '\'' +
                ",level='" + level + '\'' +
                ",practise='" + practise + '\'' +
                '}';
    }
}
