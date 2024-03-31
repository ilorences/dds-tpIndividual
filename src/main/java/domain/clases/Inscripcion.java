package domain.clases;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno unAlumno, List<Materia> materiasDeseadas) {
        this.alumno = unAlumno;
        this.materias = materiasDeseadas;
    }

    public Boolean aprobada() {
        return this.materias.stream().allMatch(materia -> this.alumno.cumpleCorrelativas(materia));
    }
}