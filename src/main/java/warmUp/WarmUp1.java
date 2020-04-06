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
            if(i!=n){
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }


}
