package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.models.Facultad;
import com.example.ProyectoRelacionesDDBB.models.Materia;

public interface IMateriaService {

    public Materia buscar(Integer id);

    public void registrar(Materia materia);

    public void actualizar(Materia materia);

    public void eliminar(Integer id);

}
