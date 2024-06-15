package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Alumno;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAlumnoRepository {


    public Alumno seleccionar (Integer id);

    public void actualizar(Alumno alumno);

    public void insertar(Alumno alumno);

    public void eliminar(Integer id);

    public List<Alumno> seleccionarPorNombre(String nombre);

}
