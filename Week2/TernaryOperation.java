public class TernaryOperation{
	public static void main(String args[]){
		boolean condition = true;
		int test = !condition ? 5 : 500;		 // test = if condition is false pick the value after colon
		System.out.println(test);
		test = condition ? 5 : 500;
		System.out.println(test);
		
		int a = 2;
		int b = 1;
		int c = b < a ? 100:200;
		System.out.println(c);
	}
}