package com.example.ProyectoRelacionesDDBB;

import com.example.ProyectoRelacionesDDBB.models.*;
import com.example.ProyectoRelacionesDDBB.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class ProyectoRelacionesDdbbApplication implements CommandLineRunner {

    @Autowired
    private AlumnoServiceImpl alumnoService;

    @Autowired
    private CiudadanoServiceImpl ciudadanoService;

    @Autowired
    private FacultadServiceImpl facultadService;

    @Autowired
    private MateriaServiceImpl materiaService;

    @Autowired
    private DocenteServiceImpl docenteService;

    public static void main(String[] args) {
        SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
////////////////////////////////////////////////////////////////
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("jeriko");
		alumno1.setApellido("meyers");
		alumnoService.registrar(alumno1);
g

		Ciudadano cidu1 = new Ciudadano();
		cidu1.setNombre("carlieto");
		cidu1.setApellido("ancheloti");
		cidu1.setAlumno(alumno1);
		ciudadanoService.registrar(cidu1);

/////////////////////////////////////////////////////////////////////
		Facultad facu1 = new Facultad();
		Curso cu1 = new Curso();
		Curso cu2 = new Curso();


		facu1.setNombre("ingenieria");
		facu1.setCampus("latacunga");
		facu1.setCarrera("computacion");
		facu1.setJornada("vespertina");


		cu1.setCodigoCurso("Progra-2A");
		cu1.setNumCurso(24);
		cu1.setFacultad(facu1);


		cu1.setCodigoCurso("Inestigacion-54A");
		cu1.setNumCurso(11);
		cu1.setFacultad(facu1);

		List<Curso> cursos = new ArrayList<>();
		cursos.add(cu1);
		cursos.add(cu2);
		facu1.setCurso(cursos);
		facultadService.registrar(facu1);


        ////////////////////////////////////////////////////////

        Docente doce1 = new Docente();
        doce1.setNombre("pipe");
        doce1.setApellido("xocas");
        doce1.setFacultad("filosofia");
        doce1.setHorario("vespertino");

       Materia mate1 =new Materia();
       mate1.setNombreMateria("calculos");
       mate1.setCodigoMateria("ing-003");


        Materia mate2 =new Materia();
        mate2.setNombreMateria("fisicas");
        mate2.setCodigoMateria("ing-004");

        Set<Materia> materias = new HashSet<>();
        materias.add(mate1);
        materias.add(mate2);

        doce1.setMateria(materias);

        Set<Docente> docentes = new HashSet<>();
        docentes.add(doce1);

        mate1.setDocente(docentes);
        mate2.setDocente(docentes);

        docenteService.registrar(doce1);



    }
}
