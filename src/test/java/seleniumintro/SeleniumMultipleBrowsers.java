package seleniumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumMultipleBrowsers {

    @Test
    public void openInChrome() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String tile = driver.getTitle();
        Assert.assertEquals(tile, "Facebook");
        driver.quit();
    }

    @Test
    public void openInFirefox() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String tile = driver.getTitle();
        Assert.assertEquals(tile, "Facebook");
        driver.quit();
    }
}
