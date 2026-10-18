package testng.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("******** TEST SUCCESS *******");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("******** TEST FAILED *******");
    }
}
