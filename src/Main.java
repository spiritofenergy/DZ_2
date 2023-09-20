import java.util.Scanner;

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
    }
}