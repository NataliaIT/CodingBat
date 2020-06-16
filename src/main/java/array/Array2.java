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
}
