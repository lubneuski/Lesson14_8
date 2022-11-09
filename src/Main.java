import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    static Scanner scr= new Scanner(System.in);

    public static void main(String[] args)  {
        task1();
        task2();
        task3();
        scr.close();
    }

    private static void task1() {
        System.out.println("Задание 1. Написать программу для вывода на консоль названия дня недели по введенной дате.");

        int dd=2;       //день
        int mm=10;      //месяц от 0 до 11
        int yyyy=2022;  //год

        SimpleDateFormat form = new SimpleDateFormat("EEEE");
        Calendar calen = new GregorianCalendar(yyyy,mm,dd);
        System.out.println("   "+form.format(calen.getTime()));
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задание 2. Написать программу для вывода на экран дату следующего вторника.");

        int dd=1;       //день
        int mm=10;      //месяц от 0 до 11
        int yyyy=2022;  //год

        SimpleDateFormat form2 = new SimpleDateFormat("EEEE dd MMMM yyyy");
        Calendar calen2 = new GregorianCalendar(yyyy,mm,dd);
        int dow = 3 - calen2.get(Calendar.DAY_OF_WEEK);
        if(dow<=0){
            dow+=7;
        }
        calen2.add(Calendar.DAY_OF_WEEK,dow);
        System.out.println(form2.format(calen2.getTime()));
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задание 3. Создать обобщенный функциональный интерфейс. Написать класс с одним методом.\n" +
                "В этом методе реализуйте логику: - если в консоль введена цифра 1, то: \n" +
                "использования интерфейса со строковым типом и передать в метод интерфейса логику реверса строки(вывода строки в обратном порядке).");

        System.out.println("Введите число 1 для реверса строки:");
        String res ="Приветики, давай дружить!";
        try {
            if (scr.hasNextInt()){
            int t = scr.nextInt();
                if (t == 1) {
                    Revers rev = new Revers() {
                        @Override
                        public String rere(String str) {
                            return new StringBuilder(str).reverse().toString();
                        }
                    };
                    System.out.println(rev.rere(res));
                } else System.out.println("Введите число 1 в следующий раз.");
            }else{
                System.out.println("Введено не число");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}