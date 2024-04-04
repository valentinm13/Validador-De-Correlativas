package validadorCorrelativas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno,Materia... materias) {
        this.alumno = alumno;
        this.materias = new ArrayList<Materia>();
        Collections.addAll(this.materias, materias);
    }

    public boolean aprobada(){
        return this.materias.stream().allMatch(materia -> (!materia.tieneCorrelativas() || materia.puedeCursar(this.alumno)));
    }
}
