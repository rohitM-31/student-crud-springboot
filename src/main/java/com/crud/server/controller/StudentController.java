package com.crud.server.controller;

import com.crud.server.entity.StudentEntity;
import com.crud.server.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService service;

    // GET all students → /api/students/all
    @GetMapping("/all")
    public List<StudentEntity> getAllStudents() {
        return service.getAllStudents();
    }

    // GET student by ID → /api/students/get/{id}
    @GetMapping("/get/{id}")
    public ResponseEntity<StudentEntity> getStudent(@PathVariable Long id) {
        return service.getStudentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST create student → /api/students/add
    @PostMapping("/addStudents")
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return service.createStudent(student);
    }

    // PUT update student → /api/students/update/{id}
    @PutMapping("/update/{id}")
    public ResponseEntity<StudentEntity> updateStudent(
            @PathVariable Long id,
            @RequestBody StudentEntity student) {
        try {
            StudentEntity updated = service.updateStudent(id, student);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE student → /api/students/delete/{id}
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
