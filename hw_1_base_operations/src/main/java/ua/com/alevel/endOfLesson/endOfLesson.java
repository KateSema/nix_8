package ua.com.alevel.endOfLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class endOfLesson {
    public void run(BufferedReader reader) throws IOException {
        System.out.print("Введите урок: ");
        int lesson = Integer.parseInt(reader.readLine());
        if (lesson > 10)
            System.out.println("Больше 10 уроков в день не предусмотрено");
        if (lesson < 1)
            System.out.println("Отричательное значение урока не бывает");
        if (lesson >= 1 && lesson <= 10) {
            SimpleDateFormat formater = new SimpleDateFormat("HH:mm");
            Calendar time = Calendar.getInstance();
            time.set(0, Calendar.JANUARY, 1, 9, 0, 0);
            int add = 45 * lesson + 5 * (lesson / 2) + 15 * ((lesson - 1) / 2);
            time.add(Calendar.MINUTE, add);
            System.out.println("Урок закончится в " + formater.format(time.getTime()));
        }
    }
}
