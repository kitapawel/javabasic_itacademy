package Week4;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numberArr = {8,3,5,-8,3,9,11,2};
        boolean isSorted = true;
        int i = 0;
        do {
            isSorted = true;
            for (int j = 1; j < numberArr.length - i; j++){
                if (numberArr[j-1] > numberArr[j]){
                    int tmp = numberArr[j-1];
                    numberArr[j-1] = numberArr[j];
                    numberArr[j] = tmp;
                    isSorted = false;
                }

            }
            i++;
        }
        while (!isSorted);



        System.out.println(Arrays.toString(numberArr));
    }
}
