package suiteB;

import org.testng.annotations.Test;
import testbase.TestBase;

public class TestClassBB extends TestBase {

    @Test
    public void testBB() throws InterruptedException {
        System.out.println("Starting TestBB");
        Thread.sleep(5000);
        System.out.println("Ending TestBB");
    }
}
