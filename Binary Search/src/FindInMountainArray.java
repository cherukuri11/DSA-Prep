//public class FindInMountainArray {
//
//    /**
//     * // This is MountainArray's API interface.
//     * // You should not implement it, or speculate about its implementation
//     * interface MountainArray {
//     *     public int get(int index) {}
//     *     public int length() {}
//     * }
//     */
//
//    class Solution {
//
//        //public MountainArray()
//        public int findInMountainArray(int target, MountainArray mountainArr) {
//
//            //     int start=0;
//            //     int end=mountainArr.length()-1;
//            //     int ans=-1;
//
//            //     while (start <= end) {
//            //     int mid = start + (end - start) / 2;
//
//            //     if ( mountainArr.get(mid)>target) {
//            //         end = mid-1;
//            //     } else if(mountainArr.get(mid)<target)  {
//            //         start=mid+1;
//            //     }else{
//            //         ans=mid;
//            //         end=mid-1;
//            //     }
//            // }
//            //     return ans;
//
//            // int ans=-1;
//            //         if(mountainArr.length()==0){
//            //             return ans;
//            //         }
//            //         // if(target>nums[nums.length-1]){
//            //         //     return arr;
//            //         // }
//            //         // if(target<nums[0]){
//            //         //     return arr;
//            //         // }
//
//            //         int num1=search(mountainArr,target,true);
//            //         int num2=search(mountainArr,target,false);
//            //         if(num1 != -1 && num2 != -1){
//            //          return num1>num2 ? num2: num1;
//            //         }
//            //         return -1;
//            //     }
//            //     // 5,7,7,8,8,10
//            //     int search(MountainArray mountainArr,int target,boolean findFirstOccurence){
//            //         int start = 0;
//            //         int end = mountainArr.length() - 1;
//            //         int ans=-1;
//
//            //         while (start <= end) {
//            //             int mid = start + (end - start) / 2;
//
//            //             if (target < mountainArr.get(mid)) {
//            //                 end = mid - 1;
//            //             } else if (target > mountainArr.get(mid)) {
//            //                 start = mid + 1;
//            //             } else {
//            //                 ans=mid;
//            //                 if(findFirstOccurence){
//            //                     end=mid-1;
//            //                 }else{
//            //                     start=mid+1;
//            //                 }
//            //             }
//            //         }
//            //         return ans;
//
//            int peak=peakIndexInMountainArray( mountainArr);
//            int firstTry=orderAgnostic( mountainArr,target,0,peak);
//            if(firstTry != -1){
//                return firstTry;
//            }
//            return orderAgnostic( mountainArr,target,peak+1,mountainArr.length()-1);
//        }
//        public int peakIndexInMountainArray(MountainArray mountainArr) {
//            int start=0;
//            int end=mountainArr.length()-1;
//
//            while (start < end) {
//                int mid = start + (end - start) / 2;
//
//                if ( mountainArr.get(mid)>mountainArr.get(mid+1)) {
//                    end = mid;
//                } else  {
//                    start=mid+1;
//                }
//            }
//            return start;
//        }
//
//        static int orderAgnostic(MountainArray mountainArr , int target,int start,int end) {
//            // int start = 0;
//            // int end = arr.length - 1;
//            boolean isAsc = mountainArr.get(start) < mountainArr.get(end) ;
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//
//                if (mountainArr.get(mid) == target) {
//                    return mid;
//                }
//
//                if (isAsc) {
//                    if (target < mountainArr.get(mid)) {
//                        end = mid - 1;
//                    } else if (target > mountainArr.get(mid)) {
//                        start = mid + 1;
//                    }
//                } else {
//                    if (target > mountainArr.get(mid)) {
//                        end = mid - 1;
//                    } else if (target < mountainArr.get(mid)) {
//                        start = mid + 1;
//                    }
//                }
//            }
//            return -1;
//        }
//
//
//
//    }
//
//}
