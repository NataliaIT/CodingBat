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

}
