package timus;

import java.util.Scanner;

public class task_1585 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String[] penguin = new String[]{"Emperor Penguin", "Little Penguin", "Macaroni Penguin"};
        int n = in.nextInt();
        int countEmperor = 0;
        int countLittle = 0;
        int countMacaroni = 0;
        String name;

        for (int i = 0; i <= n; i ++) {
            name = in.nextLine();
            if (name.equals(penguin[0])) {
                countEmperor ++;
            } else if (name.equals(penguin[1])) {
                countLittle ++;

            } else if (name.equals(penguin[2])){
                countMacaroni ++;
            }

        }
        if (countEmperor > countLittle & countEmperor > countMacaroni){
            System.out.println("Emperor Penguin");
        } else if (countLittle > countEmperor & countLittle > countMacaroni) {
            System.out.println("Little Penguin");

        } else if (countMacaroni > countEmperor & countMacaroni > countLittle){
            System.out.println("Macaroni Penguin");
        }
    }
}
