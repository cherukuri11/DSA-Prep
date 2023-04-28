import java.util.Arrays;

public class MergeSortRecursion {

    public static void main(String[] args) {

        int[] arr={8,3,4,12,5,6};
        System.out.println(Arrays.toString(merge(arr)));
    }

    private static int[] merge(int[] arr) {

        if(arr.length==1)return arr;

        int mid=arr.length/2;
        // outer bound is exclusive
        int[]  left=merge(Arrays.copyOfRange(arr,0,mid));
        int[]  right=merge(Arrays.copyOfRange(arr,mid,arr.length));
        
        
        return mergeSort(left,right);


    }

    private static int[] mergeSort(int[] left, int[] right) {

        int[]  mix=new int[left.length+right.length];

        int i=0,j=0,k=0;
        while(i<left.length && j< right.length){

            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }

        while(i< left.length){
            mix[k]=left[i];
            i++;
            k++;
        }

        while(j< right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;
    }
}
