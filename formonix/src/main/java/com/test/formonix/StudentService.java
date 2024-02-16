package com.test.formonix;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository repository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository repository, StudentMapper studentMapper) {
        this.repository = repository;
        this.studentMapper = studentMapper;
    }

    public StudentResponseDto saveStudnet(StudentDto dto) {
        var student = studentMapper.toStudent(dto);
        var savedStudent = repository.save(student);
        return studentMapper.toStudentResponseDto(savedStudent);
    }

    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    public Student findStudentById(Integer id) {
        return repository.findById(id)
                .orElse(new Student());

    }

    public List<Student> findAllStudentByName(String name) {
        return repository.findAllByFirstnameContaining(name);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
