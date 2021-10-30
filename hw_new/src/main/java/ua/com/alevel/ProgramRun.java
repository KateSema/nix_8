package ua.com.alevel;

//import ua.com.alevel.sumNumberFromStr.sumNumberFromStr;
//import ua.com.alevel.countCharsFromStr.countCharsFromStr;
//import ua.com.alevel.endOfLesson.endOfLesson;

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
                        //new sumNumberFromStr().run(reader);
                    }
                    break;
                    case "2": {
                        //new countCharsFromStr().run(reader);
                    }
                    break;
                    case "3": {
                        //new endOfLesson().run(reader);
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
        System.out.println("Если вам нужно задание 1 про , то введите 1");
        System.out.println("Если вам нужно задание 2 про , то введите 2");
        System.out.println("Если вам нужно задание 3 про , то введите 3");
        System.out.println("Если вы хотите выйти, нажмите 0");
    }
}
