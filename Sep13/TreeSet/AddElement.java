package Treeset;

	import java.util.TreeSet;
	  
	public class AddElement {
	    public static void main(String args[])
	    {
	        TreeSet<String> tree = new TreeSet<String>();
	        tree.add("Welcome");
	        tree.add("To");
	        tree.add("our");
	        tree.add("espire");
	        tree.add("infolab");
	        tree.add("world");
	        System.out.println("TreeSet: " + tree);
	        TreeSet<String> tree_two = new TreeSet<String>();
	        tree_two.add("Hello");
	        tree_two.add("World");
	        tree.addAll(tree_two);
	        System.out.println("TreeSet: " + tree);
	    }
	}


