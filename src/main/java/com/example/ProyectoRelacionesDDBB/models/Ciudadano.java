package com.example.ProyectoRelacionesDDBB.models;

import jakarta.persistence.*;

@Entity
@Table(name="ciudadano")
public class Ciudadano {


    @Id
    @SequenceGenerator(name = "seq_ciudadano", sequenceName = "seq_ciudadano", allocationSize=1)  //crear la secuencia
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ciudadano")
    @Column(name="ciud_id")
    private Integer id;

    @Column(name="ciud_nombre")
    private String nombre;

    @Column(name="ciud_apellido")
    private String apellido;

    @OneToOne
    @JoinColumn(name="ciud_id_alumno")
    private Alumno alumno;




    ///////////////////////////////
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

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }



}
