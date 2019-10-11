import java.util.Arrays;
public class ArraysApp{
	public static void main(String args[]){
		int[][] ints = {{3,4,5,6},{1,2,3,4}};
		
		System.out.println(Arrays.toString(ints[0]));
		System.out.println(Arrays.toString(ints[1]));
		System.out.println(ints.length); // checks the dimension number of the array (number of array)
		System.out.println(ints[0].length); //checks the numbers of fields in the [0] subarray
		System.out.println(ints[1].length);
		System.out.println(args[0]); //prints the list of args passed as arguments while executing the application e.g. java ArraysApp TEXT TEXT2 TEXT3
		
	}
}