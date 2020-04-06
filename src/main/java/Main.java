import warmUp.Diff21;
import warmUp.WarmUp1;

import static warmUp.SleepIn.sleepIn;
import static warmUp.WarmUp1.backAround;
import static warmUp.WarmUp1.missingChar;

public class Main {

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(Diff21.diff21(21));
        System.out.println(WarmUp1.nearHundred(93));
        System.out.println(missingChar("kitten", 1));
        System.out.println(backAround("cat"));
        System.out.println(WarmUp1.startHi("hi there"));
        System.out.println(WarmUp1.hasTeen(13,20,10));
    }


}
