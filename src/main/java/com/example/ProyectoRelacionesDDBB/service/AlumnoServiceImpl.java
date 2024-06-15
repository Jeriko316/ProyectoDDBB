package com.example.ProyectoRelacionesDDBB.service;


import com.example.ProyectoRelacionesDDBB.Repository.IAlumnoRepository;
import com.example.ProyectoRelacionesDDBB.models.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements IAlumnoService{
    @Autowired
    private IAlumnoRepository iAlumnoRepository;

    @Override
    public Alumno buscar(Integer id) {
        // TODO Auto-generated method stub
        return this.iAlumnoRepository.seleccionar(id);
    }

    @Override
    public void registrar(Alumno alumno) {
        // TODO Auto-generated method stub
        this.iAlumnoRepository.insertar(alumno);
    }

    @Override
    public void actualizar(Alumno alumno) {
        // TODO Auto-generated method stub
        this.iAlumnoRepository.actualizar(alumno);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        this.iAlumnoRepository.eliminar(id);
    }

}
