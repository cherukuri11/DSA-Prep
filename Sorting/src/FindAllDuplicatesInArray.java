import java.util.ArrayList;
import java.util.List;

class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        List<Integer> numbers=new ArrayList<>();
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
            
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                 numbers.add(arr[index]);
            }
        }
  return numbers;
    }

     static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    
}
    