package suiteC;

import org.testng.annotations.Test;

public class TestClassC {

    @Test
    public void testC() throws InterruptedException {
        System.out.println("Starting Test C");
        Thread.sleep(5000);
        System.out.println("Ending Test C");
    }
}
