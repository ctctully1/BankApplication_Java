/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaproject3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        BankAccountApp classUnderTest = new BankAccountApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}