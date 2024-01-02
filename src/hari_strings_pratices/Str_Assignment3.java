package hari_strings_pratices;
public class Str_Assignment3 
{
	public static void main(String[] args)
	{
		String str="RangeRover";
		char c1='R';
		char c2='r';
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c1 || str.charAt(i)==c2) {
				count++;
			}
		}
		System.out.println("Count of R in "+str+" is : "+count);
	}
}
