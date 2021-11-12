package ua.com.alevel.level_1.treenode;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeRun {
    public void printTree(TreeNode root) {
        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);
        while (!level.isEmpty()) {
            TreeNode node = level.poll();
            System.out.print(node.val + " ");
            if (node.left != null)
                level.add(node.left);
            if (node.right != null)
                level.add(node.right);
        }
    }

    public void makeNode(BufferedReader reader, TreeNode tree, int level) throws IOException {
        String event = "";
        try {
            while (true) {
                System.out.println("Уровень дерева: " + level);
                if (tree.left == null)
                    System.out.println("- Нажмите 1 если хотите создать левый нод");
                else {
                    System.out.println("- Нажмите 1 если хотите пересоздать левый нод");
                    System.out.println("- Нажмите 3 если хотите перейти к левому ноду");
                }
                if (tree.right == null)
                    System.out.println("- Нажмите 2 если хотите создать правый нод");
                else {
                    System.out.println("- Нажмите 2 если хотите пересоздать правый нод");
                    System.out.println("- Нажмите 4 если хотите перейти к правому ноду");
                }
                System.out.println("- Нажмите 0 если вы хотите выйти назад");
                System.out.print("Введите действие: ");
                event = reader.readLine();
                switch (event) {
                    case "1" -> {
                        System.out.print("- Введите значение левого узла: ");
                        tree.left = new TreeNode(initTree(reader));
                        makeNode(reader, tree.left, level + 1);
                    }
                    case "2" -> {
                        System.out.print("- Введите значение правого узла: ");
                        tree.right = new TreeNode(initTree(reader));
                        makeNode(reader, tree.right, level + 1);
                    }
                    case "3" -> {
                        if (tree.left != null)
                            makeNode(reader, tree.left, level + 1);
                    }
                    case "4" -> {
                        if (tree.right != null)
                            makeNode(reader, tree.right, level + 1);
                    }
                    case "0" -> {
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int initTree(BufferedReader reader) throws IOException {
        try {
            int val = Integer.parseInt(reader.readLine());
            return val;
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не целое число! Значение нода остается равным 0");
            return 0;
        }
    }

    public void makeTree(BufferedReader reader, TreeNode tree) throws IOException {
        System.out.print("- Введите значение корневого узла: ");
        tree.val = initTree(reader);
        makeNode(reader, tree, 1);
        String event;
        try {
            while (true) {
                System.out.println("\nЭто корень дерева!");
                System.out.println("- Нажмите 1 что бы узнать его глубину");
                if (tree != null) {
                    System.out.println("- Нажмите 2 что бы перейти к дереву");
                    System.out.println("- Нажмите 3 что бы распечатать дерево");
                }
                System.out.println("- Нажмите 0 если вы хотите выйти");
                System.out.print("Введите действие: ");
                event = reader.readLine();
                switch (event) {
                    case "1" -> {
                        int deep = tree.maxDepth();
                        System.out.println("Глубина дерева: " + deep);
                    }
                    case "2" -> {
                        if (tree != null)
                            makeNode(reader, tree, 1);
                    }
                    case "3" -> {
                        printTree(tree);
                    }
                    case "0" -> {
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run(BufferedReader reader) throws IOException {
        TreeNode tree = new TreeNode(0);
        makeTree(reader, tree);
    }
}
