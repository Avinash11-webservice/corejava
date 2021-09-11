package StringHandling;

public class EqualsAndEqualsIgnoreCase {
public static void main(String args[]) {
		
		//equals() method example
		String s1="Java";
		String s2="Java";
		String s3="java";
		System.out.println(s1.equals(s2));// It returns true because s1 and s2 both strings are exactly same
		System.out.println(s1.equals(s3));//It returns false because equals()method follow case sensitivity 
		                                  //s1 and s3 are not same there is variation upper case and lower case
         
		//equalsIgnoreCase() method demo it will return true in both cases because it does not check case sensitivity.
		System.out.println(s1.equalsIgnoreCase(s2)); 
		System.out.println(s1.equalsIgnoreCase(s3));
		
	}

}


