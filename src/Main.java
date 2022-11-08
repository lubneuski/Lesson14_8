import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();

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

}