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
}