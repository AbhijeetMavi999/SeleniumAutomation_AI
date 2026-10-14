package suiteC;

import org.testng.annotations.Test;
import testbase.TestBase;

public class TestClassCC extends TestBase {

    @Test
    public void testCC() throws InterruptedException {
        System.out.println("Starting TestCC");
        Thread.sleep(5000);
        System.out.println("Ending TestCC");
    }
}
