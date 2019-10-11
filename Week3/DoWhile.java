import java.util.Arrays;
public class DoWhile{
	public static void main(String[] args){
		int[] tablica = new int[10];
		int i = 0;
		do {
			tablica[i] = i+1;
			i++;
		} while (i < tablica.length);
			
		System.out.print(Arrays.toString(tablica));
	}
}