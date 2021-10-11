package task1;

import java.util.Scanner;

public class Main {
    public static int summa(int n) {
        return (n < 1) ? n : n % 10 + summa(n / 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String num = str.replaceAll("[^0-9]", "");
        if (num.equals(""))
            System.out.println("В данной строке нет цифр");
        else {
            int value1 = Integer.parseInt(num);
            int value3 = summa(value1);
            System.out.println(value3);
        }
        String endProgram = in.nextLine();
    }
}


