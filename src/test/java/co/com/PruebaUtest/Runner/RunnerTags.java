package co.com.PruebaUtest.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/feature/utestFinal.feature",
        tags = "@stories",
        glue = "co.com.PruebaUtest.Stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
