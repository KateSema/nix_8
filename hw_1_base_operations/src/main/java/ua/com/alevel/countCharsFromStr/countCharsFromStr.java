package ua.com.alevel.countCharsFromStr;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class countCharsFromStr {
    public void run(BufferedReader reader) throws IOException {
        System.out.print("Введите урок: ");
        String str = reader.readLine();
        String parseStr = str.replaceAll("[^a-zA-ZёЁа-яА-Я]", "");
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = parseStr.toCharArray();
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
    }
}