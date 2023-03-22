public class FindFirstAndLastOccurenceOfArray {


    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] arr={-1,-1};
            if(nums.length==0){
                return arr;
            }
            if(target>nums[nums.length-1]){
                return arr;
            }
            if(target<nums[0]){
                return arr;
            }

            arr[0]=search(nums,target,true);
            arr[1]=search(nums,target,false);
            return arr;
        }
        // 5,7,7,8,8,10
        int search(int[] nums,int target,boolean findFirstOccurence){
            int start = 0;
            int end = nums.length - 1;
            int ans=-1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    ans=mid;
                    if(findFirstOccurence){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
            return ans;
        }


    }
}
