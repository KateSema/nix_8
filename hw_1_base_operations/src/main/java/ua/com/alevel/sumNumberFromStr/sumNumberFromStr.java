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
        String numbers = str.replaceAll("[^0-9]", "");
        if (numbers.equals(""))
            System.out.println("В данной строке нет цифр");
        else {
            char[] massNumbers = numbers.toCharArray();
            int result = 0;
            for (char number : massNumbers)
                result += Integer.parseInt(String.valueOf(number));
            System.out.println(result);
        }
    }
}
