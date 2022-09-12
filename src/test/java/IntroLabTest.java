/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 20)
    public void testExampleStudent() {
        String expected = "Hello! My name is Julia! " +
                "I like dogs more than cats! Welcome to CSC207!";
        String actual = IntroLab.olive256();
        assertEquals(expected, actual);
    }

    /* Write a test case for the method you wrote in IntroLab.
     *       If done properly, you should be able to run IntroLabTest and see
     *       the test results.
     * As a reference, we've included testExampleStudent above.
     */

    @Test(timeout = 20)
    public void testLen() {
        int expected_len = "Hello! My name is Julia! I like dogs more than cats! Welcome to CSC207!".length();
        int actual_len = IntroLab.olive256().length();
        assertEquals(expected_len, actual_len);
    }
}
