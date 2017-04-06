
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class bmwclub {

        public WebDriver driver;
        public String baseUrl = "http://www.bmwclub.ua";

        @Test
        public void main() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl + "/");

    assertEquals(driver.getTitle(), "BMW Club Ukraine");
    driver.findElement(By.id("navbar_username")).clear();
    driver.findElement(By.id("navbar_username")).sendKeys("VitaliiREM");
    driver.findElement(By.id("navbar_username")).clear();
    driver.findElement(By.id("navbar_username")).sendKeys("VitaliiREM");
    Thread.sleep(3000);
    driver.findElement(By.id("navbar_password_hint")).clear();
    driver.findElement(By.id("navbar_password_hint")).sendKeys("Пароль");
    driver.findElement(By.id("navbar_password")).clear();
    driver.findElement(By.id("navbar_password")).sendKeys("4731172bmw");
    driver.findElement(By.id("navbar_password")).clear();
    driver.findElement(By.id("navbar_password")).sendKeys("4731172bmw");
    driver.findElement(By.cssSelector("input.loginbutton")).click();
    driver.findElement(By.cssSelector("input.loginbutton")).click();
    assertEquals(driver.getTitle(), "BMW Club Ukraine");
    assertEquals(driver.getTitle(), "BMW Club Ukraine");
    assertEquals(driver.getTitle(), "BMW Club Ukraine");
    assertEquals(driver.getTitle(), "BMW Club Ukraine");
            driver.close();

        }

}
