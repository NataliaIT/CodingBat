package warmUp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarmUp1Test {

    @Test
    @DisplayName("nearHundred(93) → true")
    void nearHundred() {
        int n = 93;
        boolean expectedValue = true;
        boolean returnedValue = WarmUp1.nearHundred(n);
        assertEquals(expectedValue,returnedValue);
    }

    @Test
    @DisplayName("nearHundred(90) → true")
    void testNearHundred() {
        int n = 90;
        boolean expectedValue = true;
        boolean returnedValue = WarmUp1.nearHundred(n);
        assertEquals(expectedValue,returnedValue);
    }

    @Test
    @DisplayName("(kitten, 0) → itten")
    void missingChar() {
        int n = 0;
        String str = "kitten";
        String expectedValue="itten";
        String returnedValue=WarmUp1.missingChar(str,n);
        assertEquals(expectedValue,returnedValue);
        }

    @Test
    void backAround() {
        String str = "Hello";
        String expectedValue = "oHelloo";
        String returnedValue = WarmUp1.backAround(str);
        assertEquals(expectedValue,returnedValue);
    }
}