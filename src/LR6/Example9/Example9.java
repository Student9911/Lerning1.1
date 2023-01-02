package LR6.Example9;

class Example9 {

    static void chars(char... ch1) {
        char[] ch2 = new char[ch1.length];
        System.out.println("Массив до смены символов " +
                "местами");
        int j = (ch1.length - 1);
        for (int i = 0; i < ch1.length; i++, j--) {
            System.out.print( i + "[" + ch1[i] + "] ");
            ch2[j] = ch1[i];

        }
        System.out.println("\nМассив после смены символов " +
                "местами");
        for (int i = 0; i < ch2.length; i++) {
            System.out.print( i + "[" + ch2[i] + "] ");
        }
    }
}




/*9. Напишите программу со статическим методом, аргументом которому передается одномерный
символьный массив. В результате вызова метода элементы массива попарно меняются местами:
первый — с последним, второй — с предпоследним и так далее.*/
