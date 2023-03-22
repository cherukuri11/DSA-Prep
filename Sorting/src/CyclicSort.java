import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr={1,3,5,7,2,4,6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[]  arr){

        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
            
        }
    }

     static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
