package com.jay.emissioncompilation.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户表
 */
@Entity
@Table(name = "USER_INFO")
public class User {
    /**
     * 主键
     */
    private String id;
    /**
     * 姓名
     */
    private String name;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Column(length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
