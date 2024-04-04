package validadorCorrelativasTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validadorCorrelativas.Alumno;
import validadorCorrelativas.Inscripcion;
import validadorCorrelativas.Materia;

public class ValidadorTest {

    @Test
    public void valentinSePuedeAnotarAMateriasSinCorrelativas(){
        Materia am1 = new Materia("AM1");
        Materia ayed = new Materia("AyED");
        Alumno valentin = new Alumno("Valentin", "2087765");

        Inscripcion inscripcionDeValentinAM1 = new Inscripcion(valentin,am1,ayed);

        Assertions.assertTrue(inscripcionDeValentinAM1.aprobada());

    }

    @Test
    public void gonzaloSePuedeAnotarAMateriasConCorrelativasAprobadas(){
        Materia aga = new Materia("AGA");
        Materia am1 = new Materia("AM1");
        Materia ayed = new Materia("AyED");
        Materia am2 = new Materia("AM2",am1,aga);
        Materia pdp = new Materia("PdP",ayed);
        Alumno gonzalo = new Alumno("Gonzalo", "1987265",aga,am1,ayed);


        Inscripcion inscripcionDegonzaloAPdPyAM2 = new Inscripcion(gonzalo,pdp,am2);

        Assertions.assertTrue(inscripcionDegonzaloAPdPyAM2.aprobada());

    }

    @Test
    public void agustinNoSePuedeAnotarAMateriasConCorrelativasNoAprobadas(){
        Materia ayed = new Materia("AyED");
        Materia ads = new Materia("ADS",ayed);
        Materia pdp = new Materia("PdP",ayed);
        Materia dds = new Materia("DDS",ayed,pdp,ads);
        Alumno agustin = new Alumno("Agustin", "2045665",ayed);

        Inscripcion inscripcionDeAgustinDDS = new Inscripcion(agustin,pdp,dds);

        Assertions.assertFalse(inscripcionDeAgustinDDS.aprobada());


    }

}
