![Screen Shot 2021-07-14 at 8 02 51 PM](https://user-images.githubusercontent.com/18199526/125721284-f820c36a-b743-4c3a-9885-4fb55245e2fc.png)
# OidTestAutomation

Test Automation Suite was written in Java with JUnit framework. Main method of OidAppLauncher class was slightly modified to allow testing with writing and reading from stdin and stdout. Automation suite is trying to test the app from "white box" as much as it can. Running the app inside the suite, writing inputs and reading outputs. 


Limitations:
--------------

Automation hit few limitiation with reading output. Not all errors and exception are visible thru outputstream.

Class files:
-------------

/oids-master/oid-app/src/test/java/com/bouff/oids/ListFromText.java <br>
/oids-master/oid-app/src/test/java/com/bouff/oids/StdInOutManager.java <br>
/oids-master/oid-app/src/test/java/com/bouff/oids/TestSuite.java <br>

Testing files:
----------------

/oids-master/testInputData.txt <br>
/oids-master/testInputData2.txt <br>
/oids-master/testInputData3.txt <br>

Tests:
-------

ShouldBeTrue <br>
ShouldBeFalse <br>
ShouldBeInvalidEntry <br>
ShouldBeTrueMultiple <br>
ShouldBeTrueMultipleWithSuffix <br> 
ShouldBeFalseMultipleWithSuffix <br>


Running;
---------

Application can be build and deploy with Gradle as Main Project. Absolute paths need to be changed in TestSuite.java and StdInOutManager.java.


Results:
---------

With one input: <br> 
Testing, input: .1.3.6.1.6.3.1.1.5 <br> 
Testing, output: .1.3.6.1.6.3.1.1.5: true <br> 
Test finished in: 86 ms. <br>

With multiple inputs read from the file: <br>
...
Testing, input: .1.2.6.1.4.1.9.10.127.0.1.6.2.45.2245.24645 <br> 
Testing, output: .1.2.6.1.4.1.9.10.127.0.1.6.2.45.2245.24645: false <br>
Test validaded: 84 traps. <br> 
Test finished in: 90 ms. <br>


Tests include simple performance runtime and amount of traps checked. <br> 


Recommendations:
-----------------

Multiple Unit Tests should be sufficient for this kind of utility if there are no network calls.
More test cases would be created if there is more details how and when is this utility being used. 



Miroslav Lison

