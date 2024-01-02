package hari_strings_pratices;
public class Str_Assignment4 
{
	public static void main(String[] args) 
	{
		String str="I love Cars";
		String revWords="";
		str=str+" ";
		int temp=0;
		int space=0;
		for(int i=0; i<str.length(); i++) {
			String rev="";
			
			if(str.charAt(i)==' ') {
				String str1=str.substring(temp, i);
				for(int j=str1.length()-1; j>=0; j--) {
					rev=rev+str1.charAt(j);
				}
				temp=i;
				
				if(i!=str.length()-1 && space<1) {
					rev=rev+" ";
					space++;
				}
				System.out.println(rev);
			}
			revWords=revWords+rev;
		}
		System.out.println(revWords);
	}
}
