package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, String> {

}
