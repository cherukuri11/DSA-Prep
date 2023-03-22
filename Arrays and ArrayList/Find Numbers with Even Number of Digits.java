/*Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
*/


class Solution {
    public int findNumbers(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int len = (int) (Math.log10(nums[i]) + 1);
            if(len%2==0){
                sum++;
            }
        }
        return sum;
    }
}