package hari_strings_pratices;

public class Str_assigment
{
	public static void main(String[] args)
	{
		String str="String";
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}