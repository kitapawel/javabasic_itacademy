import java.util.Arrays;
public class ForLoop{
	public static void main(String[] args){
	/*	for (int i = 0; i<10; i++){
			System.out.println(i);
		} */
		
	/*	int i = 0; //we can take out statements from for loop, but we need to retain semicolons
		for (; i<10; ){
			System.out.println(i);
			i++
		}*/
		
		int[] tablica = new int[10];
		
		for (int i = 0; i < 10; i++){
			tablica[i] = i+1;
		}
		System.out.println (Arrays.toString(tablica));
		
		String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		for ( String weekendDay : weekDays){
			if (weekendDay == "Sat" || weekendDay == "Sun"){
				System.out.println(weekendDay);
			}
		}
		
		for (int i = 0; i < 10; i++){
			if (i%2 == 0){
				continue;
			}
			System.out.println(i);
		}
	} 
}