package OPD;

import java.util.Scanner;

public class OPD_LR5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //создаем переменную и массивы для расчетов
        int size = 3;
        float[] mass1 = new float[size];
        float[] mass2 = new float[size];
        float[] mass3 = new float[size];
        float[] mass4 = new float[size];
        //заполняем массивы данными тестового расчета
        System.out.print("Введите статистику для одного экрана: ");
        for(int i=0;i<mass1.length;i++){
            mass1[i] = in.nextInt();
        }
        System.out.print("Введите статистику для одного обработчика событий: ");
        for(int i=0;i<mass2.length;i++){mass2[i] = in.nextInt();}
        System.out.print("Введите статистику для нового бизнес объекта: ");
        for(int i=0;i<mass3.length;i++){mass3[i] = in.nextInt();}
        System.out.print("Введите статистику для добавления нового бизнес метода: ");
        for(int i=0;i<mass4.length;i++){mass4[i] = in.nextInt();}
        //Ввод кол-ва работ тестового расчёта
        System.out.print("Введите количество экранов: ");
        float Kui = in.nextInt();
        System.out.print("Введите количество событий: ");
        float KAct = in.nextInt();
        System.out.print("Введите количество объектов: ");
        float Kbo = in.nextInt();
        System.out.print("Введите количество методов: ");
        float Kbm = in.nextInt();
        //Расчет оценки трудоемкости кодирования(средней)
        float Eui = (mass1[1] + (4*mass1[2]) + mass1[0])/6;
        float EAct = (mass2[1] + (4*mass2[2]) + mass2[0])/6;
        float Ebo = (mass3[1] + (4*mass3[2]) + mass3[0])/6;
        float Ebm = (mass4[1] + (4*mass4[2]) + mass4[0])/6;
        System.out.println("Eui = " + Eui);
        System.out.println("EAct = " + EAct);
        System.out.println("Ebo = " + Ebo);
        System.out.println("Ebm = " + Ebm);
        //Расчет среднеквадратичного отклонения
        float CKOui = (mass1[1] - mass1[0])/6;
        float CKOAct = (mass2[1] - mass2[0])/6;
        float CKObo = (mass3[1] - mass3[0])/6;
        float CKObm = (mass4[1] - mass4[0])/6;
        System.out.println("CKOui = " + CKOui);
        System.out.println("CKOAct = " + CKOAct);
        System.out.println("CKObo = " + CKObo);
        System.out.println("CKObm = " + CKObm);
        //Расчет суммарной трудоемкости проекта
        float E = (Kui * Eui) + (KAct * EAct) + (Kbo * Ebo) + (Kbm * Ebm);
        System.out.println("E = " + E);
        //Расчет среднеквадратичного отклонения для оценки суммарной трудоемкости кодирования
        float CK = (Kui * (CKOui * CKOui)) + (KAct * (CKOAct * CKOAct)) + (Kbo * (CKObo * CKObo)) + (Kbm * (CKObm * CKObm));
        double CKO = Math.sqrt(CK);
        System.out.println("CKO = " + CKO);
        //Расчет суммарной трудоемкость кодирования проекта
        float E95 = E + 2 * (float)CKO;
        System.out.println("E95 = " + E95);
        //Расчет относительной погрешности в оценке суммарной трудоемкости
        float d = ((float)CKO / E) * 100;
        System.out.println("d = " + d);
        //Расчет общей трудоемкость проекта
        float Esym = 4 * E95;
        System.out.println("Esym = " + Esym);
        //Пересчёт человеко-часов в человеко-месяцы
        float Nm = Esym / 132;
        System.out.println("Nm = " + Nm);
        //Считаем время выполнения графика для первой поставки
        float a = 1;
        float b = 3;
        float c = a / b;
        double x = Math.pow(Nm, c);
        double T = 2.5 * x;
        System.out.println("T = " + (float)T + " мес.");
        //Расчет средней численности команды
        float K = Nm / (float)T;
        System.out.println("K = " + K + " чел.");
    }
}

