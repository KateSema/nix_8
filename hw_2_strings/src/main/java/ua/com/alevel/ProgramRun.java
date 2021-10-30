package ua.com.alevel;

import ua.com.alevel.simplerevers.SimpleRevers;
import ua.com.alevel.reversesubstring.ReverseSubstring;
import ua.com.alevel.reversebyindexes.ReverseByIndexes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramRun {
    public static void run() {
        preview();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String event = "";
        try {
            while (true) {
                System.out.print("Введите действие: ");
                event = reader.readLine();
                switch (event) {
                    case "1": {
                        new SimpleRevers().run(reader);
                    }
                    break;
                    case "2": {
                        new ReverseSubstring().run(reader);
                    }
                    break;
                    case "3": {
                        new ReverseByIndexes().run(reader);
                    }
                    break;
                    case "0": {
                        System.exit(0);
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void preview() {
        System.out.println("Если вам нужно задание 1 про обычный реверс строки, то введите 1");
        System.out.println("Если вам нужно задание 2 про реверс подстроки, то введите 2");
        System.out.println("Если вам нужно задание 3 про реверс по индексу, то введите 3");
        System.out.println("Если вы хотите выйти, нажмите 0");
    }
}
