package com.chefsim.badUnits;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 *
 */
public class AppTest {

    @Test
    public void assertAlwaysPasses() {
        assertThat(true, equalTo(true));
    }

    @Test(expected = NullPointerException.class)
    public void errorThrownInAssignSteps() {
        String assignStep = null;
        String actStep = null;
        assignStep.isEmpty(); // Exception is thrown here

        actStep.contains("nothing");
    }

}
