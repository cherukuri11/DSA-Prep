import java.util.Arrays;

public class MergeSortInPlace {


    public static void main(String[] args) {

        int[] arr={8,3,4,12,5,6};
        merge(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void  merge(int[] arr,int start,int end) {

        if(end-start ==1)return ;

        int mid=start+(end-start)/2;
        merge(arr,start,mid);
        merge(arr,mid,end);


         mergeSort(arr,start,mid,end);


    }

    private static void mergeSort(int[] arr, int s,int m,int e) {

        int[]  mix=new int[e-s];

        int i=s,j=m,k=0;
        while(i<m && j< e){

            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i< m){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while(j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for( int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}
