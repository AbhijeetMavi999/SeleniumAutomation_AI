package suiteB;

import org.testng.annotations.Test;
import testbase.TestBase;

public class TestClassB extends TestBase {

    @Test
    public void testB() throws InterruptedException {
        System.out.println("Starting Test B");
        Thread.sleep(5000);
        System.out.println("Ending Test B");
    }
}
