package domain;
import domain.clases.Alumno;
import domain.clases.Inscripcion;
import domain.clases.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class inscripcionTest {

   @Test
   public void alumnoPuedeCursarDDS(){
      Alumno unAlumno = new Alumno("Malena", "2090562");

      Materia unaMateria = new Materia("Disenio de Sistemas");

      Materia correlativa1 = new Materia("Paradigmas de Programacion");

      Materia correlativa2 = new Materia("Algoritmos y ED");

      correlativa1.agregarCorrelativa(correlativa2);
      unaMateria.agregarCorrelativa(correlativa1);

      List<Materia> materiasDeseadas = new ArrayList<>();
      materiasDeseadas.add(unaMateria);


      unAlumno.agregarMateriasAprobadas(correlativa1);
      unAlumno.agregarMateriasAprobadas(correlativa2);


      Inscripcion unaInscripcion = new Inscripcion(unAlumno, materiasDeseadas);

      Assert.assertEquals(true, unaInscripcion.aprobada());
   }

   @Test
   public void alumnoPuedeCursarParadigmas(){
      Alumno unAlumno = new Alumno("Martin", "2090564");

      Materia unaMateria = new Materia("Paradigmas");

      Materia correlativa1 = new Materia("Algoritmos y ED");

      unaMateria.agregarCorrelativa(correlativa1);

      List<Materia> materiasDeseadas = new ArrayList<>();
      materiasDeseadas.add(unaMateria);


      unAlumno.agregarMateriasAprobadas(correlativa1);

      Inscripcion unaInscripcion = new Inscripcion(unAlumno, materiasDeseadas);

      Assert.assertEquals(true,unaInscripcion.aprobada());
   }

   @Test
   public void alumnoPuedeCursarAlgoritmos(){
      Alumno unAlumno = new Alumno("Leandro", "2090561");

      Materia unaMateria = new Materia("Algoritmos y ED");

      List<Materia> materiasDeseadas = new ArrayList<>();
      materiasDeseadas.add(unaMateria);

      Inscripcion unaInscripcion = new Inscripcion(unAlumno, materiasDeseadas);

      Assert.assertEquals(true,unaInscripcion.aprobada());
   }

   @Test
   public void alumnoNoPuedeCursarDDS() {
      Alumno unAlumno = new Alumno("Malena", "2090562");

      Materia unaMateria = new Materia("Disenio de Sistemas");

      Materia correlativa1 = new Materia("Paradigmas de Programacion");

      Materia correlativa2 = new Materia("Algoritmos y ED");

      correlativa1.agregarCorrelativa(correlativa2);
      unaMateria.agregarCorrelativa(correlativa1);

      List<Materia> materiasDeseadas = new ArrayList<>();
      materiasDeseadas.add(unaMateria);


      //unAlumno.agregarMateriasAprobadas(correlativa1);

      Inscripcion unaInscripcion = new Inscripcion(unAlumno, materiasDeseadas);

      Assert.assertEquals(false, unaInscripcion.aprobada());
   }
   @Test
   public void alumnoNoPuedeCursarParadigmas() {
      Alumno unAlumno = new Alumno("Martin", "2090564");

      Materia unaMateria = new Materia("Paradigmas");

      Materia correlativa1 = new Materia("Algoritmos y ED");

      unaMateria.agregarCorrelativa(correlativa1);

      List<Materia> materiasDeseadas = new ArrayList<>();
      materiasDeseadas.add(unaMateria);


      //unAlumno.agregarMateriasAprobadas(correlativa1);

      Inscripcion unaInscripcion = new Inscripcion(unAlumno, materiasDeseadas);

      Assert.assertEquals(false, unaInscripcion.aprobada());

      }
   }
