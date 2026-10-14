package org.udemycourse.testngpractice.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestCase {

    @Test
    public void testOne() {
        System.out.println("I am Test One...");
    }

    @Test(dataProvider = "dataProvider")
    public void testGetData(String str) {
        System.out.println("Test GetData method, input = "+str);
    }

    @DataProvider
    public Object[] dataProvider() {
        return new Object[] {"A", "B"};
    }

    @Test
    public void testThree() {
        Assert.assertEquals(5, 7);
    }
    @Test
    public void testFour() {
        System.out.println("I am Test Four...");
        throw new SkipException(null);
    }
}
