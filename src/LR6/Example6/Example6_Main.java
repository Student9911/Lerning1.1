package LR6.Example6;

public class Example6_Main {

    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 3, 4, 5};
        int n = 7;


        for (int i = 0; i < Example6.array(ints, n).length; i++) {
            System.out.println(Example6.array(ints, n)[i]);
        }
    }
}
