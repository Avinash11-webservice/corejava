package HashMap;

	import java.util.*;
	  
	public class TestAMap {
	    public static void main(String[] args)
	    {
	  
	        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	        hash_map.put(10, "my");
	        hash_map.put(15, "name is");
	        hash_map.put(20, "avinash");
	        hash_map.put(25, "kumar");
	        hash_map.put(30, "anand");
	        System.out.println("Initial Mappings are: " + hash_map);
	        System.out.println("Is the key '20' present? " + 
	        hash_map.containsKey(20));
	        System.out.println("Is the key '5' present? " + 
	        hash_map.containsKey(5));
	    }
	}


