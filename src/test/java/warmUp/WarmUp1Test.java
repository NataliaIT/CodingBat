package warmUp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarmUp1Test {

    @Test
    @DisplayName("for param 19 it returns 2")
    void diff21() {
        int n = 19;
        int expectedValue = 2;
        int returnValue = WarmUp1.diff21(n);
        assertEquals(expectedValue, returnValue);
    }

    @Test
    @DisplayName("for param 21 returns 0")
    void testDiff21() {
        int n = 21;
        int expectedValue = 0;
        int returnedValue = WarmUp1.diff21(n);
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    @DisplayName("should return true if both parametres are false")
    void sleepIn() {
        //given
        boolean weekDay = false;
        boolean vacation = false;
        boolean expectedValue = true;
        //when
        boolean returnedValue = WarmUp1.sleepIn(weekDay, vacation);
        //then
        assertEquals(expectedValue, returnedValue);

    }

    @Test
    @DisplayName("nearHundred(93) → true")
    void nearHundred() {
        int n = 93;
        boolean expectedValue = true;
        boolean returnedValue = WarmUp1.nearHundred(n);
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    @DisplayName("nearHundred(90) → true")
    void testNearHundred() {
        int n = 90;
        boolean expectedValue = true;
        boolean returnedValue = WarmUp1.nearHundred(n);
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    @DisplayName("(kitten, 0) → itten")
    void missingChar() {
        int n = 0;
        String str = "kitten";
        String expectedValue = "itten";
        String returnedValue = WarmUp1.missingChar(str, n);
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    @DisplayName("Hello -> oHelooo")
    void backAround() {
        String str = "Hello";
        String expectedValue = "oHelloo";
        String returnedValue = WarmUp1.backAround(str);
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    @DisplayName(" i -> false")
    void startHi() {
        String str = "i";
        boolean expectedValue = false;
        boolean returnedValue = WarmUp1.startHi(str);
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    @DisplayName("(20, 19, 10) → true")
    void hasTeen() {
        int a = 20;
        int b = 19;
        int c = 10;
        boolean expectedValue = true;
        boolean returnedValue = WarmUp1.hasTeen(a, b, c);
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    @DisplayName("piz snacks → false")
    void mixStart() {
        String str = "piz snacks";
        boolean expectedValue = false;
        boolean returnedValue = WarmUp1.mixStart(str);
        assertEquals(expectedValue, returnedValue);
    }


    @Test
    @DisplayName("close10(13, 7) → 0")
    void close10() {
        int a = 13;
        int b = 7;
        int expectedValue = 0;
        int returnedValue = WarmUp1.close10(a, b);
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    @DisplayName("Heelele → false")
    void stringE() {
        String str = "Heelele";
        boolean expectedValue = false;
        boolean returnedValue = WarmUp1.stringE(str);
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    @DisplayName("abcdefg, 2 → aceg")
    void everyNth() {
        String str = "abcdefg";
        int n = 2;
        String expectedValue = "aceg";
        String returnedValue = WarmUp1.everyNth(str, n);
        assertEquals(expectedValue, returnedValue);
    }
}