package seleniumintro.webelements;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Slf4j
public class LocatorsDemo {

    /*
    Test case - Verify RedIff SignIn Functionality
    1. Open RedIff
    2. Verify RedIff page title
    3. Click on SignIn
    4. Verify Web Page title
    5. Click on forgot password?
    6. Verify Page title
     */

    @Test
    public void verifyRediffSignIn() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open RedIff
        driver.get("https://www.rediff.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        log.info("Rediff open successfully.");

        // Verify RedIff homepage title
        String rediffHomepageTitle = driver.getTitle();
        Assert.assertEquals(rediffHomepageTitle, "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");
        log.info("Homepage title verified successfully.");

        // Click on SignIn
        WebElement signInLink = driver.findElement(By.xpath("//span[@id='prof_icon']//*[name()='svg']"));
        signInLink.click();
        String signInTitle = driver.getTitle();
        Assert.assertEquals(signInTitle, "Rediffmail - Free Email for Login with Secure Access");
        log.info("Clicked on SignIn.");

        // click on signUp
        driver.findElement(By.linkText("Forgot password?")).click();
        String signUpTitle = driver.getTitle();
        Assert.assertEquals(signUpTitle, "Rediff - Password help assistance");
        log.info("Clicked on forgot password.");

        Thread.sleep(5000);
        driver.quit();
    }
}
