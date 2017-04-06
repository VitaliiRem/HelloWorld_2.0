
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginFBtest {

    public WebDriver driver;
    public String baseUrl = "https://www.facebook.com/";

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl + "/");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("vitliirem2016@gmail.com");
        driver.findElement(By.id("loginbutton")).click();
        driver.close();

  }
}
