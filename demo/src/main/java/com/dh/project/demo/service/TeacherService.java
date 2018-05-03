package com.dh.project.demo.service;

import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    private static final List<Teacher> listTeacher = new ArrayList<>();

    @Autowired
    private TeacherRepository teacherRepository;

    public TeacherService(){
        listTeacher.add(new Teacher(0,"Rudy"));
        listTeacher.add(new Teacher(1,"Carlitos"));
        listTeacher.add(new Teacher(2,"Jorgito"));
        listTeacher.add(new Teacher(3,"Noemi"));
    }

    // CRUD
    // List Teachers
    public List<Teacher> getAllTeachers(){
        //get all documents from collection teacher
        return teacherRepository.findAll();

        // get all teacher from DB
        //return listTeacher;
    }
    // Add new Teacher
    public void addNewTeacher(Teacher newTeacher){
        // insert new Teacher into DB
        teacherRepository.save(newTeacher);
        //listTeacher.add( newTeacher);
    }

    // Delete Teacher by Id
    @Deprecated
    public void deleteTeacher(int id){
        // delete a teacher by id in DB
        listTeacher.remove(id);
    }

    public void deleteTeacher(String id){
        // delete a teacher by id in DB
        teacherRepository.delete(id);
        //listTeacher.remove(id);
    }

    // Get a teacher By Id
    @Deprecated
    public Teacher getTeacherById(int id){
        // get a Teacher by id from DB
        return listTeacher.get(id);
    }

    public Teacher getTeacherById(String id){
        // get a Teacher by id from DB
        return teacherRepository.findOne(id);
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
