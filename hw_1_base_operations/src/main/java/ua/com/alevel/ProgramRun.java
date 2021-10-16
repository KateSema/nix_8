package ua.com.alevel;

import ua.com.alevel.sumNumberFromStr.sumNumberFromStr;
import ua.com.alevel.countCharsFromStr.countCharsFromStr;
import ua.com.alevel.endOfLesson.endOfLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramRun {
    public static void run() {
        preview();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String event;
        try {
            while ((event = reader.readLine()) != null) {
                switch (event) {
                    case "1": {
                        new sumNumberFromStr().run(reader);
                    }
                    break;
                    case "2": {
                        new countCharsFromStr().run(reader);
                    }
                    break;
                    case "3": {
                        new endOfLesson().run(reader);
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
        System.out.println("if you need first task, please select 1");
        System.out.println("if you need second task, please select 2");
        System.out.println("if you need third task, please select 3");
        System.out.println("if you need exit task, please select 0");
        System.out.println("Select you event:");
        System.out.println();
    }
}
