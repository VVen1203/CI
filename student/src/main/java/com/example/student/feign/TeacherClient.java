package com.example.student.feign;

import com.example.student.model.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="teacher",fallback=TeacherClientFallBack.class)
public interface TeacherClient {

    @RequestMapping(method = RequestMethod.POST, value = "/teacher/detail")
    Teacher getTeacherDetail(@RequestBody Teacher teacher);
}
