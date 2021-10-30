package ua.com.alevel.simplerevers;

import ua.com.alevel.reversestring.ReverseStringUtil;

import java.io.BufferedReader;
import java.io.IOException;

public class SimpleRevers {
    public void run(BufferedReader reader) throws IOException {
        System.out.print("Введите строку: ");
        String str = reader.readLine();
        String reverseString = ReverseStringUtil.reverse(str);
        System.out.println(reverseString);
    }
}
