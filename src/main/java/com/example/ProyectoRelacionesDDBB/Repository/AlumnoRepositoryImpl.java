package com.example.ProyectoRelacionesDDBB.Repository;

import com.example.ProyectoRelacionesDDBB.models.Alumno;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class AlumnoRepositoryImpl implements  IAlumnoRepository {



    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Alumno seleccionar(Integer id) {
        // TODO Auto-generated method stub
        return this.entityManager.find(Alumno.class, id);
    }

    @Override
    public void insertar(Alumno alumno) {
        // TODO Auto-generated method stub
        this.entityManager.persist(alumno);
    }

    @Override
    public void actualizar(Alumno alumno) {
        // TODO Auto-generated method stub
        this.entityManager.merge(alumno);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        Alumno alum = this.seleccionar(id);
        this.entityManager.remove(alum);
    }

    @Override
    public List<Alumno> seleccionarPorNombre(String nombre) {

        TypedQuery<Alumno> myQuery = this.entityManager
                .createQuery("SELECT a FROM Alumno a WHERE a.nombre = :nombre", Alumno.class);
        myQuery.setParameter("nombre", nombre);
        return myQuery.getResultList();
    }

}
