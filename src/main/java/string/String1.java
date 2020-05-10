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

}
