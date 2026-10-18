package seleniumintro.browserprofiling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Commonly Used Arguments
start-maximized → Opens Chrome in maximized mode.
incognito → Launches Chrome in incognito mode.
headless → Runs Chrome without a UI (useful for CI/CD).
disable-extensions → Prevents loading installed extensions.
disable-popup-blocking → Allows pop-ups.
disable-infobars → Hides “Chrome is being controlled by automated software” banner.
window-size → Sets custom window dimensions (e.g., window-size=1200,800).
user-data-dir → Uses a custom Chrome profile directory.
disable-notifications → Blocks site notifications.
disable-gpu → Disables GPU hardware acceleration (often used with headless).
remote-debugging-port → Opens a debugging port for DevTools.
no-sandbox → Runs Chrome without sandboxing (needed in some Linux environments).
disable-dev-shm-usage → Avoids /dev/shm issues in Docker.
make-default-browser → Sets Chrome as default browser.
version → Prints Chrome version.
 */

public class BrowserOptions {

    @Test
    public void chromeBrowserProfiling() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com");

        String title = driver.getTitle();
        Assert.assertEquals(title, "Facebook");

        driver.quit();
    }
}
