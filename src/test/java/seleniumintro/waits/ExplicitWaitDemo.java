package seleniumintro.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

/*
    Some common methods of explicit wait:
        1. elementToBeClickable() - exists + visible + enabled for interaction.
        2. visibilityOfElementLocated() - exists + user can see it.
        3. presenceOfElementLocated() - exists in DOM.
        4. titleContains() - waits for the title of the web page to contain the specified
        5. alertsPresent() - waits for an alert to be present
 */

public class ExplicitWaitDemo {

    @Test
    public void explicitWaitDemo() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[text()='Start']")).click();

        // Define Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        String msg = wait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("//div[@id='finish']"))).getText();

        System.out.println("Message from herokuapp: "+msg);

        driver.quit();
    }
}
