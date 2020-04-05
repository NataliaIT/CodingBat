package warmUp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {

    @Test
    @DisplayName("for param 19 it returns 2")
    void diff21() {
        int n = 19;
        int expectedValue = 2;
        int returnValue = Diff21.diff21(n);
        assertEquals(expectedValue, returnValue);
    }

    @Test
    @DisplayName("for param 21 returns 0")
    void testDiff21() {
        int n = 21;
        int expectedValue=0;
        int returnedValue = Diff21.diff21(n);
        assertEquals(expectedValue,returnedValue);
    }
}