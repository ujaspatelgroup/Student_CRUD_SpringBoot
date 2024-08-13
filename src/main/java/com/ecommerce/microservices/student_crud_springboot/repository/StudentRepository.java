package com.ecommerce.microservices.student_crud_springboot.repository;

import com.ecommerce.microservices.student_crud_springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
