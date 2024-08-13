package com.ecommerce.microservices.student_crud_springboot.service;

import com.ecommerce.microservices.student_crud_springboot.dto.StudentRequestDto;
import com.ecommerce.microservices.student_crud_springboot.model.Student;
import com.ecommerce.microservices.student_crud_springboot.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Student createUser(StudentRequestDto student) {
        return studentRepository.save(modelMapper.map(student, Student.class));
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudent(long id) {
        return Optional.of(studentRepository.findById(id).isPresent() ? studentRepository.findById(id).get() : null);
    }

    @Override
    public void updateStudent(StudentRequestDto studentRequestDto, long id) {
        Student student = studentRepository.findById(id).isPresent() ? studentRepository.findById(id).get() : null;
        if (student != null) {
            student.setId(id);
            modelMapper.map(studentRequestDto, student);
            studentRepository.save(student);
        }
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
