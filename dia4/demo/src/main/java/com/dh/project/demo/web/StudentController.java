package com.dh.project.demo.web;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(path="/{id}",method = RequestMethod.GET)
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addNewStudent(@RequestBody Student newStudent){
        System.out.println("the Name of new student is "+newStudent.getName());
        studentService.addNewStudent(newStudent);
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable String id){
        System.out.println("the Id delete is " + id);
        studentService.deleteStudent(id);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteStudentByRequ(@RequestBody Student student){
        System.out.println("the id of student to delete is "+ student.getCi());
        studentService.deleteStudent(student.getId());

    }

}
