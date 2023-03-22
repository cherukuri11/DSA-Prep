public class SearchInRotatedSortedArray {

    class Solution {
        public int search(int[] nums, int target) {


            int k = pivot(nums);

            if (k == -1) {
                return binarySearch(nums, target, 0, nums.length - 1);
            }

            if (nums[k] == target) {
                return k;
            }
            if (target >= nums[0]) {
                return binarySearch(nums, target, 0, k - 1);
            }
            return binarySearch(nums, target, k + 1, nums.length - 1);
        }


        public int pivot(int[] nums) {

            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {

                int mid = start + ((end - start) / 2);
                if (mid < end && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (mid > start && nums[mid] < nums[mid - 1]) {
                    return mid - 1;
                } else if (nums[mid] <= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

        public int binarySearch(int[] arr, int target, int start, int end) {

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
}
