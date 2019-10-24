package Week4;
import java.util.Arrays;
public class ArrayMinMax {
    public static void main(String[] args) {
        int[] numberList = {101, -100, 1,2,5,7,8,9,0,-2,100};
        int counter = 0;
        int minValue = numberList[counter];
        int maxValue = numberList[counter];

        for (int number : numberList){
            if (number < minValue){
                minValue = number;
            }
            if (number > maxValue){
                maxValue = number;
            }
            counter++;
        }
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}
