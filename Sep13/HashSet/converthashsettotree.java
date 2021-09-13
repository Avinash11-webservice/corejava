package Hashset;

	import java.util.HashSet;
	import java.util.Set;
	import java.util.TreeSet;
	  
	public class converthashsettotree {
	  
	    public static void main(String[] args)
	    {
	        Set<String> setobj = new HashSet<>();
	        setobj.add("Welcome");
	        setobj.add("To");
	        setobj.add("our");
	        setobj.add("espire");
	        setobj.add("infolab");
	  
	        System.out.println("HashSet: "+ setobj);
	        Set<String> hashSetToTreeSet = new TreeSet<>(setobj);
	        System.out.println("TreeSet: "+ hashSetToTreeSet);
	    }
	}


