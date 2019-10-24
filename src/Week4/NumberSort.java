package Week4;
public class NumberSort {
    public static void main(String[] args) {

        int[] numberArr = {8,3,5,8,3,9,11,2};

        int maxNumber = numberArr[0];
        int minNumber = numberArr[0];

        for (int i = 0; i < numberArr.length; i++){

            if (maxNumber < numberArr[i]){
                maxNumber = numberArr[i];
            }

            if (minNumber > numberArr[i]){
                minNumber = numberArr[i];
            }

        }

        System.out.println("Max number: "+ maxNumber);
        System.out.println("Min number: "+ minNumber);
    }
}
