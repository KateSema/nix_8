package ua.com.alevel.level_1.knightmove;

import java.io.BufferedReader;
import java.io.IOException;

public class KnightMove {

    private char covertToChar(int N) {
        int startASCII = 'A';
        return (char) (startASCII + N);
    }

    private int covertToInt(char C) {
        int startASCII = 'A';
        return (int) C - startASCII;
    }

    private void head(int pudding, int x) {
        System.out.print("   ");
        for (int i = x - pudding; i <= x + pudding; i++)
            System.out.print(("| " + i + "   ").substring(0, 5));
        System.out.println("|");
        line(pudding);
    }

    private void line(int pudding) {
        System.out.print("---");
        for (int j = 0; j <= 2 * pudding; j++)
            System.out.print("-----");
        System.out.println("-");

    }

    private void field(int pudding, int y) {
        for (int i = y - pudding; i <= y + pudding; i++) {
            System.out.print(("" + covertToChar(i) + "   ").substring(0, 3));
            for (int j = y - pudding; j <= y + pudding; j++)
                if (i == y && j == y)
                    System.out.print("| KN ");
                else
                    System.out.print("|    ");
            System.out.println("|");
            line(pudding);
        }
    }

    private void printMap(int x, int y) {
        int pudding = 3;
        head(pudding, x);
        field(pudding, y);
    }

    private void checkStep(int x1, int y1, int x2, int y2) {
        int deltaX = Math.abs(x1 - x2);
        int deltaY = Math.abs(y1 - y2);
        if (x2 > 0 && x2 < (int) 'Z' - ((int) 'A')) {
            if ((deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2))
                System.out.println("Возможно поместить коня в точку " + covertToChar(x2) + " " + y2);
            else
                System.out.println("Нельзя поместить коня сюда");
        } else {
            System.out.println("Вы введи координату не правильно");
            System.out.println("" + x2 + " " + y2);
        }
    }

    public void run(BufferedReader reader) throws IOException {
        int Xstart = 3;
        int Ystart = 3;
        printMap(Xstart, Ystart);
        System.out.print("Введите строку для ходьбы: ");
        String rowStr = reader.readLine();
        System.out.print("Введите столбец для ходьбы: ");
        String colStr = reader.readLine();
        int row = covertToInt(rowStr.toUpperCase().charAt(0));
        int col = Integer.parseInt(colStr);
//        System.out.println("row=" + row + " col=" + col);
        checkStep(Xstart, Ystart, row, col);

//        char letter = covertToChar(num);
//        System.out.println(letter);
//        System.out.println(covertToInt(letter));


    }
}
