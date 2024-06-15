package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Alumno;
import com.example.ProyectoRelacionesDDBB.models.Curso;

import java.util.List;

public interface ICursoRepository {


    public Curso seleccionar (Integer id);

    public void actualizar(Curso curso);

    public void insertar(Curso curso);

    public void eliminar(Integer id);



}
