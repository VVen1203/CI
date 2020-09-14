package com.example.student.controller;

import com.example.student.feign.TeacherClient;
import com.example.student.mapper.StudentMapper;
import com.example.student.model.Student;
import com.example.student.model.Teacher;
import com.example.student.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RefreshScope
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherClient teacherClient;

    @PostMapping("/detail")
    public Object getStudentDetail(@RequestBody @Valid StudentVo studentVo){
        Student student = studentMapper.selectById(studentVo.getId());
        Teacher teacher = new Teacher();
        teacher.setId("1");
        teacher = teacherClient.getTeacherDetail(teacher);
        student.setTeacher(teacher);
        return student;
    }

}
