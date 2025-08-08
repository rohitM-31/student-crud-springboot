package com.crud.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.server.entity.StudentEntity;
import com.crud.server.repository.StudentRepository;

import java.util.*;

@Service
public class StudentService {

   @Autowired
    private StudentRepository repository;

    public List<StudentEntity> getAllStudents() {
        return repository.findAll();
    }

    public Optional<StudentEntity> getStudentById(Long id) {
        return repository.findById(id);
    }

    public StudentEntity createStudent(StudentEntity student) {
        return repository.save(student);
    }

    public StudentEntity updateStudent(Long id, StudentEntity newData) {
        return repository.findById(id).map(student -> {
            student.setName(newData.getName());
            student.setEmail(newData.getEmail());
            student.setAge(newData.getAge());
            student.setRollNumber(newData.getRollNumber());
            student.setMobileNumber(newData.getMobileNumber());
            return repository.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
