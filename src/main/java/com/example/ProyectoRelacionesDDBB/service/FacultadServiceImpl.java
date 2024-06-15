package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.Repository.IDocenteRepository;
import com.example.ProyectoRelacionesDDBB.Repository.IFacultadRepository;
import com.example.ProyectoRelacionesDDBB.models.Docente;
import com.example.ProyectoRelacionesDDBB.models.Facultad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultadServiceImpl implements IFacultadService{

    @Autowired
    private IFacultadRepository iFacultadRepository;

    @Override
    public Facultad buscar(Integer id) {
        // TODO Auto-generated method stub
        return this.iFacultadRepository.seleccionar(id);
    }

    @Override
    public void registrar(Facultad facultad) {
        // TODO Auto-generated method stub
        this.iFacultadRepository.insertar(facultad);
    }

    @Override
    public void actualizar(Facultad facultad) {
        // TODO Auto-generated method stub
        this.iFacultadRepository.actualizar(facultad);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        this.iFacultadRepository.eliminar(id);
    }

}
