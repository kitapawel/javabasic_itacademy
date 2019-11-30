package Week8.homework;

import java.lang.reflect.Array;
import java.util.*;

public class StringAnalyzer {
    public static void main(String[] args) {
        String textToAnalyze = "This is a test text";
        System.out.println("Text to be analyzed: " + textToAnalyze);


        ArrayList<Character> charactersAL = new ArrayList<>();
        LinkedList<Character> charactersLL = new LinkedList<>();
        TreeSet<Character> charactersTS = new TreeSet<>();
        HashSet<Character> charactersHS = new HashSet<>();
        LinkedHashSet<Character> charactersLHS = new LinkedHashSet<>();
        HashMap<Character, Integer> characterHashMapHM = new HashMap();
        LinkedHashMap <Character, Integer> charactersLHM = new LinkedHashMap<>();

        for (Character c : textToAnalyze.toCharArray()){
            charactersAL.add(c);
            charactersLL.add(c);
            charactersTS.add(c);
            charactersHS.add(c);
            charactersLHS.add(c);
        }

        for (Integer i = 0; i < textToAnalyze.toCharArray().length; i++){
            char[] chars = textToAnalyze.toCharArray();
            characterHashMapHM.put(chars[i], i);
            charactersLHM.put(chars[i], i);
        }

        System.out.println("In ArrayList: " + charactersAL);
        System.out.println("In LinkedList: " + charactersLL);
        System.out.println("In TreeSet: " + charactersTS);
        System.out.println("In HashSet: " + charactersHS);
        System.out.println("In LinkedHashSet: " + charactersLHS);
        System.out.println("In LinkedHashMap: " + charactersLHM);
        System.out.println("In HashMap: " + characterHashMapHM);
        printCharWithFreq(textToAnalyze, textToAnalyze.length());
    }

    static void printCharWithFreq(String str, int n){

        // LinkedHashMap preserves the order in
        // which the input is supplied
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();

        // For every character of the input string
        for (int i = 0; i < n; i++) {

            // Get the frequency of the current character
            Integer j = lhm.get(str.charAt(i));

            // If the character is occurring
            // for the first time
            if (j == null)
                lhm.put(str.charAt(i), 1);

                // Increment the frequency of the
                // current character by 1
            else
                lhm.put(str.charAt(i), j + 1);
        }

        // Iterate over the LinkedHashMap
        // and print the result
        for (Character c : lhm.keySet())
            System.out.print("" + c + lhm.get(c) + " ");
    }


}
