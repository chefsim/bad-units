# Bad Unit

A number of examples that show bad practices seen in unit tests.
Examples are written in Ruby with RSpec and Java with JUnit.

There may not be a corresponding code example.

**Test Always Passes**

  The assert will just assert that `true` is equal to `true`, thereby passing the test regardless of what has happened

**Test name doesn't describe what test does**

  The test name is a summary of what the test is checking.
If it is not describing it correctly, you are making life difficult for the poor soul who ends up debugging it (and there is a non-zero chance that person will be you!)

**Test is checking more than one thing**

  Unit tests should follow the *Assign (Given)* *Act (When)* *Assert (Then)* model.
No actions should be done after an assertion. This indicates you are doing more than one test. 
