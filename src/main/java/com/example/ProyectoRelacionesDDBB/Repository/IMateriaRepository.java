package com.example.ProyectoRelacionesDDBB.Repository;


import com.example.ProyectoRelacionesDDBB.models.Materia;


public interface IMateriaRepository {

    public Materia seleccionar (Integer id);

    public void actualizar(Materia materia);

    public void insertar(Materia materia);

    public void eliminar(Integer id);
}
