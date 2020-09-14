package com.example.student.model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Student {

    private String id;

    private String name;

    @TableField(exist = false)
    private Teacher teacher;
}
