package co.com.PruebaUtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCredenciales {
    public static final Target CONTRASEÑA = Target.the("Contraseña").located(By.id("password"));
    public static final Target CONFIRMA_CONTRASEÑA = Target.the("Confirma contraseña").located(By.id("confirmPassword"));
    public static final Target CHECK_1 = Target.the("check 1").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_2 = Target.the("check 2").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_3 = Target.the("check 3").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target NEXT = Target.the("Texto boton final").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a/span"));

}
