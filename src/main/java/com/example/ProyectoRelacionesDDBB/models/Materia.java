package com.example.ProyectoRelacionesDDBB.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_materia")
    @SequenceGenerator(name = "seq_materia", sequenceName = "seq_materia", allocationSize = 1)
    @Column(name="mate_id")
    private Integer id;

    @Column(name="mate_nombre_materia")
    private String nombreMateria;

    @Column(name="mate_codigo_materia")
    private String codigoMateria;


     @ManyToMany(mappedBy = "materia", cascade =  CascadeType.ALL)
    private Set<Docente> docente;


     //////////////////////////////////////////////////
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public Set<Docente> getDocente() {
        return docente;
    }

    public void setDocente(Set<Docente> docente) {
        this.docente = docente;
    }
}
