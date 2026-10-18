package testng.suiteB;

import org.testng.annotations.Test;
import testng.testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassBB extends TestBase {

    @Test
    public void testBB() {
        log("Starting Test BB");
        log("Ending Test BB");
    }
}
