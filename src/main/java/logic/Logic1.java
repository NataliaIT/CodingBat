package logic;

public class Logic1 {

/*
When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.


cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
 */


    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40)
                return true;
        } else {
            if (cigars >= 40 && cigars <= 60)
                return true;
        }
        return false;
    }


    /*
    You are driving a little too fast, and a police officer stops you.
    Write code to compute the result, encoded as an int value: 0=no ticket,
    1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more,
    the result is 2. Unless it is your birthday -- on that day,
    your speed can be 5 higher in all cases.


caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
     */

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed > 60 && speed <= 80) {
                return 1;
            } else if (speed >= 81) {
                return 2;
            }
        }
        if (isBirthday) {

            if (66 <= speed && speed <= 85) {
                return 1;
            } else if (86 <= speed) {
                return 2;
            }
        }
        return 0;
    }

    /*
The number 6 is a truly great number. Given two int values,
a and b, return true if either one is 6. Or if their sum or difference is 6.
Note: the function Math.abs(num) computes the absolute value of a number.


love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
     */

    public boolean love6(int a, int b) {
return a==6 || b==6 || (a+b)==6 || Math.abs(a-b)==6;
    }

}
