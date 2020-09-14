package com.example.teacher.controller;

import com.example.teacher.mapper.TeacherMapper;
import com.example.teacher.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RefreshScope
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherMapper teacherMapper;

    @PostMapping("/detail")
    public Object getTeacherDetail(@RequestBody @Valid Teacher studentVo){
        return teacherMapper.selectById(studentVo.getId());
    }

}
