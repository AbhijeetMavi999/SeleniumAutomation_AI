package suiteC;

import org.testng.annotations.Test;
import testbase.TestBase;

public class TestClassC extends TestBase {

    @Test
    public void testC() throws InterruptedException {
        System.out.println("Starting Test C");
        Thread.sleep(5000);
        System.out.println("Ending Test C");
    }
}
