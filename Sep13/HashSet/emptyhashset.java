package Hashset;

	import java.util.HashSet;
	  
	public class emptyhashset{
	    public static void main(String args[])
	    {
	        HashSet<String> set = new HashSet<String>();
	        set.add("Welcome");
	        set.add("To");
	        set.add("espire");
	        set.add("infolab");
	        System.out.println("HashSet: " + set);
	        set.clear();
	        System.out.println("The final set: " + set);
	    }
	}


