package io;

	import java.io.File;
	public class FileExistInDirectory {
	   public static void main(String[] args) {
	      try {
	         File file = new File("demo1.txt");
	         file.createNewFile();
	         System.out.println("Is directory? " + file.isDirectory());
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	   }
	}


