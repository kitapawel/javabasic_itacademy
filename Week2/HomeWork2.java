public class HomeWork2{
	public static void main (String[] args){
	
//	if (args.length < 1 && args.length > 1) {
	//	System.out.println("Incorrect number of arguments. Provide exactly 1 parameter: a color of traffic lights");
	//} else {
		switch (args[0].toLowerCase()){
			case "red":
			System.out.println("Red light! Do not drive.");
			break;
			case "orange":
			System.out.println("Orange light! Be careful.");
			break;
			case "green":
			System.out.println("Green light! You may drive.");
			break;
			default: 
			System.out.println("Incorrect traffic light color.");
			break;
		}
	//}
	
}
}