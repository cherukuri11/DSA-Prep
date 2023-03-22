public class Recursion {


    public static void main(String[] args) {

        print1(1);
    }

     static void print1(int i) {

        if(i==5) {
            System.out.println(i);
            return;
        }
        print1(i+1);
         System.out.println(i);
    }
}
