package com.example.gz.domain;

/**
 * @author wangjunfeng
 * @version 1.0
 * @desc user model.
 * @since 2019/8/10
 */
public class User {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}