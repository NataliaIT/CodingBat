import warmUp.WarmUp1;

import static warmUp.WarmUp1.backAround;
import static warmUp.WarmUp1.missingChar;

public class Main {

    public static void main(String[] args) {
        System.out.println(WarmUp1.sleepIn(false, false));
        System.out.println(WarmUp1.diff21(21));
        System.out.println(WarmUp1.nearHundred(93));
        System.out.println(missingChar("kitten", 1));
        System.out.println(backAround("cat"));
        System.out.println(WarmUp1.startHi("hi there"));
        System.out.println(WarmUp1.hasTeen(13,20,10));
        System.out.println(WarmUp1.mixStart("mix snacks"));
        System.out.println(WarmUp1.close10(-8,-13));
        System.out.println(WarmUp1.stringE("Hello"));
        System.out.println(WarmUp1.everyNth("Miracle", 2));
        System.out.println(WarmUp1.monkeyTrouble(true, true));
    }


}
