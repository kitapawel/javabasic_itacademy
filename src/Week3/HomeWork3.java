package Week3;

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class HomeWork3{
	public static void main(String[] arg){

		double[] numberSet = new double[5];
		int counter = 0;
		double sum = 0;
		
		for (double number : numberSet){
			
			numberSet[counter] = Math.random();
			counter++;
			//Random rd = new Random(); 
			//number = rd.nextDouble();

			
		}
		
		for (double number : numberSet){
			System.out.println(number);
			sum += number;			
		}
		
		System.out.println("Suma wszystkich liczb: " + sum);
		System.out.println("Średnia z sumy wszystkich liczb: " + sum/5);
		
		
		
	}
}