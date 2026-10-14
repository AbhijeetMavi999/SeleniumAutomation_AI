package org.udemycourse.testngpractice.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {

    @Test(dataProvider = "getData")
    public void testAddition(int actual, int expected) {
        int actualValue = actual + 20;
        Assert.assertEquals(actualValue, expected);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                {100, 123}, {47, 67}, {201, 342}, {214, 234}, {300, 159}
        };
    }
}
