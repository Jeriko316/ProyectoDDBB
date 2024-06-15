package com.example.ProyectoRelacionesDDBB.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="docente")
public class Docente {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_docente")
    @SequenceGenerator(name = "seq_docente", sequenceName = "seq_docente", allocationSize = 1)
    @Column(name="doce_id")
    private Integer id;

    @Column(name="doce_nombre")
    private String nombre;

    @Column(name="doce_apellido")
    private String apellido;

    @Column(name="doce_horario")
    private String horario;

    @Column(name="doce_facultad")
    private String facultad;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="materia_docente",
    joinColumns = @JoinColumn(name="doma_id_docente"),
    inverseJoinColumns = @JoinColumn(name="doma_id_materia"))
    private Set<Materia> materia;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Set<Materia> getMateria() {
        return materia;
    }

    public void setMateria(Set<Materia> materia) {
        this.materia = materia;
    }
}
