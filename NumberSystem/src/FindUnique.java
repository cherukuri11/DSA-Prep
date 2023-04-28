public class FindUnique {

    public static void main(String[] args) {
        int[]  arr={2,3,4,5,6,5,4,3,2};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int u=0;

        for(int i:arr){
            u^=i;
        }
        return u;
    }
}
