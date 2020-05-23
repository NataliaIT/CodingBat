package functional;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {

    /*
Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
     */
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }


    /*
Given a list of strings, return a list of the strings,
omitting any string that contains a "z".
(Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
     */

    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    /*
Given a list of strings, return a list where each string has "y"
added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.


noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
     */

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(n->n+"y")
                .filter(n->!n.contains("yy"))
                .collect(Collectors.toList());
    }
}
