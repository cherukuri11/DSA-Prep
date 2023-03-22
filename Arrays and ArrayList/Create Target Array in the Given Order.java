/*  Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid. */


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int length=nums.length;
        int[] result=new int[length];
        for(int i=0;i<length;i++){
            if(i==index[i]) result[i]=nums[i];
            else{

                int min=Math.min(i,index[i]);
                int max=Math.max(i,index[i]);
                for(int j=max;j>min;j--){
                    //int tmp=result[j];
                    result[j]=result[j-1];
                }
                result[min]=nums[i];
            }
        }
        return result;
    }
}