package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.models.Curso;
import com.example.ProyectoRelacionesDDBB.models.Docente;

public interface IDocenteService {


    public Docente buscar(Integer id);

    public void registrar(Docente docente);

    public void actualizar(Docente docente);

    public void eliminar(Integer id);
}
