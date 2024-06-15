package com.example.ProyectoRelacionesDDBB.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_curso")
    @SequenceGenerator(name = "seq_curso", sequenceName = "seq_curso", allocationSize = 1)
    @Column(name="curs_id")
    private Integer id;

    @Column(name="curs_codigo")
    private String codigoCurso;

    @Column(name="curs_numero_curso")
    private Integer numCurso;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "curs_id_facultad")
    private Facultad facultad;


   /* @ManyToMany(mappedBy = "Curso", cascade =  CascadeType.ALL)
    private Set<Docente> docente;*/


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Integer getNumCurso() {
        return numCurso;
    }

    public void setNumCurso(Integer numCurso) {
        this.numCurso = numCurso;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    /*public Set<Docente> getDocente() {
        return docente;
    }

    public void setDocente(Set<Docente> docente) {
        this.docente = docente;
    }*/
}
