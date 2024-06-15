package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Ciudadano;
import com.example.ProyectoRelacionesDDBB.models.Docente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class DocenteRepositoryImpl implements IDocenteRepository{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Docente seleccionar(Integer id) {
        return this.entityManager.find(Docente.class, id);
    }

    @Override
    public void actualizar(Docente docente) {
        this.entityManager.merge(docente);
    }

    @Override
    public void insertar(Docente docente) {
        this.entityManager.persist(docente);
    }

    @Override
    public void eliminar(Integer id) {
        Docente doce = this.seleccionar(id);
        this.entityManager.remove(doce);
    }
}
