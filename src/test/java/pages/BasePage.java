package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    //creamos el WebDriver static para que haya una sola instancia de este objeto para todas las clases.
    protected static WebDriver driver;
    //lo mismo con la instancia del objeto WebDriverWait, se usaria para todas las clases (la espera, "wait").
   private static WebDriverWait wait;

    //se crea un bloque static, el cual se ejecuta al comienzo y crea el driver y una espera para todas las clases.
    static {
        //Se instancian las opciones de Chrome.
        ChromeOptions chromeOptions = new ChromeOptions();
        //se crea el objeto ChromeDriver y se pasan las opciones como parametro.
        driver = new ChromeDriver(chromeOptions);
        //se crea el objeto WebDriverWait, se inicia el driver y se dan 10 segundos de espera para cargar los elementos de la pagina
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));

    }

    //se crea un constructor de la clase y se le asigna el driver
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public static void navigateTo(String url) {

        driver.get(url);
    }
}
