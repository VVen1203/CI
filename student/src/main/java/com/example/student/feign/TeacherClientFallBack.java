package com.example.student.feign;

import com.example.student.model.Teacher;
import org.springframework.stereotype.Component;

@Component
public class TeacherClientFallBack implements TeacherClient {

    @Override
    public Teacher getTeacherDetail(Teacher teacher) {
        return teacher;
    }
}
