package ua.com.alevel;

import ua.com.alevel.level_1.countuniquevalue.CountUniqueValue;
import ua.com.alevel.level_1.knightmove.KnightMove;
import ua.com.alevel.level_1.squareoftriangle.SquareOfTriangle;
import ua.com.alevel.level_1.treenode.TreeNodeRun;
import ua.com.alevel.level_1.validbrackets.ValidBrackets;
import ua.com.alevel.level_1.treenode.TreeNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramRun {
    public static void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String event = "";
        try {
            while (true) {
                preview();
                System.out.print("Введите действие: ");
                event = reader.readLine();
                switch (event) {
                    case "1" -> {
                        new CountUniqueValue().run(reader);
                    }
                    case "2" -> {
                        new KnightMove().run(reader);
                    }
                    case "3" -> {
                        new SquareOfTriangle().run(reader);
                    }
                    case "4" -> {
                        new ValidBrackets().run(reader);
                    }
                    case "5" -> {
                        new TreeNodeRun().run(reader);
                    }
                    case "0" -> {
                        System.exit(0);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void preview() {
        System.out.println("Введите 1, если вам нужен уровень 1, задание 1 про подсчет уникальных чисел в массиве");
        System.out.println("Введите 2, если вам нужен уровень 1, задание 2 про ход коня");
        System.out.println("Введите 3, если вам нужен уровень 1, задание 3 про площадь треугольника");
        System.out.println("Введите 4, если вам нужен уровень 2, задание 1 про порядок скобок в строке");
        System.out.println("Введите 5, если вам нужен уровень 2, задание 2 про бинарное дерево");
        System.out.println("Введите 0, если вы хотите выйти");
    }
}
