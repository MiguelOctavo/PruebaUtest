package co.com.PruebaUtest.questions;

import co.com.PruebaUtest.model.UtestDatos;
import co.com.PruebaUtest.userinterfaces.PaginaCredenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Respuesta implements Question<Boolean> {
    private List<UtestDatos> datos;

    public Respuesta(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Respuesta es(List<UtestDatos> datos) {
        return new Respuesta(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto_boton = Text.of(PaginaCredenciales.NEXT).viewedBy(actor).asString();

        return  datos.get(0).getStrTextoBotonFinal().equals(texto_boton);
    }
}
