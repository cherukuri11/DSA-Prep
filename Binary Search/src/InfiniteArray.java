public class InfiniteArray {

     static int ans(int[]  arr, int target){
         int start=0;
         int end=1;
         //breaking condition
         while(target>arr[end]){
             int temp=end+1;
             end=end+(end-start+1); //bpx of the previos array i.e 2 size;
             start=temp;
         }
          return binarySearch(arr,target,start,end);
     }


    static int binarySearch(int[] arr, int target,int start,int end) {

        //int start = 0;
        //int end = arr.length - 1;

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
