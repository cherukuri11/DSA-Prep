static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;


        boolean isAsc=arr[start]<arr[end];


        while(start<=end){
        int mid=start +(end-start)/2;

        if(arr[mid]==target){
        return mid;}
        }
        if(asc){
        if(target<arr[mid]){
        end=mid-1;
        }else if(target>arr[mid]){
        start=mid+1;
        }
        }
        }else{
        if(target>arr[mid]){
        end=mid-1;
        }else if(target<arr[mid]){
        start=mid+1;
        }
        }
        }
        return -1;
        }