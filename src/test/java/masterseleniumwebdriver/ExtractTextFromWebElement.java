package masterseleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExtractTextFromWebElement {

    WebDriver driver = null;

    @Test
    public void extractText() {

        // Extract text from heading
//        String headingTxt = driver.findElement(By
//                .xpath("//div[@class='css-0']//p[@class='indicate-hover o1TbBq_newsLetterSpacing css-1gg6cw2']"))
//                .getText();
//        Assert.assertEquals(headingTxt, "Iran Is in ‘Advanced Stages’ of Planning Attacks Against Americans, Officials Say");

        // Extract text from link
        WebElement linkTxt = driver.findElement(By.linkText("Categories"));
        Assert.assertEquals(linkTxt.getText(), "Categories");

        // Extract text from placeholder
        String placeholderTxt = driver.findElement(By.id("query")).getAttribute("placeholder");
        Assert.assertEquals(placeholderTxt, "Type / to search");
    }

    @BeforeMethod
    public void init() {
        // Chrome Headless Setup
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); // run without UI
//        options.addArguments("--disable-gpu"); // recommended for stability
//        options.addArguments("--window-size=1920,1080"); // set viewport size

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        driver.get("https://www.nytimes.com/");
        driver.get("https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.20");
    }

    @AfterMethod
    public void finish() {
        driver.quit();
    }
}
