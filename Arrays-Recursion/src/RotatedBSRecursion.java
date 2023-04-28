public class RotatedBSRecursion {

    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,2,4,0};
        System.out.println(rotatedBS(arr,8,0,arr.length-1));
    }

    private static int rotatedBS(int[] arr, int target, int start, int end) {

        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)return mid;
        if(arr[start]<=arr[mid]){

            if(target>=arr[start] && target <= arr[mid]){
                rotatedBS(arr,target,start,mid-1);
            }
            else{
                rotatedBS(arr,target,mid+1,end);
            }
        }

        if(target>=arr[mid] && target<=arr[end]){
            return rotatedBS(arr,target,mid+1,end);
        }
        return rotatedBS(arr,target,start,mid-1);



    }
}
