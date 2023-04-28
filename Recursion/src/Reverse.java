public class Reverse {


    public static void main(String[] args) {


        System.out.println(rev(1234));
    }

    private static int rev(int i) {

        //we need to know the digits

        int digits=(int)(Math.log10(i))+1;

        return helper(i,digits);


    }

    private static int helper(int i, int digits) {

        if(i%10==i)return i;

        return (i%10)*(int)(Math.pow(10,digits-1)) + helper(i/10,digits-1);
    }
}
