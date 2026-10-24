package seleniumintro.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PageLoadTimeOut {

    @Test
    public void pageLoadTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Page Load time
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://edition.cnn.com");

        Assert.assertEquals(driver.getTitle(), "Breaking News, Latest News and Videos | CNN");
        driver.quit();
    }
}
