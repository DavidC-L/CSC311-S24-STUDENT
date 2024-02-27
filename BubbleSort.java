//David Rosales drosales30@toromail.csudh.edu

import java.io.IOException;

public class BubbleSort 
{
	private BubbleSort[] bs;
	private int size;
	private int [] numArray;
	private int count = 0;
	
	public BubbleSort(int[] bs, int size) throws IOException
	{
		
		this.size = size;
		setNumArray(bs);
		
		NumberFileWriter writeFile = new NumberFileWriter(sortAsc(), "ascOutput.txt");
		System.out.println(count + " cycles for ascending order.");
		this.count = 0;
		
		NumberFileWriter writeFile2 = new NumberFileWriter(sortDsc(), "dscOutput.txt");
		System.out.println(count + " cycles for descending order.");
	}
	
	public BubbleSort(int size)
	{
		setSize(size);
		numArray = new int[] {1,4,6,2,54,32,67};
	}
	
	public int[] sortAsc()
	{
		boolean sorted = false;
		
		int store;
		do
		{
			sorted = false;
			for(int i = 0; i < numArray.length - 1; i++)
			{
				if(numArray[i] > numArray[i+1])
				{
					count++;
					store = numArray[i+1];
					numArray[i+1] = numArray[i];
					numArray[i] = store;
					sorted = true;
				}
			}
		}while(sorted == true);
		return numArray;
	}
	
	public int[] sortDsc()
	{
		boolean sorted = false;
		
		int store;
		do
		{
			sorted = false;
			for(int i = 0; i < numArray.length - 1; i++)
			{
				if(numArray[i] < numArray[i+1])
				{
					count++;
					store = numArray[i];
					numArray[i] = numArray[i+1];
					numArray[i+1] = store;
					sorted = true;
				}
			}
		}while(sorted == true);
		return numArray;
	}
	
	public int loopCycles()
	{
		return count;
	}

	public int getSize() 
	{
		return size;
	}

	public void setSize(int size) 
	{
		this.size = size;
	}

	public int[] getNumArray() {
		return numArray;
	}

	public void setNumArray(int[] numArray) {
		this.numArray = numArray;
	}
}
