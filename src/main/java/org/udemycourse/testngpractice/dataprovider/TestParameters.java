package org.udemycourse.testngpractice.dataprovider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

    @Parameters("browser")
    @Test
    public void testCaseOne(String browser) {
        System.out.println("Browser passed as: "+browser);
    }

    @Parameters({"userName", "password"})
    @Test
    public void testCaseTwo(String userName, String password) {
        System.out.println("Parameter for username passed as: "+userName);
        System.out.println("Parameter for password passed as: "+password);
    }
}
