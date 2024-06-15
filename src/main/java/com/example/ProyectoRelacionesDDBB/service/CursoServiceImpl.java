package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.Repository.ICiudadanoRepository;
import com.example.ProyectoRelacionesDDBB.Repository.ICursoRepository;
import com.example.ProyectoRelacionesDDBB.models.Ciudadano;
import com.example.ProyectoRelacionesDDBB.models.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl implements  ICursoService {

    @Autowired
    private ICursoRepository iCursoRepository;

    @Override
    public Curso buscar(Integer id) {
        // TODO Auto-generated method stub
        return this.iCursoRepository.seleccionar(id);
    }

    @Override
    public void registrar(Curso curso) {
        // TODO Auto-generated method stub
        this.iCursoRepository.insertar(curso);
    }

    @Override
    public void actualizar(Curso curso) {
        // TODO Auto-generated method stub
        this.iCursoRepository.actualizar(curso);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        this.iCursoRepository.eliminar(id);
    }


}
