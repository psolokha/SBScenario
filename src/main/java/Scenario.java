import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario {

    public static void main(String... args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.sberbank.ru");

        driver.findElement(By.xpath("//a[@class='hd-ft-region']")).click();
        driver.findElement(By.xpath("//a[@class='kit-link kit-link_m hd-ft-region__city' and contains(text(), 'Нижегородская')]")).click();
        System.out.println("Displayed NN: " + driver.findElement(By.xpath("//div[@class='hd-ft-region__title']/span[contains(text(), 'Нижегородская')]")).isDisplayed());
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.tagName("footer")));
        System.out.println("Displayed Social: " + driver.findElement(By.xpath("//*[@class='footer__social']")).isDisplayed());
    }

}
