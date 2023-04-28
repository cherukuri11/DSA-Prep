public class Factorial {

    public static void main(String[] args) {


        System.out.println(fact(5));
        System.out.println(sum(5));
    }

    private static int fact(int i) {

        if(i==0){
            return 1;
        }
        return i*fact(i-1);
    }


    private static int sum(int i) {

        if(i==1 ){
            return 1;
        }
        return i+sum(i-1);
    }
}
