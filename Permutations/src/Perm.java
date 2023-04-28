import java.util.ArrayList;

public class Perm {

    public static void main(String[] args) {
   //permutations("","abcd");
        //ArrayList<String>  ans=permutationsList("","abcd");
        //System.out.println(ans);

        System.out.println(permutationsCount("","abcd"));
    }

    static void permutations(String p,String arr){

        if(arr.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=arr.charAt(0);
        for(int i=0;i<=p.length();i++){

            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,arr.substring(1));
        }
    }


    static ArrayList<String> permutationsList(String p,String arr){

        if(arr.isEmpty()){
            ArrayList<String>   pavan=new ArrayList<>();
            pavan.add(p);
            return pavan;
        }

        char ch=arr.charAt(0);

        ArrayList<String>  ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){

            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationsList(f+ch+s,arr.substring(1)));
        }

        return ans;
    }


    static int permutationsCount(String p,String arr){

        if(arr.isEmpty()){
            return 1;
        }

        char ch=arr.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){

            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+permutationsCount(f+ch+s,arr.substring(1));
        }

        return count;
    }
}
