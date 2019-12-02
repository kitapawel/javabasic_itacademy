package Week8.homework;

import java.util.HashMap;
import java.util.Map;

public class StringAnalyzerLetterCounter {
    public static void main(String[] args) {
        String textToAnalyze = "This is a test text";
        System.out.println("Text to be analyzed: " + textToAnalyze);
        printLetterCount(textToAnalyze);
        //TODO make versions with JAVA 8 funcstions and a lambda

    }

    private static void printLetterCount(String text){

        char[] chars = text.toCharArray();
        Map<Character, Integer> lettersWithCount = new HashMap<>();

        for (char aChar : chars){
            if (lettersWithCount.get(aChar)==null){
                lettersWithCount.put(aChar, 1);
            } else {
                int increment = lettersWithCount.get(aChar) +1;
                lettersWithCount.put(aChar, increment);
            }
        }
        System.out.println(lettersWithCount);
    }
}
