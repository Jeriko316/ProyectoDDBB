package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Docente;
import com.example.ProyectoRelacionesDDBB.models.Facultad;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class FacultadRepositoryImpl implements IFacultadRepository{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Facultad seleccionar(Integer id) {
        return this.entityManager.find(Facultad.class, id);
    }

    @Override
    public void actualizar(Facultad facultad) {
        this.entityManager.merge(facultad);
    }

    @Override
    public void insertar(Facultad facultad) {
        this.entityManager.persist(facultad);
    }

    @Override
    public void eliminar(Integer id) {
        Facultad facu = this.seleccionar(id);
        this.entityManager.remove(facu);
    }
}
