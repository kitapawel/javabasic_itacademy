package Week3;

import java.util.Arrays;
public class HomeWork2{
	public static void main(String[] arg){
		
		System.out.println("For loop output: ");
		if (arg.length > 0){
					for (int i = 0; i < arg.length; i++){
						System.out.println(arg[i]);
					}
		} else {
			System.out.println("For loop output empty.");
		}
		System.out.println();
		System.out.println("For each loop output: ");
		if (arg.length > 0){
					for (String argument : arg){
						System.out.println(argument);
					}
		} else {
			System.out.println("For each loop output empty.");
		}

	}
}