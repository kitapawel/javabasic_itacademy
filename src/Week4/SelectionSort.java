package Week4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 4, -1,3, 1, 2};
        int n = numbers.length;

        for (int i = 0; i < n - 1; i ++)
        {
            int minIndex = i;
            for (int j = i +1; j < n; j++){
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

}

