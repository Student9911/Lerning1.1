package LR7.Example3;

public class SubClass3_2 extends SupClass3_1 {

    SubClass3_2(int int1) {
        super(int1);
    }
    //Во втором классе появляется открытое символьное поле
    public char char1;
    //метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса)
    public void setInt1Str1(int int1, char char1) {
        super.int1 = int1;
        this.char1 = char1;
    }
    //конструктор с двумя параметрами
    SubClass3_2(int int1, char char1) {
        super(int1);
        setInt1Str1(int1, char1);
    }
    public char getChar1() {
        return char1;
    }
    @Override
    public String toString() {
        String SecondFieldValue =
                "\n str 1 = " + this.getChar1();
        return super.toString() + SecondFieldValue;
    }



}
