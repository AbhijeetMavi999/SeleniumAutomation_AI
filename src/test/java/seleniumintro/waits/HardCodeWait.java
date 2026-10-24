package seleniumintro.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardCodeWait  {

    @Test
    public void waitForGoogleSearch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        Thread.sleep(5000);

        // Search Box
        driver.findElement(By.xpath("//textarea[@class='gLFyf' and @aria-label='Search']"))
                .sendKeys("Java Interview");

        driver.quit();
    }
}
