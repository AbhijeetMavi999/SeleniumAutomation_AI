package testng.suiteC;

import org.testng.annotations.Test;
import testng.testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassCC extends TestBase {

    @Test
    public void testCC() {
        log("Starting Test CC");
        log("Ending Test CC");
    }
}
