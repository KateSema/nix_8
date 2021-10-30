package ua.com.alevel.reversebyindexes;

import ua.com.alevel.reversestring.ReverseStringUtil;

import java.io.BufferedReader;
import java.io.IOException;


public class ReverseByIndexes {
    public void run(BufferedReader reader) throws IOException {
        System.out.print("Введите строку: ");
        String str = reader.readLine();
        if (str.isEmpty())
            System.out.print("Вы ввели пустую строку");
        else {
            System.out.print("Введите первый индекс: ");
            String firstIndexStr = reader.readLine();
            System.out.print("Введите второй индекс: ");
            String secondIndexStr = reader.readLine();
            if (firstIndexStr.matches("[-+]?\\d+") && secondIndexStr.matches("[-+]?\\d+")) {
                int firstIndex = Integer.parseInt(firstIndexStr);
                int secondIndex = Integer.parseInt(secondIndexStr);
                if (firstIndex < 0 || secondIndex >= str.length() || firstIndex > secondIndex)
                    System.out.println("Вы ввели индексы с ошибкой");
                else {
                    String reverseSubstring = ReverseStringUtil.reverse(str, firstIndex, secondIndex);
                    System.out.println("Результат: " + reverseSubstring);
                }
            } else
                System.out.println("Вы ввели индексы с ошибкой");
        }
    }
}
