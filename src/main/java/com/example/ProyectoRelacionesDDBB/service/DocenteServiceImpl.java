package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.Repository.ICursoRepository;
import com.example.ProyectoRelacionesDDBB.Repository.IDocenteRepository;
import com.example.ProyectoRelacionesDDBB.models.Curso;
import com.example.ProyectoRelacionesDDBB.models.Docente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteServiceImpl implements IDocenteService{

    @Autowired
    private IDocenteRepository iDocenteRepository;

    @Override
    public Docente buscar(Integer id) {
        // TODO Auto-generated method stub
        return this.iDocenteRepository.seleccionar(id);
    }

    @Override
    public void registrar(Docente docente) {
        // TODO Auto-generated method stub
        this.iDocenteRepository.insertar(docente);
    }

    @Override
    public void actualizar(Docente docente) {
        // TODO Auto-generated method stub
        this.iDocenteRepository.actualizar(docente);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        this.iDocenteRepository.eliminar(id);
    }

}
