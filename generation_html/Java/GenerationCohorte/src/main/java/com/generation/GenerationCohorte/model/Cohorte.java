package com.generation.GenerationCohorte.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cohorte")
public class Cohorte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer numero_cohorte;

    @Column(nullable = false)
    private String ciudad;

    // Relacionar la llave forenea de la tabla cohorte con la tabla alumno
    @OneToMany(mappedBy = "cohorte")
    private List<Alumno> alumno;

    // Relacionar la llave forenea de la tabla cohorte con la tabla instructor
    @OneToOne(mappedBy = "cohorte")
    private Instructor instructor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroCohorte() {
        return numero_cohorte;
    }

    public void setNumeroCohorte(Integer numero_cohorte) {
        this.numero_cohorte = numero_cohorte;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(List<Alumno> alumno) {
        this.alumno = alumno;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
