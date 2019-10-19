package Week2;

import java.util.Collection;
import java.util.Collections;
import java.util.*;
import java.util.Arrays;

public class HomeWork6{
	
	//public static void reverse(List listToReverse) 
	
	public static void main (String[] args){
	
	List<Integer> numbersToAdd = new ArrayList<Integer>();
	int counter = 0;
	
	for (String string: args){
		numbersToAdd.add(Integer.parseInt(string));
	}
	
	for (int number: numbersToAdd){
		counter = counter + number;
	}
	
	System.out.println(counter);

	}
}