package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.models.Alumno;

import java.util.List;

public interface IAlumnoService {

    public Alumno buscar(Integer id);

    public void registrar(Alumno alumno);

    public void actualizar(Alumno alumno);

    public void eliminar(Integer id);

}
