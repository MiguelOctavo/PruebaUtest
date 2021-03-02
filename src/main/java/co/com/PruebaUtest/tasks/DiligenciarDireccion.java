package co.com.PruebaUtest.tasks;

import co.com.PruebaUtest.model.UtestDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.PruebaUtest.userinterfaces.PaginaDireccion.*;

public class DiligenciarDireccion implements Task {
    private List<UtestDatos> datos;

    public DiligenciarDireccion(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static DiligenciarDireccion enLaPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(DiligenciarDireccion.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrCiudad()).into(CIUDAD),
                Enter.theValue(datos.get(0).getStrCodigoPostal()).into(CODIGO_POSTAL),
                Click.on(DIV_PAIS),
                Enter.theValue(datos.get(0).getStrPais()).into(PAIS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(NEXT)

        );

    }
}
