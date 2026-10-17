package dataprovider;

// Creating separate Data Provider for Each Test Suite
// External Data Source - JSON, Excel, YAML, XML

import org.testng.annotations.DataProvider;
import java.lang.reflect.Method;

public class TestDataProvider {

    @DataProvider
    public static Object[][] dataProviderSuiteA(Method method) {
        System.out.println("Test Method Name: " + method.getName());

        // HardCoding data for testing purpose
        Object[][] data = null;
        if (method.getName().equalsIgnoreCase("TESTA")) {
            data = new Object[2][2];
            data[0][0] = "Username 1";
            data[0][1] = "Password 1";
            data[1][0] = "Username 2";
            data[1][1] = "Password 2";
        } else if (method.getName().equalsIgnoreCase("TESTAA")) {
            data = new Object[2][2];
            data[0][0] = "Username 11";
            data[0][1] = "Password 11";
            data[1][0] = "Username 22";
            data[1][1] = "Password 22";
        }

        return data;
    }

    @DataProvider
    public static Object[][] dataProviderSuiteB(Method method) {
        System.out.println("Test Method Name: " + method.getName());

        // HardCoding data for testing purpose
        Object[][] data = null;
        if (method.getName().equalsIgnoreCase("TESTB")) {
            data = new Object[2][2];
            data[0][0] = "Username 100";
            data[0][1] = "Password 100";
            data[1][0] = "Username 200";
            data[1][1] = "Password 200";
        } else if (method.getName().equalsIgnoreCase("TESTBB")) {
            data = new Object[2][2];
            data[0][0] = "Username 1100";
            data[0][1] = "Password 1100";
            data[1][0] = "Username 2200";
            data[1][1] = "Password 2200";
        }

        return data;
    }
}
