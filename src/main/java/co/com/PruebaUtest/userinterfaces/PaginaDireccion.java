package co.com.PruebaUtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccion {
    public static final Target CIUDAD = Target.the("Ciudad").located(By.id("city"));
    public static final Target CODIGO_POSTAL = Target.the("Codigo postal").located(By.id("zip"));
    public static final Target DIV_PAIS = Target.the("Div pais").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target PAIS = Target.the("Pais").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT = Target.the("Ciudad").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
