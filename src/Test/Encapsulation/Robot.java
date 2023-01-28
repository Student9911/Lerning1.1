package Test.Encapsulation;

public class Robot {

    private int x;
    private int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {

        this.x = print(this.x, x, 'x');
        this.y = print(this.y, y, 'y');


    }

    private int print(int start, int end, char axisName) {
        while (start < end) {
            System.out.println("move on " + axisName + " from " + start + " to " + (++start));

        }
        return start;
    }
}
