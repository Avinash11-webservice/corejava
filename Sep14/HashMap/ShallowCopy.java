package HashMap;

	import java.util.*;

	public class ShallowCopy {
	   @SuppressWarnings("unchecked")
	public static void main(String args[]) {
	      HashMap<Integer, String> newmap1 = new HashMap<Integer, String>();
	      HashMap<Integer, String> newmap2 = new HashMap<Integer, String>();
	      newmap1.put(1, "welcome");
	      newmap1.put(2, "to coding");
	      newmap1.put(3, "world");
	      newmap2 = (HashMap<Integer, String>)newmap1.clone();

	      System.out.println("1st Map: " + newmap1);
	      System.out.println("Cloned 2nd Map: " + newmap2);   
	   }    
	}


