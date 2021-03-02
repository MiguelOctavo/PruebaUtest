package co.com.PruebaUtest.Stepdefinitions;

import co.com.PruebaUtest.model.UtestDatos;
import co.com.PruebaUtest.questions.Respuesta;
import co.com.PruebaUtest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepdefinitionsUtest {

    @Before
    public void setOnStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^Juan desea registrarse en utest$")
    public void juanDeseaRegistrarseEnUtest(){
        theActorCalled("Juan").wasAbleTo(
                AbrirUtestPagina.enLaPagina()
        );
    }

    @When("^El usuario debe diligenciar todos los datos para el registro$")
    public void elUsuarioDebeDiligenciarTodosLosDatosParaElRegistro(List<UtestDatos> datos){
        theActorInTheSpotlight().attemptsTo(
                DiligenciarInformacionPersonal.enLaPagina(datos),
                DiligenciarDireccion.enLaPagina(datos),
                DiligenciarDispositivos.enLaPagina(datos),
                DiligenciarCredenciales.enLaPagina(datos)

        );
    }

    @Then("^El registro de completa cuando el usuario ve el boton Complete Setup$")
    public void elRegistroDeCompletaCuandoElUsuarioVeElBotonCompleteSetup(List<UtestDatos> datos){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.es(datos)));
    }
}
