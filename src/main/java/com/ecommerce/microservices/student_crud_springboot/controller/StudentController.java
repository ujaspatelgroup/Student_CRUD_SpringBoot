package com.ecommerce.microservices.student_crud_springboot.controller;

import com.ecommerce.microservices.student_crud_springboot.dto.StudentRequestDto;
import com.ecommerce.microservices.student_crud_springboot.model.Student;
import com.ecommerce.microservices.student_crud_springboot.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody StudentRequestDto student) {
        return studentService.createUser(student);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Student> getStudentById(@PathVariable long id) {
        return studentService.getStudent(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateStudent(@RequestBody StudentRequestDto studentRequestDto, @PathVariable long id) {
        studentService.updateStudent(studentRequestDto,id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
    }
}
