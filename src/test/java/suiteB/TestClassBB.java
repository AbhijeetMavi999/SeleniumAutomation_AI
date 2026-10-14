package suiteB;

import org.testng.annotations.Test;
import testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassBB extends TestBase {

    @Test
    public void testBB() throws InterruptedException {
        log("Starting Test BB");
        log("Ending Test BB");
    }
}
