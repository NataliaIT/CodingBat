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
        return a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6;
    }


    /*
    Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod

more20(20) → false
more20(21) → true
more20(22) → true
     */
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }


    /*
    Given a non-negative number "num", return true
    if num is within 2 of a multiple of 10.
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
    See also: Introduction to Mod


nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
     */

    public boolean nearTen(int num) {
        return num % 10 >= 8 || num % 10 <= 2;
    }


    /*
    We are having a party with amounts of tea and candy.
    Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
    A party is good (1) if both tea and candy are at least 5.
    However, if either tea or candy is at least double the amount of the other one,
    the party is great (2). However, in all cases, if either tea or candy
    is less than 5, the party is always bad (0).


teaParty(6, 8) → 1
teaParty(3, 8) → 0
teaParty(20, 6) → 2
     */

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else return 1;
    }


    /*
    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
     */

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }


    /*
    Given three ints, a b c, return true if two or more of them have the same rightmost digit.
    The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
     */

    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10;
    }

    /*
    Given two int values, return whichever value is larger.
    However if the two values have the same remainder when divided by 5,
    then the return the smaller value. However, in all cases, if the two values are the same,
    return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.


maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
     */

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return a < b ? a : b;
        } else return a > b ? a : b;
    }


    /*
You have a blue lottery ticket, with ints a, b, and c on it.
This makes three pairs, which we'll call ab, bc, and ac.
Consider the sum of the numbers in each pair.
If any pair sums to exactly 10, the result is 10.
Otherwise if the ab sum is exactly 10 more than either bc or ac sums,
the result is 5. Otherwise the result is 0.


blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10
     */

    public int blueTicket(int a, int b, int c) {

        if (a + b == 10 || b + c == 10 || c + a == 10) {
            return 10;
        } else if ((a + b == 10 + b + c) || (a + b == 10 + a + c)) {
            return 5;
        } else return 0;
    }


    /*
    You and your date are trying to get a table at a restaurant.
    The parameter "you" is the stylishness of your clothes, in the range 0..10,
    and "date" is the stylishness of your date's clothes.
    The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
    If either of you is very stylish, 8 or more, then the result is 2 (yes).
    With the exception that if either of you has style of 2 or less, then the result is 0 (no).
    Otherwise the result is 1 (maybe).


dateFashion(5, 10) → 2
dateFashion(5, 2) → 0
dateFashion(5, 5) → 1
     */

    public int dateFashion(int you, int date) {
        if (you < 3 || date < 3) {
            return 0;
        } else if (you > 7 || date > 7) {
            return 2;
        } else return 1;
    }


    /*
    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
    are forbidden, so in that case just return 20.


sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
     */

    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        }
        return a + b;
    }

    /*
    Given a number n, return true if n is in the range 1..10, inclusive.
    Unless outsideMode is true, in which case return true if the number is less or equal to 1,
    or greater or equal to 10.


in1To10(5, false) → true
in1To10(11, false) → false
in1To10(11, true) → true
     */

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            if (n <= 1 || n >= 10) {
                return true;
            }

        } else {
            if (n >= 1 && n <= 10) {
                return true;
            }
        }
        return false;
    }


    /*
    Return true if the given non-negative number is a multiple of 3 or 5, but not both.


old35(3) → true
old35(10) → true
old35(15) → false
     */

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }
        return n % 3 == 0 || n % 5 == 0;
    }

    /*

Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive,
are extra lucky. So if either value is a teen, just return 19.


teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
     */
    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }


    /*

Given a string str, if the string starts with "f" return "Fizz".
If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz".
In all other cases, return the string unchanged.


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
     */

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        }
        return str;
    }

    /*
    Given three ints, a b c, return true if b is greater than a,
    and c is greater than b. However, with the exception that if "bOk"
    is true, b does not need to be greater than a.


inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true
     */

    public boolean inOrder(int a, int b, int c, boolean bOk) {

        return (!bOk && b > a && c > b) || (bOk && c > b);
    }

/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 */

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 ||
                Math.abs(a - c) >= 10 ||
                Math.abs(b - c) >= 10;
    }

    /*

You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
If they are all the value 2, the result is 10.
Otherwise if they are all the same, the result is 5.
Otherwise so long as both b and c are different from a, the result is 1.
Otherwise the result is 0.


redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5
     */
    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && c != a) {
            return 1;
        }
        return 0;
    }

}
