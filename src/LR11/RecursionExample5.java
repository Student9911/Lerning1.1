package LR11;

public class RecursionExample5 {

    public static void main(String[] args) {
        System.out.println(fact(20));
    }

    public static int fact(int n) {
        int result;
        if (n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;

        } else {
            result = fact(n - 2) + fact(n - 1);
            return result;

        }


    }
}
