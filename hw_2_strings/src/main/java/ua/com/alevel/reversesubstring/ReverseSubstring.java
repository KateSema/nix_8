package ua.com.alevel.reversesubstring;

import ua.com.alevel.reversestring.ReverseStringUtil;

import java.io.BufferedReader;
import java.io.IOException;

public class ReverseSubstring {
    public void run(BufferedReader reader) throws IOException {
        System.out.print("Введите строку: ");
        String str = reader.readLine();
        if (str.isEmpty())
            System.out.print("Вы ввели пустую строку");
        else {
            System.out.print("Введите подстроку: ");
            String substring = reader.readLine();
            if (substring.isEmpty())
                System.out.println("Вы ввели пустую подстроку");
            String reverseSubstring = ReverseStringUtil.reverse(str, substring);
            if (str.contains(substring))
                System.out.println("Результат: " + reverseSubstring);
            else
                System.out.println("Указаной подстроки нет в данной строке");
        }
    }
}
