package Week2;

import java.util.Arrays;
public class Abc{
	public static void main(String[] args){
		if (args.length == 0){
			System.out.println("No arguments provided");
		} else {
			System.out.println(args.length);
		}
		
		int a = 0;
		while (a < args.length){
		System.out.println(args[a]);
		a++;
	}
	}
	

}