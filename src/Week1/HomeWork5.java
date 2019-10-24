package Week1;
import java.util.Scanner;

public class HomeWork5{
	public static void main(String[] args){
		float floatNumber[] = new float[12];
		for (int i = 0; i < floatNumber.length; i++) {
			Scanner scanner = new Scanner(System.in);
			float a = scanner.nextFloat();
			floatNumber[i] = a;
			System.out.println("Variable no. " + (i+1) + " = " + floatNumber[i]);
        }		
		
		float result = floatNumber[0] * (floatNumber[1] - (floatNumber[2]/floatNumber[3]) + (floatNumber[4]/floatNumber[5]) - (floatNumber[6]/floatNumber[7]) + (floatNumber[8]/floatNumber[9]) - (floatNumber[10]/floatNumber[11]));
		System.out.println("Operation result: " + result);
		System.out.println("Two decimal digits:");
		System.out.printf("%.2f", result);
		System.out.println();
		System.out.println("Three decimal digits:");
		System.out.printf("%.3f", result);
	}
}