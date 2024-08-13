package com.ecommerce.microservices.student_crud_springboot.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_student")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String address;
    private String dob;
    private String gender;
}
