package validadorCorrelativas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia{
    private String nombre;
    private List<Materia> correlativas;

    public Materia (String nombre,Materia ... materias){
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
        Collections.addAll(this.correlativas, materias);
    }

    public boolean puedeCursar(Alumno alumno){
        return this.correlativas.stream().allMatch(materiaCorrelativa -> alumno.tieneAprobada(materiaCorrelativa));
}
    public boolean tieneCorrelativas() {

        return !this.correlativas.isEmpty();
    }
    }
