package Week3;

public class HomeWork4{
	public static void main(String[] arg){
		
		System.out.println("toCharArray method: ");
		for (String parameter : arg){
			char[] charArray = parameter.toCharArray();
			for (char character : charArray){
				System.out.println(character);
			}
		}
		
		System.out.println("charAtIndex method: ");	
		for (String parameter : arg){
			
			int wordLength = parameter.length();
			for (int i = 0; i < wordLength; i++){
				System.out.println(parameter.charAt(i));
			}
		}
	}
}

// Test gita