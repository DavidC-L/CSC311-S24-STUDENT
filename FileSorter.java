//David Rosales drosales30@toromail.csudh.edu

import java.io.IOException;
import java.util.Scanner;

public class FileSorter {

	public static void main(String[] args) throws IOException
	{
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter the file name you wish the program to read: ");
			String name = userInput.nextLine();
			NumberFileReader readUserFiles = new NumberFileReader(name);

	}

}
