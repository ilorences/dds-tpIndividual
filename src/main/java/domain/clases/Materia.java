package domain.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    public List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
