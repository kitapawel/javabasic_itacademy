import java.util.Scanner;

public class HomeWork1{
	public static void main (String[] args){
		Scanner scanPrice = new Scanner(System.in);
		float itemPrice = scanPrice.nextFloat();
		Scanner userAge = new Scanner(System.in);
		int age = userAge.nextInt();

		
		if (age < 6){
			System.out.println("Discounted price is: "+ (itemPrice * .2f));
		}	else if (age >= 6 & age <= 18){
			System.out.println("Discounted price is: "+ (itemPrice * .75f));
		} else if (age > 65) {
			System.out.println("Discounted price is: "+ (itemPrice * .7f));
		} else {
			System.out.println("No discount applied, price is: "+ itemPrice);
		}
	}
}