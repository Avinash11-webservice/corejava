package StringHandling;

public class trimmethod {
public static void main(String args[]) {
		
		String s=" Hi how are you    ";
		//trim()method demo
		System.out.println("Before trim method : "+s+"\nLenght : "+s.length());// without trim() method
			
		s=s.trim();
		System.out.println("After trim method : "+s+"\nLenght : "+s.length());//after use of with trim() method
		
	}

}


