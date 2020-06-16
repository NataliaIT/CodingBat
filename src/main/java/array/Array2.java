package array;

public class Array2 {

    /*
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
     */

    public int countEvens(int[] nums) {
        int count =0;
        for(int n : nums){
            if(n%2==0){
                count++;
            }
        }
        return count;
    }

    /*
    Return the sum of the numbers in the array, returning 0 for an empty array.
    Except the number 13 is very unlucky, so it does not count and numbers that
    come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6

     */

    public int sum13(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length;){
            if(nums[i]==13){
                i+=2;
            }
            else{
                sum=sum+nums[i];
                i++;
            }
        }
        return sum;
    }

    /*

Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
     */

    public boolean lucky13(int[] nums) {
        for(int n:nums){
            if(n==1 || n==3)
                return false;
        }
        return true;

    }


    /*

Given a number n, create and return a new int array of length n,
containing the numbers 0, 1, 2, ... n-1. The given n may be 0,
in which case just return a length 0 array. You do not need
a separate if-statement for the length-0 case; the for-loop
should naturally execute 0 times in that case, so it just works.
The syntax to make a new int array is: new int[desired_length]
(See also: FizzBuzz Code)


fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     */

    public int[] fizzArray(int n) {
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=i;
        }
        return nums;
    }


    /*

Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
     */

    public boolean no14(int[] nums) {
        boolean containsNo1=true, containsNo4=true;
        for (int i : nums) {
            if(i==1) containsNo1 = false;
            if(i==4) containsNo4 = false;

        }
        return containsNo1 || containsNo4;
    }
}
