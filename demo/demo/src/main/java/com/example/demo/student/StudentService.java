package com.example.demo.student;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents(){

        return studentRepository.findAll();
        /* return  List.of(
              new Student(
                        1l,
                        "Miriam",
                        "miriam.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );*/
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        System.out.println(student);

        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if(!exists){
            throw new IllegalStateException(
                    "student with id " + studentId + " does not exists"
            );
        }
        studentRepository.deleteById(studentId);

    }

    /*
    @Transactional annotation is used when you want the certain method/class(=all methods inside) to be executed in a transaction.

    Let's assume user A wants to transfer 100$ to user B. What happens is:

    We decrease A's account by 100$
    We add 100$ to B's account
    Let's assume the exception is thrown after succeeding 1) and before executing 2). Now we would have some kind of inconsistency because
    A lost 100$ while B got nothing. Transactions means all or nothing.
    If there is an exception thrown somewhere in the method, changes are not persisted in the database. Something called rollback happens.

    If you don't specify @Transactional, each DB call will be in a different transaction.
     */
    @Transactional
    public void updateStudent(Long studentId,
                              String name,
                              String email) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "student with id " + studentId + " does not exist"));

        if (name != null &&
            name.length() > 0 &&
                    !Objects.equals(student.getName(), name)){
            student.setName(name);
        }

        if (email != null &&
            email.length() > 0 &&
                    !Objects.equals(student.getEmail(), email)) {

            Optional<Student> studentOptional = studentRepository
                    .findStudentByEmail(email);

            if(studentOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }

    }
}
