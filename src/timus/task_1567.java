package timus;

import java.util.Scanner;

public class task_1567 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int count = 0;
        char[] chars = text.toCharArray();
        char[] cost_1 = new char[]{'a', 'd', 'g', 'j', 'm', 'p', 's', 'v', 'y', '.', ' '};
        char[] cost_2 = new char[]{'b', 'e', 'h', 'k', 'n', 'q', 't', 'w', 'z', ','};
        char[] cost_3 = new char[]{'c', 'f', 'i', 'l', 'o', 'r', 'u', 'x', '!',};

        for (int i = 0; i < chars.length; i ++) {
            for (int j = 0; j < cost_1.length; j ++){
                if (chars[i] == cost_1[j]){
                    count +=1;
                }
            }

        }
        for (int i = 0; i < chars.length; i ++) {
            for (int j = 0; j < cost_2.length; j ++){
                if (chars[i] == cost_2[j]){
                    count += 2;
                }
            }

        }
        for (int i = 0; i < chars.length; i ++) {
            for (int j = 0; j < cost_3.length; j ++){
                if (chars[i] == cost_3[j]){
                    count += 3;
                }
            }

        }
        System.out.println(count);
    }
}
