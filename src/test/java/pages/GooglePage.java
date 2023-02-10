package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GooglePage extends BasePage {
    public GooglePage() {
        super(driver);
    }
    public void navigateToGoogle() {
        navigateTo("https://www.google.com//");
        driver.manage().window().maximize();
    }
    public void searchInBar() {
        driver.findElement(By.name("q")).sendKeys("QA Automation");

    }

    public void clickBotonOrEnter() throws InterruptedException {

        Thread.sleep(5000);
        List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
        System.out.println(list.size());

        for (int j=0; j<list.size(); j++){
            String listAll = list.get(j).getText();
            System.out.println(listAll);
            if(listAll.contains("qa automation tester")) {
                list.get(j).click();
                break;
            }
        }
    }

    public void mostrarResultados() {
        Assert.assertEquals("qa automation tester - Buscar con Google", driver.getTitle());
        System.out.println("********* Pruebas exitosas!! ***********");

    }
}
