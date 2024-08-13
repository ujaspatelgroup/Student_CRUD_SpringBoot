package com.ecommerce.microservices.student_crud_springboot.service;

import com.ecommerce.microservices.student_crud_springboot.dto.StudentRequestDto;
import com.ecommerce.microservices.student_crud_springboot.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student createUser(StudentRequestDto student);
    public List<Student> getStudents();
    public Optional<Student> getStudent(long id);
    public void updateStudent(StudentRequestDto studentRequestDto, long id);
    public void deleteStudent(long id);
}
