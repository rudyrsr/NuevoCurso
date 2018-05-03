package com.dh.project.demo.service;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private static final List<Student>  studentList = new ArrayList<>();

    @Autowired
    private StudentRepository studentRepository;

    public StudentService(){
        studentList.add(new Student(0,"est1"));
        studentList.add(new Student(1,"est2"));
        studentList.add(new Student(2,"est3"));
        studentList.add(new Student(3,"est4"));
    }

    // CRUD
    // List Teachers
    public List<Student> getAllStudents(){
        //get all documents from collection teacher
        return studentRepository.findAll();

        // get all teacher from DB
        //return listTeacher;
    }
    // Add new Teacher
    public void addNewStudent(Student newStudent){
        // insert new Teacher into DB
        studentRepository.save(newStudent);
        //listTeacher.add( newTeacher);
    }

    // Delete Teacher by Id
    @Deprecated
    public void deleteStudent(int id){
        // delete a teacher by id in DB
        studentList.remove(id);
    }

    public void deleteStudent(String id){
        // delete a teacher by id in DB
        studentRepository.delete(id);
        //listTeacher.remove(id);
    }

    // Get a teacher By Id
    @Deprecated
    public Student getStudentById(int id){
        // get a Teacher by id from DB
        return studentList.get(id);
    }

    public Student getStudentById(String id){
        // get a Teacher by id from DB
        return studentRepository.findOne(id);
        //return listTeacher.get(id);
    }


/*
    public TeacherService(){
        listTeacher.add(new Teacher(1,"Rudy"));
        listTeacher.add(new Teacher(2,"Carlitos"));
        listTeacher.add(new Teacher(3,"Jorgito"));
        listTeacher.add(new Teacher(4,"Noemi"));
    }

    public List<Teacher> getAllTeacher(){

        return listTeacher;

    }

    public void deleteTeacher(long Id){
        System.out.println("Teacher to Telete" + listTeacher.get((int)Id));
    }

    public void addTeacher(Teacher teacher){
        listTeacher.add(teacher);
        System.out.println("teacher to add is "+ teacher.getName());
    }

    public void updateTeacher(Teacher teacher, long id){
        listTeacher.set((int)(id), teacher);
        System.out.println(listTeacher);
    }

    public Teacher getById(long id){
        System.out.println(listTeacher);
        return listTeacher.get((int)id);

    }*/
}

