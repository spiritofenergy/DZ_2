import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1. Если 5 в 15 степени больше миллиарда, вывести - «Степень это мощь. Power
        //is a power.»
        double value = Math.pow(5, 15);
        if (value > 1000000000) {
            System.out.println("5 в 15 степени + " + value + " Степень это мощь. Power is a power.!");
        }
        //2. Задайте переменную. Если она больше 0, вывести «позитив», если меньше 0,
        //вывести «отрицательно»
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("Позитив");
        } else {
            System.out.println("Отрицательно");
        }
        // 3. Если квадратный корень из 15 миллионов меньше 5 тысяч, вывести - «два
        //измерения лучше, чем одно»
        if (Math.sqrt(1500000) < 5000) {
            System.out.println("«два измерения лучше, чем одно");
        } else {
            System.out.println("!");
        }
        // 4. Если 2 в 10 степени меньше 512 вывести - «Pentium 2», иначе вывести -
        //«ARM»
        if (Math.pow(2, 10) < 512) {
            System.out.println("Pentium 2");
        } else {
            System.out.println("ARM");
        }

        // 5. Задать две дробных переменных. Вывести наибольшую из них.
        double a = 4.5;
        double b = 5.5;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        // 6. Задать две переменных - first и second. Вывести first в степени second, second в
        // степени first
        double first = 3;
        double second = 5;
        System.out.println(Math.pow(first, second));
        System.out.println(Math.pow(second, first));

        // 7. Задать две переменных - икс и игрек. Вывести, что больше - икс в степени
        //игрек, или наоборот.

        double x1 = Math.pow(23, 34);
        double y1 = Math.pow(34, 23);
        if (x1 > y1) {
            System.out.println("x1 в степени y1 больше чем y1 в степени x1 " + x1 + " > " + y1);
        } else {
            System.out.println(y1);
        }

        // 8. Вывести числа от 1 до 100
        for (int z = 1; z <= 100; z++) {
            System.out.println(z);
        }
        // 9. Вывести числа от 50 до 10
        for (int i = 50; i <= 100; i++) {
            System.out.println("Строка №" + i);
        }
        // 11. Вывести числа от 0 до -100
        for (int h = 0; h >= -100; h--) {
            System.out.println(h);
        }
        // 12. Задать строковую переменную. Заменить в ней все буквы о на «обро»
        String test = "условие проверяется после первого выполнения цикла";
        String[] strArray = new String[]{test};
        System.out.println(strArray[0]);
        System.out.println(strArray[0].replace("о", "обро"));

        // 3. Задать строковую переменную. Вывести ее в верхнем регистре
        String value3 = "Привет";
        System.out.println(value3.toUpperCase());

        // 14. Задать строковую переменную. Заменить в ней буквы а на @, а буквы о на 0.
        String value4 = "Древние китайцы сравнивали ноги человека с корнями дерева.";
        System.out.println(value4.replace("а", "@") + value4.replace("о", "0"));

        // 15. Задать две строковых переменных. Найти, какая из них длиннее.
        //(Используйте .length() )
        String value5 = "дерево";
        String value6 = "человек";
        if (value5.length() > value6.length()) {
            System.out.println("Длиннее - " + value5);
        } else {
            System.out.println("Длиннее - " + value6);
        }

        // 16. Задать три переменных, найти наибольшую из них
        String value7 = "ноги";
        if (value5.length() > value6.length() && value5.length() > value7.length()) {
            System.out.println("Длиннее - " + value5);
        } else if (value6.length() > value5.length() && value6.length() > value7.length()) {
            System.out.println("Длиннее - " + value6);
        } else if (value7.length() > value6.length() && value7.length() > value5.length()) {
            System.out.println("Длиннее - " + value7);
        }

        //  16. Задать три переменных, найти наибольшую из них
        int a11 = 11;
        int a22 = 27;
        int a33 = 7;
        int[] stringArray = {a11, a22, a33};
        int max = stringArray[0];
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] > max)
                max = stringArray[i];
        }
        System.out.println("max = " + max);
    }
}











