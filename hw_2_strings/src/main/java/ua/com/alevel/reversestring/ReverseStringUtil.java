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
        return reversedSrc.toString();
    }

    public static String reverse(String src, String dest) {
        String[] arrWords = src.split(" ");
        StringBuilder reversedSrc = new StringBuilder("");
        for (String str : arrWords)
            reversedSrc.append(reverseSrc(str)).append(" ");
        return reversedSrc.toString();
    }

//    public static String reverse(String src, int firstIndex, int lastIndex){
//
//    }
}
