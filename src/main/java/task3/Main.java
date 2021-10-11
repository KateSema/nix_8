package task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите урок: ");
        int lesson = Integer.parseInt(in.nextLine());
        SimpleDateFormat formater = new SimpleDateFormat("HH:mm");
        Calendar time = Calendar.getInstance();
        time.set(0, 0, 1, 9, 0, 0);
        int add = 45 * lesson + 5 * (lesson / 2) + 15 * ((lesson - 1) / 2);
        time.add(Calendar.MINUTE, add);
        System.out.println("Урок закончится в " + formater.format(time.getTime()));
        String endProgram = in.nextLine();
    }
}

//      1  9.00-9.45 -5-      9.00 + 1*45         +0*5 +0*15
//      2  9.50-10.35  -15-   9.00 + 2*45 + 5     +1*5 +0*15
//      3  10.50-11.35 -5-    9.00 + 3*45 + 20    +1*5 +1*15
//      4  11.40-12.25  -15-  9.00 + 4*45 + 25    +2*5 +1*15
//      5  12.40-13.25 -5-    9.00 + 5*45 + 40    +2*5 +2*15
//      6  13.30-14.15  -15-  9.00 + 6*45 + 45    +3*5 +2*15
//      7  14.30-15.15 -5-    9.00 + 7*45 + 60    +3*5 +3*15
//      8  15.20-16.05  -15-  9.00 + 8*45 + 65    +4*5 +3*15
//      9  16.20-17.05 -5-    9.00 + 9*45 + 80    +4*5 +4*15
//      10 17.10-17.55  -15-  9.00 +10*45 + 85    +5*5 +4*15