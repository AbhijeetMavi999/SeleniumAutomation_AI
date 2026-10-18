package testng.suiteB;

import testng.dataprovider.TestDataProvider;
import org.testng.annotations.Test;
import testng.testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassB extends TestBase {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataProviderSuiteB")
    public void testB() {
        log("Starting Test B");
        log("Ending Test B");
    }
}
