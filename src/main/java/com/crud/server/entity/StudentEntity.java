package com.crud.server.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class StudentEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int rollNumber;
    private int age;
    private String email;

    @Column(name = "mobile_number") // optional: maps Java field to DB column
    private int mobileNumber;

    // Constructors
    public StudentEntity() {}

    public StudentEntity(String name, int rollNumber, int age, int mobileNumber,String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.email=email;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) { // changed parameter type to Long to match the field
        this.id = id;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    
}
