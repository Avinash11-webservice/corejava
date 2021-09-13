package Linklist;

	import java.util.*;
	  
	public class insertlastandfirst {
	    public static void main(String args[])
	    {
	        LinkedList<String>
	            linkedList = new LinkedList<String>();
	        linkedList.add("v");
	        linkedList.add("i");
	        linkedList.add("n");
	        linkedList.add("a");
	        linkedList.add("s");
	        System.out.println("Linked list: "+ linkedList);
	        linkedList.addFirst("A");
	        linkedList.addLast("h");
	        System.out.println("Updated Linked list: "+ linkedList);
	    }
	}


