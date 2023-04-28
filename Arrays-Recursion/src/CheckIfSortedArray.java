public class CheckIfSortedArray {


    public static void main(String[] args) {
        //assumption no duplicates
        int[]   arr={1,2,5,6,9};
        System.out.println(sorted(arr,0));
    }

    private static boolean sorted(int[] arr, int i) {

        if(i==arr.length-1)return true;

        return (arr[i]<arr[i+1] && sorted(arr,i+1));
    }
}
