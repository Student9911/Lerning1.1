package LR7.Example3;

public class SupClass3_1 {

    //в первом суперклассе есть открытое целочисленное поле
    public int int1;
    //метод с одним параметром для присваивания значения полю
    public void setInt1(int int1) {
        this.int1 = int1;
    }
    //конструктор с одним параметром
    SupClass3_1(int int1){

        setInt1(int1);
    }
    //Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса и значениями всех полей объекта.
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " int 1 = " + this.getInt1();
        return ClassNameAndFieldValue;
    }
    public int getInt1() {
        return int1;
    }
}
