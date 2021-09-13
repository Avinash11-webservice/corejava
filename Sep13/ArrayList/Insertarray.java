package Arraylist;
	import java.util.Scanner;
	 
	public class Insertarray {
	public static void main(String args[]){
	int a[] = {1,5,9,6,10,14}, position, element;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Original Array:");
	for(int i : a) {
	System.out.print(i + " ");
	}
	System.out.println("\n\nEnter element to insert:");
	element = sc.nextInt();
	System.out.println("Enter position of element:");
	position = sc.nextInt();
	int b[] = new int[a.length + 1];
	System.arraycopy(a, 0, b, 0, position - 1);
	b[position - 1] = element;
	System.arraycopy(a, position - 1, b, position, a.length - position + 1);
	System.out.println("\nArray After Insertion:");
	for(int i : b) {
	System.out.print(i + " ");
	}
	}
	}


