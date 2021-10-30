package ua.com.alevel.reversestring;

public class ReverseStringUtil {

    private static String reverseSrc(String src) {
        StringBuilder reversedSrc = new StringBuilder("");
        for (int i = src.length() - 1; i >= 0; i--)
            reversedSrc.append(src.charAt(i));
        return reversedSrc.toString();
    }

    public static String reverse(String src) {
        String[] arrWords = src.split(" ");
        StringBuilder reversedSrc = new StringBuilder("");
        for (String str : arrWords)
            reversedSrc.append(reverseSrc(str)).append(" ");
        return reversedSrc.substring(0, reversedSrc.length() - 1);
    }

    public static String reverse(String src, String dest) {
        int ind = src.indexOf(dest);
        if (ind >= 0) {
            String start = src.substring(0, ind);
            String substring = src.substring(ind, ind + dest.length());
            String end = src.substring(ind + dest.length());
            return start + reverseSrc(substring) + end;
        } else
            return src;
    }

    public static String reverse(String src, int firstIndex, int lastIndex) {
        if (firstIndex >= 0 && firstIndex <= lastIndex && lastIndex < src.length()) {
            String start = src.substring(0, firstIndex);
            String substring = src.substring(firstIndex, lastIndex + 1);
            String end = src.substring(lastIndex + 1);
            return start + reverse(substring) + end;
        } else
            return src;
    }
}
