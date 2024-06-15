package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Facultad;
import com.example.ProyectoRelacionesDDBB.models.Materia;
import jakarta.persistence.EntityManager;

import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository {

   @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Materia seleccionar(Integer id) {
        return this.entityManager.find(Materia.class, id);
    }

    @Override
    public void actualizar(Materia materia) {
        this.entityManager.merge(materia);
    }

    @Override
    public void insertar(Materia materia) {
        this.entityManager.persist(materia);
    }

    @Override
    public void eliminar(Integer id) {
        Materia mate = this.seleccionar(id);
        this.entityManager.remove(mate);
    }

}
