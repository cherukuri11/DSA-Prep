import java.util.ArrayList;

public class ReturningAListRecursion {


    public static void main(String[] args) {
        int[]   arr={1,2,5,6,9,9,0};
        int index=0;
        ArrayList<Integer> pavan=new ArrayList<>();
        System.out.println(searchArrayListWithoutListAsParameter(arr,9,index));
        //System.out.println(searchArrayList(arr,9,index,pavan));
    }

    private static ArrayList<Integer> searchArrayList(int[] arr, int target,int index,ArrayList<Integer> list) {

        if(index==arr.length)return list;
        if(target==arr[index])list.add(index);
        return searchArrayList(arr,target,index+1,list);
    }


    private static ArrayList<Integer> searchArrayListWithoutListAsParameter(int[] arr, int target,int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)return list;
        if(target==arr[index])list.add(index);
        ArrayList<Integer> list1=searchArrayListWithoutListAsParameter(arr,target,index+1);
        list.addAll(list1);
        return list;
    }
}
