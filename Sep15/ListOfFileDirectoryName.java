package io;

    import java.io.File;
	
    public class ListOfFileDirectoryName {
	     public static void main(String a[])
	     {
	        File file = new File("E:\\ExampleDirectory");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
	}


