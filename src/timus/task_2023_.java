package timus;

import java.util.Scanner;

public class task_2023_ {

    public static void main(String[] args) {


        String[][] name = new String[][]{{"Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phoebus", "Ralph", "Robin"},
                {"Bambi", "Belle", "Bolt", "Mulan", "Movgli", "Mickey", "Silver", "Simba", "Stitch"},
                {"Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie"}};

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int curent_position = 0;
        int steps = 0;
        String a;


        for (int i = 0; i < n; i ++) {
            a = in.nextLine();
            for (int j =0; j < name.length; j ++) {
                for (int k = 0; k < 9; k ++) {
                    if (a.equals(name[k])) {
                        steps += Math.abs( - curent_position);
                        curent_position = j;
                    }

                }

            }

        }
        System.out.println(steps);




    }
}
