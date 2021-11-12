package ua.com.alevel.level_1.validbrackets;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidBrackets {

    private static boolean isValidBrackets(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        Deque<Character> stack = new LinkedList<>();
        for (char c : input.toCharArray()) {
            if (brackets.containsValue(c)) {
                // одна из открывающих скобок
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                // одна из закрывающих скобок
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    System.out.println("Скобки закрыты ошибочно");
                    return false;
                }
            }
        }
        // в конце стек должен быть пустым
        System.out.println("Скобки закрыты верно");
        return stack.isEmpty();
    }

    public void run(BufferedReader reader) throws IOException {
        System.out.print("Введите строку со скобками: ");
        String str = reader.readLine();
        boolean check = isValidBrackets(str);
    }
}
