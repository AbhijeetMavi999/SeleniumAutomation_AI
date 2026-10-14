package suiteA;

import org.testng.annotations.Test;
import testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassA extends TestBase {

    @Test
    public void testA() {
        super.log("Starting Test A");
        super.log("Ending Test A");
    }
}
