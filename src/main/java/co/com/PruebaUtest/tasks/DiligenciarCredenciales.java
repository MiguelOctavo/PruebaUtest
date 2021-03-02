package co.com.PruebaUtest.tasks;

import co.com.PruebaUtest.model.UtestDatos;
import co.com.PruebaUtest.userinterfaces.PaginaCredenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.PruebaUtest.userinterfaces.PaginaCredenciales.*;

public class DiligenciarCredenciales implements Task {
    private List<UtestDatos> datos;

    public DiligenciarCredenciales(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static DiligenciarCredenciales enLaPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(DiligenciarCredenciales.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrContraseña()).into(CONTRASEÑA),
                Enter.theValue(datos.get(0).getStrContraseñaConfirmar()).into(CONFIRMA_CONTRASEÑA),
                Click.on(CHECK_1),
                Click.on(CHECK_2),
                Click.on(CHECK_3)
        );

    }
}
