package LR5.Example1;

 class Example1 {
  // Создание закрытого символьного поля
  private char simbol;
  //один открытый метод позволяет присвоить значение полю.
  public void Set(char simbol1) {
   simbol = simbol1;
  }
  //Еще один метод при вызове
  // возвращает результатом код символа.
  public int getCodeSymbol() {
   return (int) simbol;
  }
  //Третий метод позволяет вывести
  //в консольное окно символ (значение поля) и его код.
  public void viewCode() {
   System.out.println("символ (значение поля) = " + simbol + " " +
           "и его код " + getCodeSymbol());
  }
 }
