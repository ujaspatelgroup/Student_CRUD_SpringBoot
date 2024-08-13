package com.ecommerce.microservices.student_crud_springboot.dto;

import lombok.Data;

@Data
public class StudentRequestDto {
    private String name;
    private String email;
    private String address;
    private String dob;
    private String gender;
}
