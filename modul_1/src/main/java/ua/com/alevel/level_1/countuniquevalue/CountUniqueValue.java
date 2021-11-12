package ua.com.alevel.level_1.countuniquevalue;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountUniqueValue {
    public void run(BufferedReader reader) throws IOException {
        System.out.print("Введите массив чисел: ");
        String strNum = reader.readLine();
        HashSet<String> setNum = new HashSet<>(Arrays.asList(strNum.replace(" ", "").split("")));

        System.out.println(setNum.size());
        System.out.println(setNum);



    }
}
