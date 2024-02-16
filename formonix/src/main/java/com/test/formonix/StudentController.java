package com.test.formonix;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/students")
    public Student post(
            @RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/students")
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @GetMapping("/students/{student-id}")
    public Student findAllStudentById(
            @PathVariable("student-id") Integer id) {
        return repository.findById(id)
                .orElse(new Student());
    }

    @GetMapping("/students/search/{student-name}")
    public List<Student> findAllStudentByName(
            @PathVariable("student-name") String name) {
        return repository.findAllByFirstnameContaining(name);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(
            @PathVariable("student-id") Integer id) {
        repository.deleteById(id);
    }

}
