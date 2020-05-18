package array;

public class Array1 {

/*
Given an array of ints, return true if 6 appears as either the first
or last element in the array. The array will be length 1 or more.


firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */

    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6) || (nums[nums.length - 1] == 6);
    }

    /*

Given 2 arrays of ints, a and b, return true if they have the same
first element or they have the same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
     */

    public boolean commonEnd(int[] a, int[] b) {
        return a[0]==b[0] || a[a.length-1]==b[b.length-1];
    }


}
