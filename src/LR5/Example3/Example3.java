package LR5.Example3;

 class Example3 {

      int a;
      int b;

     //конструктор позволяющий создавать объекты без передачи аргументов
     Example3() {
         System.out.println("\nKoнcтpyиpoвaниe объекта Example3 без передачи аргументов \n");
     }
     //конструктор позволяющий создавать объекты с передачей одного аргумента
     Example3(int num1){
         System.out.println("Koнcтpyиpoвaниe объекта Example3 с передачей одного аргумента");
         a = num1;
         System.out.println("переданный аргумент " + a);
    }
     //конструктор позволяющий создавать объекты с передачей двух аргументов
     Example3(int num1, int num2) {
         System.out.println("Koнcтpyиpoвaниe объекта Example3 с передачей двух аргументов");
         a = num1;
         b = num2;
         System.out.println("переданные аргументы " + a + " " + b);
     }

}
