package LR6.Example4;
public class Example4 {
    static int result;
    //это рекурсивный метод

         static int fact(int n) {
            System.out.println("*" + n);
            if (n == 1) return 1;
            if (n == 2) return 2;
            result = fact (n - 2) * n;
            return result;
        }
        //это метод без рекурсии
         static int fact2(int n) {
            result = n;
            int j = n;
             System.out.println();
            for(int i = n; i > 2; i = i - 2) {
                System.out.println("*" + j);
                j = j - 2;
                result *= j;
            }
            return result;
         }


}

/*4. Напишите программу, в которой описан статический метод для вычисления двойного факториала числа,
переданного аргументом методу. По определению, двойной факториал числа п (обозначается как n!!) —
это произведение через одно всех чисел, не больших числа n. То есть n!! = п * (n - 2) * (п - 4)* ...
(последний множитель равен 1 для нечетного п и равен 2 для четного n).
Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.*/
