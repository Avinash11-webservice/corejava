package io;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class ReadFileContent
	{

	   public static void main(String[] args) throws IOException 
	   {
	      File f=new File("output.txt");  
	      FileWriter fw=new FileWriter(f); 
	      fw.write("Welcome to Java Session \n"); 
	      fw.write("Session 1 is core java");
	      fw.flush();
	      fw.close();
	   }
	}


