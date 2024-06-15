package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Alumno;
import com.example.ProyectoRelacionesDDBB.models.Ciudadano;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CiudadanoRepository implements  ICiudadanoRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Ciudadano seleccionar(Integer id) {
        return this.entityManager.find(Ciudadano.class, id);
    }

    @Override
    public void actualizar(Ciudadano ciudadano) {
        this.entityManager.merge(ciudadano);
    }

    @Override
    public void insertar(Ciudadano ciudadano) {
        this.entityManager.persist(ciudadano);
    }

    @Override
    public void eliminar(Integer id) {
        Ciudadano ciud = this.seleccionar(id);
        this.entityManager.remove(ciud);
    }

    @Override
    public List<Ciudadano> seleccionarPorNombre(String nombre) {
        return List.of();
    }
}
