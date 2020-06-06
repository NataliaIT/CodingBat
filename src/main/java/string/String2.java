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


    /*
Given two strings, return true if either of the strings appears
at the very end of the other string, ignoring upper/lower case differences
(in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
     */

    public boolean endOther(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        return a.substring(a.length() - b.length()).equalsIgnoreCase(b);
    }

    /*
We'll say that a String is xy-balanced if for all the 'x' chars
in the string, there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
     */

    public boolean xyBalance(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                if (
                        str.substring(i + 1, str.length()).contains("y") &&
                                str.charAt(str.length() - 1) != 'x') {
                    return true;

                }
                return false;
            }
        }
        return true;
    }


    /*

Given a string and an int n, return a string made of the first n characters
of the string, followed by the first n-1 characters of the string, and so on.
You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).


repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
     */


    public String repeatFront(String str, int n) {
        String result = str.substring(0, n);

        if (n > 1) {
            for (int i = 1; i < n; i++) {
                result = result + str.substring(0, n - i);
            }
        }
        return result;
    }


    /*

Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of chars to the left
and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
     */
    public boolean xyzMiddle(String str) {
        int half = str.length() / 2;

        if ((str.length() >= 3) &&
                (str.substring(half - 1, half + 2).equals("xyz")
                        || (str.length() % 2 == 0 && str.substring(half - 2, half + 1).equals("xyz")))) {
            return true;
        }
        return false;
    }


    /*
    Given a string, compute a new string by moving the first char
    to come after the next two chars, so "abc" yields "bca".
    Repeat this process for each subsequent group of 3 chars,
    so "abcdef" yields "bcaefd".
    Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
     */

    public String oneTwo(String str) {
        String result = "";
        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i += 3) {
                result = result + str.substring(i + 1, i + 3) + str.charAt(i);
            }
        }
        return result;
    }


    /*
Given a string and a non-empty word string,
return a version of the original String where all chars have been replaced by pluses
("+"), except for appearances of the word string which are preserved unchanged.


plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     */
    public String plusOut(String str, String word) {
        String result = "";
        for (int i = 0; i < str.length(); ) {
            if (i + word.length() <= str.length()
                    && str.substring(i, i + word.length()).equals(word)) {
                result += word;
                i += word.length();
            } else {
                result += "+";
                i++;
            }
        }
        return result;
    }


    /*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
     */
    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length() - 2; ) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
                i += 3;
            } else if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
                i += 3;
            } else i++;
        }

        return countCat == countDog;
    }



    /*
    Return true if the given string contains an appearance of "xyz"
    where the xyz is not directly preceeded by a period (.).
    So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
     */
    public boolean xyzThere(String str) {
        return str.startsWith("xyz") || str.matches(".*[^.]xyz.*");
    }
}
