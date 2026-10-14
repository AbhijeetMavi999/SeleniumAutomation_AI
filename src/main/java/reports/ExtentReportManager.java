package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

    static ExtentReports extentReports;

    public static ExtentReports getReporter() {
        if(extentReports == null) {
            extentReports = new ExtentReports();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("index.html");
            sparkReporter.config().setTheme(Theme.STANDARD);
            sparkReporter.config().setDocumentTitle("TestNG Pilot Report");
            sparkReporter.config().setReportName("TestNG Extent Report");
            extentReports.attachReporter(sparkReporter);
        }
        return extentReports;
    }
}
