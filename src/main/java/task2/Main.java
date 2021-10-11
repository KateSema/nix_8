package task2;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();

        String newStr = str.replaceAll("[^a-zA-ZёЁа-яА-Я]", "");
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = newStr.toCharArray();
        Arrays.sort(chars);
        for (char aChar : chars)
            if (!map.containsKey(aChar))
                map.put(aChar, 1);
            else
                map.put(aChar, map.get(aChar) + 1);

        List<Character> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        for (int i = 0; i < sortedKeys.size(); i++)
            System.out.println(i + 1 + ". " + sortedKeys.get(i) + " - " + map.get(sortedKeys.get(i)));
        String endProgram = in.nextLine();
    }
}