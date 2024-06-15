package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.models.Ciudadano;
import com.example.ProyectoRelacionesDDBB.models.Curso;

public interface ICursoService {

    public Curso buscar(Integer id);

    public void registrar(Curso curso);

    public void actualizar(Curso curso);

    public void eliminar(Integer id);

}
