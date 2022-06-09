package com.generation.GenerationCohorte.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre_instructor;

    @Column(nullable = false)
    private String supervisor;

    @Column(nullable = false)
    private String puesto;

    // Llave foranea de la tabla cohorte, junto con su tipo de relacion
    @OneToOne
    @JoinColumn(nullable = false, name = "cohorte_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cohorte cohorte;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_instructor() {
        return nombre_instructor;
    }

    public void setNombre_instructor(String nombre_instructor) {
        this.nombre_instructor = nombre_instructor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Cohorte getCohorte() {
        return cohorte;
    }

    public void setCohorte(Cohorte cohorte) {
        this.cohorte = cohorte;
    }
}
