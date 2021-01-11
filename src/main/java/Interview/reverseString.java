package Interview;

public class reverseString {
	public static void main(String[] args) {
		
		System.out.println("String program ");
		String given="rajat";
		char abc[]=given.toCharArray();
		System.out.println("Given string ="+given);
		System.out.println("output");
		for (int i = abc.length-1; i <= abc.length; i--) {
		System.out.print(abc[i]);
			
		}
		
		
		
	}

}
