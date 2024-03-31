package domain.clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;
    public List<Materia> materiasAp;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAp = new ArrayList<>();
    }

    public void agregarMateriasAprobadas(Materia materia) {
        this.materiasAp.add(materia);
    }

    public Boolean cumpleCorrelativas(Materia materia) {
        List <Materia> correlativas = materia.getCorrelativas();
        return materiasAp.containsAll(correlativas);
    }
}
