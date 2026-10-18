package testng.suiteA;

import testng.dataprovider.TestDataProvider;
import org.testng.annotations.Test;
import testng.testbase.TestBase;

public class TestClassA extends TestBase {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataProviderSuiteA")
    public void testA(String args1, String args2) {
        System.out.println("Starting Test A");
        System.out.println("USERNAME --> "+args1);
        System.out.println("PASSWORD --> "+args2);
        System.out.println("Ending Test A");
    }
}
