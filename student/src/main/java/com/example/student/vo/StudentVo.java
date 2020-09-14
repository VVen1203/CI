package com.example.student.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class StudentVo {

    @NotBlank(message = "id != null")
    private String id;

}
