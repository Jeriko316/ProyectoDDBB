package com.example.ProyectoRelacionesDDBB.models;

import jakarta.persistence.*;

@Entity
@Table(name="alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_alum")
    @SequenceGenerator(name = "seq_alum", sequenceName = "seq_alum", allocationSize = 1)
    @Column(name="alum_id")
    private Integer id;

    @Column(name="alum_nombre")
    private String nombre;

    @Column(name="alum_apellido")
    private String apellido;


    @OneToOne(mappedBy = "alumno", cascade = CascadeType.ALL)
    private Ciudadano ciudadano;



    public Alumno(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public Alumno() {
    }


    ///////getters and setters
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

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }
}
