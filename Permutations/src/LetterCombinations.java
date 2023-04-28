import java.lang.reflect.Array;
import java.util.ArrayList;

public class LetterCombinations {


    public static void main(String[] args) {

        //lc("","12");
        System.out.println(lcList("","12"));
        System.out.println(lcListCount("","12"));
    }

    static void lc(String p,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit=up.charAt(0) - '0';
        for(int i=(digit-1)*3;i < digit * 3;i++){

            char ch=(char)('a'+i);
            lc(p+ch,up.substring(1));

        }
    }

    static ArrayList<String> lcList(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> pavan=new ArrayList<>();
            pavan.add(p);
            return pavan;
        }

        int digit=up.charAt(0) - '0';
        ArrayList<String>  list=new ArrayList<>();
        for(int i=(digit-1)*3;i < digit * 3;i++){

            char ch=(char)('a'+i);
            list.addAll(lcList(p+ch,up.substring(1)));

        }
        return list;
    }


    static int lcListCount(String p, String up){

        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0) - '0';
        for(int i=(digit-1)*3;i < digit * 3;i++){
            char ch=(char)('a'+i);
            count=count+ lcListCount(p+ch,up.substring(1));

        }
        return count;
    }
}
