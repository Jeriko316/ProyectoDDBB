package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.models.Docente;
import com.example.ProyectoRelacionesDDBB.models.Facultad;

public interface IFacultadService {

    public Facultad buscar(Integer id);

    public void registrar(Facultad facultad);

    public void actualizar(Facultad facultad);

    public void eliminar(Integer id);

}
