import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllDisappearedNumbers {

    public static void main(String[] args) {
        int[]  nums={1,2,4,5,6,2};
        List numbers=findDisappearedNumbers(nums);
        System.out.println(numbers);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }

        }
        List<Integer> str = new ArrayList<>();
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
               str.add(k+1);
            }
        }
        return str;
    }
}