package ua.com.alevel.simplerevers;

import java.io.BufferedReader;
import java.io.IOException;

public class SimpleClass {
    public void run(BufferedReader reader) throws IOException {
        System.out.print("Введите строку: ");
        String str = reader.readLine();
    }
}
