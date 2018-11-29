package co.com.bancolombia.certificacion.screenplay.tasks;

import co.com.bancolombia.certificacion.screenplay.models.DatosComercio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class Apertura implements Task {

    DatosComercio datosComercio;

    public Apertura(DatosComercio datosComercio) {
        this.datosComercio = datosComercio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(datosComercio.getNumerodeIdentificacion());
        System.out.println(datosComercio.getTipodeComercio());
        System.out.println(datosComercio.getTipodeIdentificacion());
    }

    public static Apertura con(DatosComercio datosComercio) {
        return Tasks.instrumented(Apertura.class, datosComercio);
    }
}
