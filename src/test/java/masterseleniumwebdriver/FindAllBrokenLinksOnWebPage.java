package masterseleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindAllBrokenLinksOnWebPage {

    WebDriver driver;

    @Test
        public void findBrokenLinksTest() {
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total anchor tag available is: "+allLinks.size());

        // Click on each link to verify link status: 200 - SUCCESS, 404 - BROKEN LINK
        for(WebElement link: allLinks) {
            String linkURL = link.getAttribute("href");
            VerifyLinkStatus.verifyLink(linkURL);
        }

        System.out.println("Total number of Invalid links: "+VerifyLinkStatus.getInvalidLinkCount());
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://testautomationpractice.blogspot.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
