package testng.suiteA;

import testng.dataprovider.TestDataProvider;
import org.testng.annotations.Test;
import testng.testbase.TestBase;

import static org.testng.Reporter.log;

public class TestClassAA extends TestBase {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataProviderSuiteA")
    public void testAA(String args1, String args2) {
        super.log("Starting Test AA");
        log("USERNAME --> "+args1);
        log("PASSWORD --> "+args2);
        super.log("Ending Test AA");
    }
}
