package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    //viene ignorata la variabile age perchè il suo campo nel db è riempito da un metodo getAge()
    /*
    Si rende necessario definire una proprietà transient, esclusivamente quando facciamo uso di
    serializzazione, cioè quando convertiamo un oggetto in uno stream, in modo da poterne gestire
    la persistenza o la remotizzazione. Cerchiamo di capire cos'è e perché si usa.

    transient private File fileAccessoDati;
    Attraverso la proprietà transient stiamo dicendo al compilatore che una certa variabile non deve essere
     serializzata. Molto semplice, in pratica il funzionamento è quello di sempre, solo che, all'atto della
      serializzazione, questa variabile viene saltata e quindi forzatamente posta a null.

    Nota: Una variabile transient non può essere final o static.

    I motivi per cui può presentarsi tale necessità sono in realtà limitati. Sicuramente quello di non
    sollevare eccezioni all'atto di serializzare una classe che presenta come variabili classe che non
    implementano l'interfaccia Serializable. Altro esempio si potrebbe avere per motivi di sicurezza,

    ossia definire transient una stringa (o altra classe) contenente una password che viaggia in rete.
    Molto più realistica è invece il suo uso nello sviluppo distribuito attraverso RMI e sue evoluzioni
    (EJB, per esempio) e nella persistenza di istanze di oggetti.
     */
    @Transient
    private Integer age;

    public Student(){

    }

    public Student(Long id,
                   String name,
                   String email,
                   LocalDate dob
                   ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Student(String name,
                   String email,
                   LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
