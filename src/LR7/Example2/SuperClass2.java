package LR7.Example2;

public class SuperClass2 {

    //приватным текстовым полем.
    private String str1;
    SuperClass2() {
        setStr1();
    }
    //Объект суперкласса создается передачей одного текстового аргумента конструктору.
    SuperClass2(String str1){
        setStr1(str1);
    }
    //метод для присваивания значения полю без параметров
    public void setStr1 () {
        this.str1 = "здесь ничего нет";
    }
    //метод для присваивания значения полю с одним текстовым параметром
    public void setStr1 (String str1) {
        this.str1 = str1;
    }

    public String getStr1(){
        //Возвращает значение Str1;
        return str1;
    }
    //Доступное только для чтения свойство результатом возвращает длину текстовой строки.
    public int getStr1length() {
        return str1.length();
    }
    //@Override - аннотация указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
    @Override
    public String toString() {
        String SuperClassNameAndFieldValue = "superClassTest {" + " str1 =\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\" }";
        return SuperClassNameAndFieldValue;
    }
}
