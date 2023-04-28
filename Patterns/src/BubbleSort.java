import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        //for every iteration largest element will come to the end
     int[]  arr={4,3,2,1,0};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr,int r, int c) {

        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSort(arr, r, c + 1);
        }
        else {
            bubbleSort(arr,r - 1, 0);
        }
    }






}
