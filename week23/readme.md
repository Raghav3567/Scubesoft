# Ensure JDK & Maven are installed:

Run in VS Code terminal:

java -version
mvn -version


# Open the project folder in VS Code.

You’ll see the same hierarchy in the Explorer view.

## Run the Test:

Open terminal and execute:

mvn test


Or run directly from the TestRunner.java (use the Run/Debug CodeLens above the class name if the extension supports it).


# After Execution

Cucumber test output will appear in the Terminal panel.

## The HTML report will be generated at:

target/cucumber-report.html


# Open it in a browser to view results.