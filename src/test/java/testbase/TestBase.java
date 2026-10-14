package testbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import reports.ExtentReportManager;

public class TestBase {

    public ExtentReports extentReports;
    public ExtentTest extentTest;

    @BeforeMethod
    public void init(ITestResult res) {
        extentReports = ExtentReportManager.getReporter();
        extentTest = extentReports.createTest(res.getMethod().getMethodName());
    }

    @AfterMethod
    public void quit() {
        extentReports.flush();
    }

    public void log(String msg) {
        extentTest.info("msg");
    }
    public void pass(String msg) {
        extentTest.pass(msg);
    }
    public void fail(String msg) {
        extentTest.fail(msg);
    }
    public void skip(String msg) {
        extentTest.skip(msg);
    }
}
