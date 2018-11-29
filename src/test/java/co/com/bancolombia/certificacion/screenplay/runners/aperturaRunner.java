package co.com.bancolombia.certificacion.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/apertura.feature",
        glue = "co.com.bancolombia.certificacion.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class aperturaRunner {
}
