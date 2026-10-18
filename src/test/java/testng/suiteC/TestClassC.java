package testng.suiteC;

import org.testng.annotations.Test;
import testng.testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassC extends TestBase {

    @Test
    public void testC() {
        log("Starting Test C");
        log("Ending Test C");
    }
}
