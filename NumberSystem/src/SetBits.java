public class SetBits {

    public static void main(String[] args) {
        System.out.println(1^2 );
        int n=282;

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {

        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
