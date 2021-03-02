package co.com.PruebaUtest.tasks;

import co.com.PruebaUtest.userinterfaces.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUtestPagina implements Task {
    private PaginaUtest paginaUtest;

    public static AbrirUtestPagina enLaPagina() {
        return Tasks.instrumented(AbrirUtestPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaUtest)
        );

    }
}
