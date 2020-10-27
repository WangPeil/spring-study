package com.example.pojo;

import lombok.Data;

import java.sql.Timestamp;


/**
 * @author wangpeil
 */
@Data
public class User {
    private Integer id;
    private String username;
    private Integer age;
}
