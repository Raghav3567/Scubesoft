package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.*;
import utils.ExtentManager;

public class BaseTest {
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void startReport() {
        extent = ExtentManager.getInstance();
    }

    @AfterSuite
    public void endReport() {
        extent.flush(); // Write the report to disk
    }
}
