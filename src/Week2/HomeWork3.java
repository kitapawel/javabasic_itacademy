package Week2;

import java.util.Arrays;

public class HomeWork3{
	public static void main(String[] args){
		int[] numbers = new int[10];
		int numberToAdd = 1;
			
		while (numberToAdd < 11){
			numbers[numberToAdd - 1] = numberToAdd;
			numberToAdd++;
		}
		
		for (int number: numbers){
				System.out.println(number);
		}

	}
}