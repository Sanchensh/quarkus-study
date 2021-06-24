package com.mrxu.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jlxu@telenav.cn
 * @date 2021/6/24 14:54
 */
@Data
@Entity(name = "user")
@Table(name = "user")
public class User {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
}
