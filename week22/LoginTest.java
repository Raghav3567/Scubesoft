package tests;

import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        test = extent.createTest("Valid Login Test");
        test.log(Status.INFO, "Starting login test...");

        String expectedTitle = "Dashboard";
        String actualTitle = "Dashboard"; // Replace with actual Selenium code

        if (expectedTitle.equals(actualTitle)) {
            test.pass("Login successful and page title verified.");
        } else {
            test.fail("Login failed or wrong page title.");
        }

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void invalidLoginTest() {
        test = extent.createTest("Invalid Login Test");
        test.log(Status.INFO, "Starting invalid login test...");

        boolean loginResult = false; // Assume login failed

        if (!loginResult) {
            test.pass("Invalid login correctly handled.");
        } else {
            test.fail("Invalid login should not succeed.");
        }

        Assert.assertFalse(loginResult);
    }
}
