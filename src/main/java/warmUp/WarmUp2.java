package warmUp;

public class WarmUp2 {

    /*

Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
     */

    public String stringTimes(String str, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString += str;
        }
        return newString;

    }

    /*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
     */

    boolean doubleXSolution1(String str) {
        int indexOfFirstX = str.indexOf('x');

        if ((str.length() < 2) || (indexOfFirstX == str.length() - 1)) return false;

        else if (str.charAt(indexOfFirstX + 1) == 'x') return true;
        else return false;

    }

    boolean doubleXSOlution2(String str) {
        int indexOfFirstX = str.indexOf('x');
        if ((indexOfFirstX == -1) || (indexOfFirstX + 1 >= str.length())) return false;

        String substringStartedWithX = str.substring(indexOfFirstX);
        return substringStartedWithX.startsWith("xx");
    }

    /*
    Given a string, return the count of the number of times that a substring length 2 appears
    in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1
    (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
     */
    public int last2(String str) {

    }
}

}
