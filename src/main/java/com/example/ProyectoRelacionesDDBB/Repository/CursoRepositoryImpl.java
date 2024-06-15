package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Ciudadano;
import com.example.ProyectoRelacionesDDBB.models.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CursoRepositoryImpl implements ICursoRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Curso seleccionar(Integer id) {
        return this.entityManager.find(Curso.class, id);
    }

    @Override
    public void actualizar(Curso curso) {
        this.entityManager.merge(curso);
    }

    @Override
    public void insertar(Curso curso) {
        this.entityManager.persist(curso);
    }

    @Override
    public void eliminar(Integer id) {
        Curso curs = this.seleccionar(id);
        this.entityManager.remove(curs);
    }


}
