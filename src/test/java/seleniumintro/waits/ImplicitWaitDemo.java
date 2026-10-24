package seleniumintro.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWaitDemo {

    @Test
    public void implicitWaitDemo() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Implicit Wait Declaration
        driver.get("https://www.brainwareuniversity.ac.in/blog/top-free-online-learning-portal/");

        driver.findElement(By.xpath("//a[@title='Search' and @class='search-icon']"))
                .click();
        driver.findElement(By.xpath("//input[@type='search' and @class='search-field']"))
                .sendKeys("Java");

        driver.quit();
    }
}
