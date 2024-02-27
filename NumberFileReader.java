//David Rosales drosales30@toromail.csudh.edu

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class NumberFileReader 
{
	private String name;
	
	public NumberFileReader(String name) throws IOException
	{
		setName(name);
		int[] fileArray = read();
		BubbleSort sort = new BubbleSort(fileArray, fileArray.length);
	}
	
	public int[] read() throws IOException
	{
		Scanner userFile = new Scanner(System.in);
		File fileName = new File(getName());
		
		if(!(fileName.exists()))
		{
			System.out.printf("Sorry but file %s does not exist.", fileName);
			System.exit(0);
		}
		
		Scanner readFile = new Scanner(fileName);
		int count = 0;
		int[] fileArray = new int [10];
		
		while(readFile.hasNextLine())
		{
			fileArray[count] =  Integer.parseInt(readFile.nextLine());
			count++;
		}
		return fileArray;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

}
