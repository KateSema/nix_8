package ua.com.alevel.level_1.squareoftriangle;

import java.io.BufferedReader;
import java.io.IOException;

public class SquareOfTriangle {


    private static boolean ToDouble(String str) {
        try {
            double D = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            System.out.println("Вы ввели число с ошибкой");
            return false;
        }
        return true;
    }

    private double Square(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs(0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)));
    }

    public void run(BufferedReader reader) throws IOException {
        String[] mass = {"x1", "y1", "x2", "y2", "x3", "y3"};
        Double[] dots = new Double[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Введите " + mass[i] + " : ");
            String d = reader.readLine();
            if (ToDouble(d))
                dots[i] = Double.parseDouble(d);
            else
                return;
        }
        double S = Square(dots[0], dots[1], dots[2], dots[3], dots[4], dots[5]);
        System.out.println("Площадь треугольника = " + S);
    }
}
