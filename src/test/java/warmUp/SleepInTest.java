package warmUp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SleepInTest {

    @Test
    @DisplayName("should return true if both parametres are false")
    void sleepIn() {
        //given
        boolean weekDay = false;
        boolean vacation = false;
        boolean expectedValue = true;
        //when
        boolean returnedValue = SleepIn.sleepIn(weekDay, vacation);
        //then
        assertEquals(expectedValue, returnedValue);

    }
}