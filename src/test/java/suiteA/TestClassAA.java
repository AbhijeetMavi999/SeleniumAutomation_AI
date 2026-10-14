package suiteA;

import org.testng.annotations.Test;
import testbase.TestBase;

public class TestClassAA extends TestBase {

    @Test
    public void testAA() throws InterruptedException {
        System.out.println("Starting TestAA");
        Thread.sleep(5000);
        System.out.println("Ending TestAA");
    }
}
