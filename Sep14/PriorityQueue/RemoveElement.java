package PriorityQueue;

	import java.util.PriorityQueue;
	  
	public class RemoveElement {
	    public static void main(String args[])
	    {
	        PriorityQueue<String> queue = new PriorityQueue<String>();
	        queue.add("Welcome");
	        queue.add("To");
	        queue.add("java");
	        queue.add("program");
	        queue.add("language");
	  
	        System.out.println("PriorityQueue: " + queue);
	  
	        queue.clear();
	  
	        System.out.println("The final Queue: " + queue);
	    }
	}


