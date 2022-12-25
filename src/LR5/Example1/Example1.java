package LR5.Example1;

 class Example1 {

  private char simbol;

  public void Set(char simbol1) {
   this.simbol = simbol1;
  }

  public int getCodeSymbol() {
   return (int) simbol;
  }

  public void viewCode() {
   System.out.println("символ (значение поля) = " + simbol + " " +
           "и его код " + getCodeSymbol());
  }
 }
