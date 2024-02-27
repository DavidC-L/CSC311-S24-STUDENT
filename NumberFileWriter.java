//David Rosales drosales30@toromail.csudh.edu

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class NumberFileWriter 
{
	private int[] printArray;
	private String name;
	
	public NumberFileWriter(int [] printArray, String name) throws IOException
	{
		setPrintArray(printArray);
		this.name = name;
		write();
	}
	
	public void write() throws IOException
	{
		
		String outputName = this.name;
		File outputFile = new File(outputName);
		PrintWriter outputFileWriter = new PrintWriter(outputFile);
		
		
		
			
		
			for(int i = 0; i < printArray.length - 1; i++)
			{
				outputFileWriter.printf("%d%n", printArray[i]);
			}
		
		outputFileWriter.close();
	}

	public int[] getPrintArray() 
	{
		return printArray;
	}

	public void setPrintArray(int[] printArray) 
	{
		this.printArray = printArray;
	}
}
