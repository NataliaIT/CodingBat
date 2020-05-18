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
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }


    /*

Given an array of ints length 3, return a new array with
the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
     */
    public int[] reverse3(int[] nums) {
        int[] newNums = new int[]{nums[2], nums[1], nums[0]};

        return newNums;
    }


    /*

Given 2 int arrays, a and b, each length 3,
return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     */


    public int[] middleWay(int[] a, int[] b) {
int[] result = new int[] {a[1],b[1]};
return result;
    }
}
