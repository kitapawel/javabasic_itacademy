package Week2;

import java.util.Scanner;
import java.util.*;

public class HomeWork8{
	
	static boolean isPrime(int primeTestNumber)
	{
		if (primeTestNumber <= 1) {
			return false;
		}
		
		for (int i = 2; i < primeTestNumber; i++){
			if (primeTestNumber % i == 0){
				return false;
			}			
		}
		return true;
	}
	
	public static void main (String[] args){

	int numberToTest = 1;
	while (numberToTest < 101){
		if (isPrime(numberToTest)){
			System.out.println(numberToTest);
			} 
		numberToTest++;
		}		

	}
}