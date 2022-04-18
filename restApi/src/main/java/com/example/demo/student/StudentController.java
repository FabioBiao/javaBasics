package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // this makes this class server rest endpoints
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired // and after that we add @Component/@Service on the service...
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    //public String Hello() {
    //	return "hello world";
    public List<Student> getStudents() {
        // return List.of("hello", "world"); // retuns json now!
        return studentService.getStudents();

    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
            ){
        studentService.updateStudent(studentId,name,email);
    }
}
