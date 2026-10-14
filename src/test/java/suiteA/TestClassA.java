package suiteA;

import org.testng.annotations.Test;
import testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassA extends TestBase {

    @Test
    public void testA() throws InterruptedException {
        log("Starting Test A");
        log("Ending Test A");
    }
}
