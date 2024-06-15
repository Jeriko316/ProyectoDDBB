package com.example.ProyectoRelacionesDDBB.service;

import com.example.ProyectoRelacionesDDBB.Repository.IFacultadRepository;
import com.example.ProyectoRelacionesDDBB.Repository.IMateriaRepository;
import com.example.ProyectoRelacionesDDBB.models.Facultad;
import com.example.ProyectoRelacionesDDBB.models.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaServiceImpl implements IMateriaService {

    @Autowired
    private IMateriaRepository iMateriaRepository;

    @Override
    public Materia buscar(Integer id) {
        // TODO Auto-generated method stub
        return this.iMateriaRepository.seleccionar(id);
    }

    @Override
    public void registrar(Materia materia) {
        // TODO Auto-generated method stub
        this.iMateriaRepository.insertar(materia);
    }

    @Override
    public void actualizar(Materia materia) {
        // TODO Auto-generated method stub
        this.iMateriaRepository.actualizar(materia);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        this.iMateriaRepository.eliminar(id);
    }


}
