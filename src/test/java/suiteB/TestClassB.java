package suiteB;

import org.testng.annotations.Test;
import testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassB extends TestBase {

    @Test
    public void testB() throws InterruptedException {
        log("Starting Test B");
        log("Ending Test B");
    }
}
