public class main{
    public static void main(String[] args){


        int[]  ros ; //declaration of array, gets into stack
        ros=new int[5];  //initialisation: actually here obj is being intialized into heap memory

        //return the index

        static int binarySearch(int[] arr, int target){
            int start=0;
            int end=arr.length-1;

            while(start<=end){
                int mid=start +(end-start)/2;

                if(target<mid){
                    end=mid-1;
                }else if(target>mid){
                    start=mid+1;
                }else{
                    return mid
                }
            }
            return -1;
        }


    }
}
