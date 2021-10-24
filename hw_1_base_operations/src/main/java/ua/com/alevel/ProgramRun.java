package ua.com.alevel;

import ua.com.alevel.sumNumberFromStr.SumNumberFromStr;
import ua.com.alevel.countCharsFromStr.CountCharsFromStr;
import ua.com.alevel.endOfLesson.EndOfLesson;

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
                        new SumNumberFromStr().run(reader);
                    }
                    break;
                    case "2": {
                        new CountCharsFromStr().run(reader);
                    }
                    break;
                    case "3": {
                        new EndOfLesson().run(reader);
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
        System.out.println("Если вам нужно задание 1 про сумму цифр в строке, то введите 1");
        System.out.println("Если вам нужно задание 2 про подсчет символов в строке, то введите 2");
        System.out.println("Если вам нужно задание 3 про время конца урока, то введите 3");
        System.out.println("Если вы хотите выйти, нажмите 0");
    }
}
