package LR5.Example2;

import java.util.Set;

class Example2 {
     // класс, у которого есть два символьных поля и метод.
     private char simbol1, simbol2;

     public void Set(char simbol1, char simbol2) {
         this.simbol1 = simbol1;
         this.simbol2 = simbol2;

     }

    public void showCharArray() {
         if (simbol2 > simbol1) {
             for (int i = simbol1; i <= (int) simbol2; i ++) {
                 System.out.println("'" + (char) i + "'");
             }
         }else {
             for (int i = simbol2; i <= (int) simbol1; i++) {
                 System.out.println("'" + (char) i + "'");
             }
         }
    }
}
