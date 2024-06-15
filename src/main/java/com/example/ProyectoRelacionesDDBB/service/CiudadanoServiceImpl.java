package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.Repository.IAlumnoRepository;
import com.example.ProyectoRelacionesDDBB.Repository.ICiudadanoRepository;
import com.example.ProyectoRelacionesDDBB.models.Alumno;
import com.example.ProyectoRelacionesDDBB.models.Ciudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{


    @Autowired
    private ICiudadanoRepository iCiudadanoRepository;

    @Override
    public Ciudadano buscar(Integer id) {
        // TODO Auto-generated method stub
        return this.iCiudadanoRepository.seleccionar(id);
    }

    @Override
    public void registrar(Ciudadano ciudadano) {
        // TODO Auto-generated method stub
        this.iCiudadanoRepository.insertar(ciudadano);
    }

    @Override
    public void actualizar(Ciudadano ciudadano) {
        // TODO Auto-generated method stub
        this.iCiudadanoRepository.actualizar(ciudadano);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        this.iCiudadanoRepository.eliminar(id);
    }


}
