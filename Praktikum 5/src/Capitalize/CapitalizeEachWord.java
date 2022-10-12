package Capitalize;

public class CapitalizeEachWord {
    public static String capitalizeWord(String str) {
        String[] words = str.split("\\s");
        StringBuilder capitalizeWord = new StringBuilder();
        for (String w : words) {
            w = w.substring(0,1).toUpperCase() + w.substring(1,w.length());
            capitalizeWord.append(w + " ");
        }
        return capitalizeWord.toString().trim();
    }
}