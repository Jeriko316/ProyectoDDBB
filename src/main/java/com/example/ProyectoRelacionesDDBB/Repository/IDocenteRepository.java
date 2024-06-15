package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Curso;
import com.example.ProyectoRelacionesDDBB.models.Docente;

public interface IDocenteRepository {

    public Docente seleccionar (Integer id);

    public void actualizar(Docente docente);

    public void insertar(Docente docente);

    public void eliminar(Integer id);

}
