package seleniumintro.customizedxpaths;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

@Slf4j
public class AutomateReddiffWithXPaths {

    @Test
    public void automateReddiff() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//span[@id='prof_icon']//*[name()='svg']")).click();
        log.info("Clicked on Login and Signup Icon.");

        driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
        log.info("Clicked on create new account");

        log.info("*** Fill input fields ***");
        log.info("Enter your full name");
        driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"))
                .sendKeys("John Cena");

        log.info("Enter your email address");
        driver.findElement(By.xpath("//div[@class='emailCnt']/input[@type='text']"))
                .sendKeys("johncena123");

        log.info("Enter your password");
        driver.findElement(By.xpath("//input[@id='newpasswd']"))
                .sendKeys("password123");
        log.info("Retype your password");
        driver.findElement(By.xpath("//input[@id='newpasswd1']"))
                .sendKeys("password123");

        log.info("*** Enter your Date Of Birth ***");
        log.info("Select Day");
        List<WebElement> days = driver.findElements(By.xpath("//div[8]//select[@class='day']//option"));
        for(WebElement day: days) {
//            System.out.print(date.getText()+" ");
            if(day.getText().equalsIgnoreCase("21")) {
                day.click();
            }
        }
        log.info("Select Month");
        List<WebElement> months = driver.findElements(By.xpath("//div[8]//select[@class='middle month']//option"));
        for(WebElement month: months) {
            if(month.getText().equalsIgnoreCase("DEC")) {
                month.click();
            }
        }
        log.info("Select Year");
        List<WebElement> years = driver.findElements(By.xpath("//div[8]//select[@class='year']//option"));
        for(WebElement year: years) {
            if(year.getText().equalsIgnoreCase("1998")) {
                year.click();
            }
        }

        log.info("Select City");
        List<WebElement> cities = driver.findElements(By.xpath("//div[@id='div_city']//div//select//option"));
        for(WebElement city: cities) {
            if(city.getText().equalsIgnoreCase("Dehradun")) {
                city.click();
            }
        }

        log.info("Click if you don't have alternate ID");
        driver.findElement(By.xpath("//div[@class='form-group']//div//input[@type='checkbox']")).click();

        log.info("Enter Mobile Number");
        driver.findElement(By.id("mobno")).sendKeys("9090941332");

        driver.quit();
    }
}
