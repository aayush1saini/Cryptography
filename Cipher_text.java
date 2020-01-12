import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.Scanner;
public class FH_exp {

	public static void main(String[] args)throws Exception{  // main throws IO exception
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\name\\Documents\\a.txt"); // get path of input file
		String original_string="";  // Initialize original string
		
		try {
			
			Scanner sc= new Scanner(file); // scan file
			while(sc.hasNextLine())        // read till file has lines
			{
				original_string+=sc.nextLine();  // get data from file into a string
				
			}
			sc.close(); // close Scanner resource
		}
		
	finally {
	   	int min=1, max=10;						 
		System.out.println("ORIGINAL TEXT  "+original_string);
		
		int random =ThreadLocalRandom.current().nextInt(min,max); // getting a random number
		
		String final_string="";                          // initialize final string
		for(byte i=0;i<original_string.length();i++)
		{
			final_string+=(char)((char)original_string.charAt(i)+random);  // encryption logic
		}
		
		System.out.println("CIPHER TEXT  "+final_string);
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\name\\Documents\\b.txt")); // writing output into a text file
	    writer.write(final_string);
	    writer.close(); // close BufferedWriter resource
		
	
	}
		
		

}
}
