package org.udemycourse.testngpractice;

import org.testng.annotations.*;

public class SampleTest {

    @AfterSuite
    public void afterSuiteMethod() {
        System.out.println("Executing After Test Suite");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("Executing Before Test Suite");
    }
}
