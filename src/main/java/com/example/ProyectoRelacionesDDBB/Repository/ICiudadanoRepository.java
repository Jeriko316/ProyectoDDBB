package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Alumno;
import com.example.ProyectoRelacionesDDBB.models.Ciudadano;

import java.util.List;

public interface ICiudadanoRepository {

    public Ciudadano seleccionar (Integer id);

    public void actualizar(Ciudadano ciudadano);

    public void insertar(Ciudadano ciudadano);

    public void eliminar(Integer id);

    public List<Ciudadano> seleccionarPorNombre(String nombre);

}
