package seleniumintro.browserprofiling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonlyUsedArgumentsDemo {

    @Test
    public void argumentsDemo() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");    // Open chrome in maximize mode
        options.addArguments("--incognito");      // Open chrome in incognito mode
        options.addArguments("--disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://facebook.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Facebook");

        driver.quit();
    }
}
