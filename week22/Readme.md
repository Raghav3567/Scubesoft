# Run and View Report

# Run your TestNG test suite.

After execution, open:

<your-project>/test-output/ExtentReport.html


You’ll see a beautiful, interactive report like this:

📊 Sample Report Includes:

Pass/Fail count

Execution time

Detailed test logs

Environment info

# Add Screenshots for Failed Tests

If you want to attach screenshots:

test.addScreenCaptureFromPath("path/to/screenshot.png", "Failure Screenshot");


You can generate screenshots in your @AfterMethod if test fails using Selenium’s TakesScreenshot.

