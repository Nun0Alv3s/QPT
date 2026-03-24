package qaptaintesting.tests;

import qaptaintesting.common.TestBase;
import org.testng.annotations.Test;

public class ExampleTest extends TestBase {

    @Test(description = "Example Test")
    protected void testExample() {
        System.out.println("hello world!");
    }
}
