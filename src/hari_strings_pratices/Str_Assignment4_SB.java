package hari_strings_pratices;

import java.util.StringTokenizer;

public class Str_Assignment4_SB 
{
	public static void main(String[] args) 
	{
		String str="I love Cars";
		String revWords="";
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()) 
		{
			String str1=st.nextToken();
			String rev="";
			for(int i=str1.length()-1; i>=0; i--) 
			{
				rev=rev+str1.charAt(i);
			}
			revWords=revWords+rev+" ";
		}
		System.out.println(revWords);
	}
}
