package string;

public class String2 {


    /*
    Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    /*
Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
     */


    public int countCode(String str) {
        int count = 0;
        if (str.length() > 3)
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                    count++;
                }
            }
        return count;
    }

    /*
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
     */

    public boolean bobThere(String str) {
        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                    return true;
                }
            }
        }
        return false;
    }



    /*
Given a string and an int n, return a string made of n repetitions
of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.


repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
     */


    public String repeatEnd(String str, int n) {
        String result = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }
        return result;
    }


    /*

Given a string, consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
     */

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix))
                return true;
        }
        return false;
    }


    /*
Returns true if for every '*' (star) in the string,
if there are chars both immediately
before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
     */

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }

        return true;
    }


    /*
Return a version of the given string, where for every star (*)
in the string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
     */
    public String starOut(String str) {
        String pattern = "([^*]{0,1})\\*+([^*]{0,1})";
        return str.replaceAll(pattern, "");
    }

/*
Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, (i + 2)).equals("hi")) {
                count++;
            }
        }
        return count;
    }
}
