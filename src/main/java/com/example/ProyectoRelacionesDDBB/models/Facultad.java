package com.example.ProyectoRelacionesDDBB.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="facultad")
public class Facultad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_facultad")
    @SequenceGenerator(name = "seq_facultad", sequenceName = "seq_facultad", allocationSize = 1)
    @Column(name="facu_id")
    private Integer id;

    @Column(name="facu_nombre")
    private String nombre;

    @Column(name="facu_carrera")
    private String carrera;

    @Column(name="facu_jornada")
    private String jornada;

    @Column(name="facu_campus")
    private String campus;


    @OneToMany(mappedBy = "facultad",cascade = CascadeType.ALL)
    private List<Curso> curso;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }
}
