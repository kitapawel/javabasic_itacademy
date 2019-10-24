package Week1;
import java.util.Scanner;

public class BeerSong{
	public static void main(String[] arg){
		int beerNum = 99;
		String word = "bottles";
		
		System.out.println("How many bottles of beer do you want?");
		Scanner scanner = new Scanner(System.in);
		beerNum = scanner.nextInt();
		
		while (beerNum > 0){
			

			
			System.out.println(beerNum + " " + word + " of beer on the wall!");
			System.out.println(beerNum + " " + word + " of beer!");
			System.out.println("Take one down!");
			System.out.println("Pass it around!");
			beerNum = beerNum - 1;
			
			if (beerNum < 2){
				word = "bottle";
			}
			
			if (beerNum > 0){
			System.out.println(beerNum + " " + word + " of beer on the wall!");
			} else {
				System.out.println("No more bottles of beer on the wall!");
			}

		}		

	}
	
}