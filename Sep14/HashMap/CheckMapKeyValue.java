package HashMap;

	import java.util.*;

	public class CheckMapKeyValue {
	   public static void main(String args[]) {
	      HashMap<Integer, String> newmap = new HashMap<Integer, String>();
	      newmap.put(1, "my");
	      newmap.put(2, "college");
	      newmap.put(3, "is best");
	      boolean val = newmap.isEmpty();
	      System.out.println("Is hash map empty: " + val);
	   }    
	}


