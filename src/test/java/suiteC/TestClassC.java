package suiteC;

import org.testng.annotations.Test;
import testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassC extends TestBase {

    @Test
    public void testC() {
        log("Starting Test C");
        log("Ending Test C");
    }
}
