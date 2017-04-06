import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Translater {

    public WebDriver driver;
    public String baseUrl = "https://yandex.ua";

    @Test

    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Переводчик")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Переводчик")).sendKeys("Hello, world");
        Thread.sleep(3000);
        driver.quit();

    }

}
