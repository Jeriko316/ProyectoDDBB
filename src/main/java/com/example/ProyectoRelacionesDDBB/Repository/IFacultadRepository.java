package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Curso;
import com.example.ProyectoRelacionesDDBB.models.Facultad;

public interface IFacultadRepository {

    public Facultad seleccionar (Integer id);

    public void actualizar(Facultad facultad);

    public void insertar(Facultad facultad);

    public void eliminar(Integer id);

}
