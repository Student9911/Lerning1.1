package LR9;

public class example_5 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        }catch (Exception e) {
            System.out.println("3 " + e);
        }
        System.out.println("2");
    }


}
