package suiteA;

import org.testng.annotations.Test;
import testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassAA extends TestBase {

    @Test
    public void testAA() throws InterruptedException {
        log("Starting Test AA");
        log("Ending Test AA");
    }
}
