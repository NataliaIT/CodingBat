package warmUp;

public class WarmUp1 {

    /*
    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
     */
    public static boolean nearHundred(int n) {
        return (((Math.abs(100 - n)) <= 10) || ((Math.abs(200 - n)) <= 10));

    }


    /*
    Given a non-empty string and an int n, return a new string
     where the char at index n has been removed.
    The value of n will be a valid index of a char in the original
    string (i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
     */

    public static String missingChar(String str, int n) {
        String newStr = "";


        for (int i = 0; i < str.length(); i++) {
            if (i != n) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    /*

Given a string, take the last char and return a
new string with the last char added at the front
and back, so "cat" yields "tcatt". The original
string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
     */
    public static String backAround(String str) {
        char lastLetter = str.charAt(str.length() - 1);
        return lastLetter + str + lastLetter;
    }

    /*
    Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
     */

    public static boolean startHi(String str) {
        if (str.length() < 2) return false;
        return str.substring(0, 2).equals("hi");
    }

    /*
    We'll say that a number is "teen" if it is
    in the range 13..19 inclusive. Given 3 int values,
     return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
     */

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 & a <= 19 ||
                b >= 13 & b <= 19 ||
                c >= 13 & c <= 19);
    }

    /*
    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
Go...
     */

    public static boolean mixStart(String str) {
        if (str.length()<3) return false;
        return str.substring(1, 3).equals("ix");
    }

}
