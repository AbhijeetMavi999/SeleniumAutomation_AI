package suiteA;

import org.testng.annotations.Test;
import testbase.TestBase;

public class TestClassA extends TestBase {

    @Test
    public void testA() throws InterruptedException {
        System.out.println("Starting Test A");
        Thread.sleep(5000);
        System.out.println("Ending Test A");
    }
}
