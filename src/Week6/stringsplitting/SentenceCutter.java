package Week6.stringsplitting;

public class SentenceCutter {
    public static void main(String[] args) {
        String stringToTest = "For given text find the longest and the shortest words";
        String[] strings = stringToTest.split(" ");

        String minValue = strings[0];
        String maxValue = strings[0];

//        for (String s : strings){
//            int a = s.length();
//            System.out.println("Element '" + s + "' is " + a + " characters long.");
//        }
        for (String s : strings){
            if (minValue.length() > s.length()){
                minValue = s;
            }
            if (maxValue.length() < s.length()){
                maxValue = s;
            }
            //System.out.println(minValue + ", " + maxValue);
        }
        System.out.println("===List of shortest and longest words in the input===");
        for (String s : strings){
            if (s.length() == minValue.length()){
                System.out.println(s);
            }
            else if (s.length() == maxValue.length()){
                System.out.println(s);
            }
        }

    }
}
