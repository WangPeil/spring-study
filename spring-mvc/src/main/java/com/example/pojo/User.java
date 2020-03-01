package com.example.pojo;

import java.util.List;

/**
 * @author peili.wang
 * @date 2020/2/24 18:10
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private List<String> book;

    public User() {
    }

    public User(Integer id, String name, Integer age, List<String> book) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.book = book;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getBook() {
        return book;
    }

    public void setBook(List<String> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }
}
