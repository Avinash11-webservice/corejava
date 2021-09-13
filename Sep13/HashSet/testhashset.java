package Hashset;

	import java.util.LinkedHashSet;
	 
	public class testhashset {
	    public static void main(String args[])
	    {
	        LinkedHashSet<String> set = new LinkedHashSet<String>();
	        set.add("Welcome");
	        set.add("To");
	        set.add("project");
	        set.add("of");
	        set.add("infolab");
	        System.out.println("LinkedHashSet: " + set);
	        System.out.println("Is the set empty: " + set.isEmpty());
	        set.clear();
	        System.out.println("Is the set empty: " + set.isEmpty());
	    }
	}


