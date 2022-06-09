package com.generation.GenerationCohorte.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre_alumno;

    @Column(nullable = false)
    private Integer edad;

    @Column(nullable = false, unique = true)
    private String correo;

    // Llave forenea de la tabla cohorte, junto con su tipo de relacion
    @ManyToOne
    @JoinColumn(nullable = false, name = "cohorte_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cohorte cohorte;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cohorte getCohorte() {
        return cohorte;
    }

    public void setCohorte(Cohorte cohorte) {
        this.cohorte = cohorte;
    }
}
