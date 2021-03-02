package co.com.PruebaUtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInformacionPersonal {
    public static final Target JOIN = Target.the("Join").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target NOMBRE = Target.the("Nombre").located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Apellido").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email").located(By.id("email"));
    public static final Target MES = Target.the("Mes").located(By.id("birthMonth"));
    public static final Target DIA = Target.the("Dia").located(By.id("birthDay"));
    public static final Target AÑO = Target.the("Año").located(By.id("birthYear"));
    public static final Target NEXT = Target.the("Next").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
