public class CountOfZeroes {


    public static void main(String[] args) {


        System.out.println(count(5000 ));
    }

    private static int count(int i) {

        return helper(i,0);
    }

    private static int helper(int i, int count) {

        if(i==0)return count;
        if(i%10==0){
            return helper(i/10,count+1);
        }
        return helper(i/10,count);
    }
}
