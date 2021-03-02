package co.com.PruebaUtest.tasks;

import co.com.PruebaUtest.model.UtestDatos;
import co.com.PruebaUtest.userinterfaces.PaginaDispositos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.PruebaUtest.userinterfaces.PaginaDispositos.*;

public class DiligenciarDispositivos implements Task {

    private List<UtestDatos> datos;

    public DiligenciarDispositivos(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static DiligenciarDispositivos enLaPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(DiligenciarDispositivos.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DIV_COMPUTADOR),
                Enter.theValue(datos.get(0).getStrComputador()).into(COMPUTADOR).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_VERSION),
                Enter.theValue(datos.get(0).getStrVersion()).into(VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_LENGUAJE),
                Enter.theValue(datos.get(0).getStrLenguaje()).into(LENGUAJE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_MOVIL),
                Enter.theValue(datos.get(0).getStrMovil()).into(MOVIL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_MODELO),
                Enter.theValue(datos.get(0).getStrModelo()).into(MODELO).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_OS),
                Enter.theValue(datos.get(0).getStrOs()).into(OS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(NEXT)
        );
    }
}
