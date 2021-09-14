package HashMap;

	import java.util.*;
	  
	public class CountKeyValue {
	    public static void main(String[] args)
	    {
	  
	        Map<Integer, String> map = new HashMap<Integer, String>();
	        map.put(10, "my");
	        map.put(15, "name is");
	        map.put(20, "avinash");
	        map.put(25, "kumar");
	        map.put(30, "anand");
	        System.out.println("Initial Mappings are: " + map);
	        System.out.println("Is the key '20' present? " + map.containsKey(20));
	  	    System.out.println("Is the key '5' present? " + map.containsKey(5));
	    }
	}


