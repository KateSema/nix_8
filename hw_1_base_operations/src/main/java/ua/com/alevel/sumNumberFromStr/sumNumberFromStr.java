package ua.com.alevel.sumNumberFromStr;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class sumNumberFromStr {
    public static int summa(int n) {
        return (n < 1) ? n : n % 10 + summa(n / 10);
    }

    public void run(BufferedReader reader) throws IOException {
        System.out.println("Введите строку: ");
        String str = reader.readLine();
        String num = str.replaceAll("[^0-9]", "");
        if (num.equals(""))
            System.out.println("В данной строке нет цифр");
        else {
            int value1 = Integer.parseInt(num);
            int value3 = summa(value1);
            System.out.println(value3);
        }
    }
}
