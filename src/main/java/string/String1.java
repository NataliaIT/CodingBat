package string;

public class String1 {

    /*

Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /*

Given an "out" string length 4, such as "<<>>", and a word,
return a new string where the word is in the middle of the out string,
e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i
and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
     */
    public String makeOutWord(String out, String word) {
        String start = out.substring(0, 2);
        String end = out.substring(2);
        return start + word + end;
    }

    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
     */

    public String firstHalf(String str) {
        int newLength = str.length() / 2;
        return str.substring(0, newLength);
    }

    /*
    Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
     */

    public String nonStart(String a, String b) {
        String front = "";
        String end = "";
        for (int i = 1; i < a.length(); i++) {
            front += a.charAt(i);
        }
        for (int i = 1; i < b.length(); i++) {
            end += b.charAt(i);
        }
        return front + end;
    }

    /*
    Given a string, return a string length 1 from its front,
    unless front is false, in which case return a string length 1
    from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
     */

    public String theEnd(String str, boolean front) {
        String newStr = "";
        if (front == true) {
            newStr = str.substring(0, 1);

        } else if (front == false) {
            newStr = str.substring(str.length() - 1);
        }

        return newStr;
    }


    /*
    Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
     */

    public boolean endsLy(String str) {
        if (str.length() < 2) return false;
        return str.substring(str.length() - 2).equals("ly");
    }

    /*
    Given a string of odd length, return the string length 3 from its middle,
    so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
     */

    public String middleThree(String str) {
        int midLetterNo = str.length() / 2;
        String middleStr = str.substring(midLetterNo - 1, midLetterNo + 2);
        return middleStr;
    }

    /*

Given 2 strings, a and b, return a new string made of the first char of a
and the last char of b, so "yo" and "java" yields "ya". If either string
is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
     */

    public String lastChars(String a, String b) {
        String front = "";
        String end = "";
        if (a.length() < 1) {
            front = "@";
        } else front = a.substring(0, 1);

        if (b.length() < 1) {
            end = "@";
        } else end = b.substring(b.length() - 1);

        return front + end;
    }


    /*
    Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
     */

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return str.substring(0, 3);
        } else if (str.startsWith("blue")) {
            return str.substring(0, 4);
        } else return "";
    }

    /*

Given a string, return a new string made of 3 copies of the first 2 chars
 of the original string. The string may be any length.
 If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
     */


    public String extraFront(String str) {
        String newStr = "";
        if (str.length() < 2) {
            newStr = str + str + str;
        } else {
            String temp = str.substring(0, 2);
            newStr = temp + temp + temp;
        }

        return newStr;
    }


    /*
    Given a string and a second "word" string, we'll say
    that the word matches the string if it appears at the front
     of the string, except its first char does not need to match exactly.
     On a match, return the front of the string, or otherwise
     return the empty string. So, so with the string "hippo" the word "hi"
     returns "hi" and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
     */
    public String startWord(String str, String word) {
        int strLength = str.length();
        int wordLength = word.length();
        String resultStr = "";
        if (strLength >= wordLength) {

            if (str.substring(1, wordLength).equals(word.substring(1))) {
                resultStr = str.charAt(0) + word.substring(1);
            }

        }
        return resultStr;
    }
}
