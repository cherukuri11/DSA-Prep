class MissingNumber {

    //  static void swap(int[] arr, int i, int correct) {
    //     int temp=arr[i];
    //     arr[i]=arr[correct];
    //     arr[correct]=temp;
    // }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return total - sum;
    }


        // int i=0;
        // while(i<arr.length){
        //     int correct=arr[i];
        //     if(arr[i]<arr.length && arr[i]!=arr[correct]){
        //         swap(arr,i,correct);
        //     }else{
        //         i++;
        //     }
            
        // }

        // for(int index=0;index<arr.length;index++){

        //     if(arr[index]!=index){
        //         return index;
        //     }
        // }
        // return arr.length;


        
}