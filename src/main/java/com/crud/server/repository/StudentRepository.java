package com.crud.server.repository;
import  com.crud.server.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

    
}
