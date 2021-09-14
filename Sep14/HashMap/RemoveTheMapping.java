package HashMap;

	import java.util.*;
	 
	public class RemoveTheMapping  {
	public static void main(String[] args) {
	    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	 
	    hash_map.put(10, "my");
	    hash_map.put(15, "name is");
	    hash_map.put(20, "avinash");
	    hash_map.put(25, "kumar");
	    hash_map.put(30, "anand");
	    System.out.println("Initial Mappings are: " + hash_map);
	    String returned_value = (String)hash_map.remove(20);
	    System.out.println("Returned value is: "+ returned_value);
	    System.out.println("New map is: "+ hash_map);
	}
	}


