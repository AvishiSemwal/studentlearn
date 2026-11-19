

package com.learn.demo.controller;
 
import java.util.List;
 
import org.springframework.web.bind.annotation.*;

import com.learn.demo.entity.Student;
import com.learn.demo.service.StudentService;
 
@RestController

@RequestMapping("/api/students")

public class StudentController {
 
    private final StudentService studentService;
 
    public StudentController(StudentService studentService) {

        this.studentService = studentService;

    }
 
    // INSERT Student

    @PostMapping

    public Student addStudent(@RequestBody Student student) {

        return studentService.saveStudent(student);

    }
 
    // GET All Students

    @GetMapping

    public List<Student> getAllStudents() {

        return studentService.getAllStudents();

    }
 
    // GET Student by ID

    @GetMapping("/{id}")

    public Student getStudent(@PathVariable int id) {

        return studentService.getStudentById(id);

    }
 
    // DELETE Student

    @DeleteMapping("/{id}")

    public String deleteStudent(@PathVariable int id) {

        studentService.deleteStudent(id);

        return "Student deleted successfully";

    }

}

 