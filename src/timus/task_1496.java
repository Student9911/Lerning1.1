package timus;


import java.util.HashSet;
import java.util.Scanner;

public class task_1496 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] submit = new String[n];
        int count;
        HashSet<String> spammers = new HashSet<>();
        for (int i = 0; i < submit.length; i++) {
            submit[i] = in.next();
            spammers.add(submit[i]);
        }

        for (String t : spammers) {
            count = 0;
            for (String s : submit) {
                if (t.equals(s)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(t);

            }

        }



    }
}


