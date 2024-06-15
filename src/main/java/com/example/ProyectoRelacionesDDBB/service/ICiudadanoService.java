package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.models.Alumno;
import com.example.ProyectoRelacionesDDBB.models.Ciudadano;

public interface ICiudadanoService {


    public Ciudadano buscar(Integer id);

    public void registrar(Ciudadano ciudadano);

    public void actualizar(Ciudadano ciudadano);

    public void eliminar(Integer id);
}
