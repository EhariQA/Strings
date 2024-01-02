package hari_strings_pratices;

public class Str_assigment2 
{

	public static void main(String[] args)
	{
		String str="iam not a good boy";
		int count=0;
		for(int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i)==' ') 
			{
				count++;
			}
		}
		count=count+1;
		System.out.println("Total No of Words in the given sentence is "+count);
	}
}


