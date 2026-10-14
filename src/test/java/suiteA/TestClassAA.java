package suiteA;

import org.testng.annotations.Test;
import testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassAA extends TestBase {

    @Test
    public void testAA() {
        super.log("Starting Test AA");
        super.log("Ending Test AA");
    }
}
