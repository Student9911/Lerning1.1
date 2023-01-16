package LR7.Example3;

public class SubClass3_3 extends SubClass3_2 {

    SubClass3_3(int int1) {
        super(int1);
    }
    //В третьем классе появляется открытое текстовое ноле
    public String str2;
    //метод с тремя аргументами для присваивания значений полям (перегрузка метода из суперкласса)
    public void setInt1Str1Str2(int int1, char char1, String str2) {
        super.int1 = int1;
        super.char1 = char1;
        this.str2 = str2;
    }
    //конструктор с тремя параметрами
    SubClass3_3(int int1, char char1, String str2) {
        super(int1,char1);
        setInt1Str1Str2(int1, char1, str2);
    }

    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getStr2();
        return super.toString()+ThirdFieldValue;
    }
    public String getStr2() {
        return str2;
    }
}
