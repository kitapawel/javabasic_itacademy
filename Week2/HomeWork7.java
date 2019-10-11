import java.util.Scanner;
import java.util.*;

public class HomeWork7{
	
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
		Scanner numberScanner = new Scanner(System.in);
		int integerToTest = numberScanner.nextInt();
		
		if (isPrime(integerToTest)){
			System.out.println ("true");
		} else {
			System.out.println ("false");
		}		
	}

}