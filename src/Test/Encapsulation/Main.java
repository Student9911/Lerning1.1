package Test.Encapsulation;

public class Main   {

    public static void main(String[] args) {

        Robot robot = new Robot(2, 3);

        robot.move(0, 5);
        System.out.println("move № 2");
        robot.move(5, 10);


    }


}
