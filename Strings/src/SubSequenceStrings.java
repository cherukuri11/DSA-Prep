import java.util.ArrayList;
import java.util.Arrays;


public class SubSequenceStrings {



    public static void main(String[] args) {
        //subSequence("abc","");
        //System.out.println((subSequenceList("abc","")));
        subSequenceAscii("abc","");

    }

    static void subSequence(String arr,String processed){

        if(arr.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=arr.charAt(0);
        subSequence(arr.substring(1),processed+ch);
        subSequence(arr.substring(1),processed);


    }
    static ArrayList<String> subSequenceList(String arr, String  processed){

        if(arr.isEmpty()){
            ArrayList<String>   pavan=new ArrayList<>();
            pavan.add(processed);
            return pavan;
        }

        char ch=arr.charAt(0);
         ArrayList<String> left=subSequenceList(arr.substring(1),processed+ch);
        ArrayList<String> right=subSequenceList(arr.substring(1),processed);

        left.addAll(right);

        return left;


    }


    static void subSequenceAscii(String arr,String processed){

        if(arr.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=arr.charAt(0);
        subSequence(arr.substring(1),processed+ch);
        subSequence(arr.substring(1),processed);
        subSequence(arr.substring(1),processed+(ch+0));


    }
}
