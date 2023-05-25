# Unit-Testing and TDD Workshop
This project contains three classes. The planet and rock classes have already been implemented for you, but the Rover class contains incomplete methods.

The test class you will be working in is RoverTest - some tests have been completed for you, while others need to be filled in or created.

The project requires JDK 17.

## Setup
### Via IntelliJ
1. Open the project in IntelliJ, click the `load gradle project` popup, and ensure the SDK is set to Java 17

2. To verify that the project has imported correctly, try to run some tests. To do this do one of the following:
    -  Right click the `java` directory inside `src/test` (as this should be marked as the Test Sources Root) and select `Run tests in 'tdd_wordshop'`  
    -  Open the IntelliJ terminal window `ALT+F12` and type `./gradlew test`
    
3. If all went according to plan, the test runner will produce an output saying with a mixture of passing and 
failing tests.

### Via command-line
1. Navigate to the directory  
`cd seng302-tdd-workshop`

2. Verify project has been imported successfully by running the tests through gradle  
`gradlew test` OR `./gradlew test`

3. Gradle should automatically handle the downloading of all dependencies, and then finding and running the tests.
If all went according to plan, then the output of the `./gradlew test` command should produce an output with a mixture 
of passing and failing tests.