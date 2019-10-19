package Week2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class HomeWork5{
	
	//public static void reverse(List listToReverse) 
	
	public static void main (String[] args){
		List<String> list = Arrays.asList(args);
		Collections.reverse(list);
		//System.out.println(list);
			
		for (String string: list){
			System.out.println(string);
		}	
			
		}
}