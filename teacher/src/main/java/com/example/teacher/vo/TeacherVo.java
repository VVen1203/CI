package com.example.teacher.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TeacherVo {

    @NotBlank(message = "id != null")
    private String id;

}
