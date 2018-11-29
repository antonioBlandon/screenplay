package co.com.bancolombia.certificacion.screenplay.stepdefinitions;

import co.com.bancolombia.certificacion.screenplay.tasks.Apertura;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;

import java.util.List;

import static co.com.bancolombia.certificacion.screenplay.models.builder.DatosComercioBuilder.datosComercio;

public class AperturaStepDefinition {
    @Given("^Juan este logueado en la aplicacion de Bizagi$")
    public void juanEsteLogueadoEnLaAplicacionDeBizagi(List<String> arg1) {
    }

    @When("^el este realizando una apertura$")
    public void elEsteRealizandoUnaApertura(List<String> datos) {
        Actor.named("Antonio").attemptsTo(Apertura.con(datosComercio(datos)));
    }

    @Then("^el pueda ver el mensaje SOLICITUD ENVIADA A LA RED$")
    public void elPuedaVerElMensajeSOLICITUDENVIADAALARED() {

    }
}
