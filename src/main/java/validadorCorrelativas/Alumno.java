package validadorCorrelativas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private String lejago;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String lejago,Materia ... materias) {
        this.nombre = nombre;
        this.lejago = lejago;
        this.materiasAprobadas = new ArrayList<Materia>();
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean tieneAprobada(Materia materiaCorrelativa) {
        return this.materiasAprobadas.contains(materiaCorrelativa);
    }

}

    




