package task;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Controller {
    List<Student> students = List.of(
            new Student(84, "Mani"),
            new Student(99, "Kate"),
            new Student(55, "Kams")
    );

    @GetMapping("/students")
    public List<Student> listStudents() {
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        Student responseStudent = null;
        for (Student student: students) {
            if(student.getId() == id) {
                responseStudent = student;
            }
        }
        return responseStudent;
    }
}
