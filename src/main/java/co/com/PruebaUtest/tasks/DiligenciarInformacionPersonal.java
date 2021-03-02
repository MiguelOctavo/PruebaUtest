package co.com.PruebaUtest.tasks;

import co.com.PruebaUtest.model.UtestDatos;
import co.com.PruebaUtest.userinterfaces.PaginaInformacionPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.PruebaUtest.userinterfaces.PaginaInformacionPersonal.*;

public class DiligenciarInformacionPersonal implements Task {

    private List<UtestDatos> datos;

    public DiligenciarInformacionPersonal(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static DiligenciarInformacionPersonal enLaPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(DiligenciarInformacionPersonal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JOIN),
                Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRE),
                Enter.theValue(datos.get(0).getStrApellido()).into(APELLIDO),
                Enter.theValue(datos.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMes()).from(MES),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDia()).from(DIA),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAño()).from(AÑO),
                Click.on(NEXT)
        );

    }
}
