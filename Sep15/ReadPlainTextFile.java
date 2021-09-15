package io;

	import java.io.*;
	public class ReadPlainTextFile
	{
	  public static void main(String[] args)throws Exception
	  {
	 
	  File file = new File("E:\\Users\\Avinash\\Desktop\\user");
	  
	  @SuppressWarnings("resource")
	BufferedReader br = new BufferedReader(new FileReader(file));
	  
	  String st;
	  while ((st = br.readLine()) != null)
	    System.out.println(st);
	  }
	}


