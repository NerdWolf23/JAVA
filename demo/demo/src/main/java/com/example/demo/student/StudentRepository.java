package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //JBQL
    //@Query("SELECT s FROM Student s WHERE s.email = ?1")

    //SQL
    //SELECT * FROM student WHERE email = ?
    //?= whatever i pass

    //java spring jpa
    //fa la query e la restituisce in formato container option
    //la query è il nome del metodo
    Optional<Student> findStudentByEmail(String email);
}
