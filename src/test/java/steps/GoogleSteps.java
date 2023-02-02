package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;

public class GoogleSteps {
    GooglePage google = new GooglePage();
    @Given("Estoy ubicado en google.com$")
    public void estoy_ubicado_en_google_com() {
        google.navigateToGoogle();

    }

    @When("^Intento buscar QA Automation$")
    public void intento_buscar_qa_automation() {
         google.searchInBar();
    }

    @And("^Poder elejir 'qa automation tester' de la lista desplegable$")
    public void elijo_qa_automation_tester_de_la_lista_desplegable() throws InterruptedException {
        google.clickBotonOrEnter();
    }

    @Then("^Deberia mostrarme la busqueda relacionada$")
    public void deberia_mostrarme_la_busqueda_relacionada() {
        google.mostrarResultados();
    }

}
