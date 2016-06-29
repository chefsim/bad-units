# Bad Unit

A number of examples that show bad practices seen in unit tests.
Examples are written in Ruby with RSpec and Java with JUnit.

There may not be a corresponding code example.

**Test Always Passes**

  The assert will just assert that `true` is equal to `true`, thereby passing the test regardless of what has happened.

**Test name doesn't describe what test does**

  The test name is a summary of what the test is checking.
If it is not describing it correctly, you are making life difficult for the poor soul who ends up debugging it (and there is a non-zero chance that person will be you!).

**Test is checking more than one thing**

  Unit tests should follow the *Assign (Given)* *Act (When)* *Assert (Then)* model.
No actions should be done after an assertion. This indicates you are doing more than one test. 

**Errors not being caused by the unit you are testing**

  When checking that an error is being thrown, make sure the error is coming from the bit you are actually testing and not in a setup step.
If anything other than the code you are testing may throw the error you are checking, surround in try/catch blocks and throw another error instead.

**Mocking Data Storage Objects**
  
  Examples of data storage objects are classes that only consist of getters and setters, or hashs, maps arrays etc. Only use mocks to bypass or control the results of methods that perform some kind of logic operation (e.g. mock methods that have if statements).
