package hari_strings_pratices;
public class Strings_pratices 
{
	public static void main(String[] args) 
	{
		String str="Hari@Krishna";
		String str2="hari@krishna";
		
		// CharAt method usage
		System.out.println("3rd Character in str-"+str.charAt(3));
		System.out.println("Substring of str from 0 index to 4th index-"+str.substring(0,4));
		System.out.println("should it contains m letter?-"+str.contains("m"));
		System.out.println("does it starts with letter H?-"+str.startsWith("H"));
		System.out.println("does it ends with string shna?-"+str.endsWith("shna"));
		System.out.println("Is the Str2 contains no value or no string?-"+str2.isEmpty());
		System.out.println("adding two strings-"+str.concat(str2));
		System.out.println("Length of Str is -"+str.length());
		System.out.println("Last index of str is : "+str.lastIndexOf('a'));
		System.out.println("Fist index of str is : "+str.indexOf('a'));
		System.out.println("Small letters of str is : "+str.toLowerCase());
		System.out.println("Capital letter of str is : "+str.toUpperCase());
		System.out.println("Two strings are equal or not with case checking? "+str.equals(str2));
		System.out.println("Two strings are equal or not without case checking? "+str.equalsIgnoreCase(str2));
		System.out.println("Replaces the all characters with the new Character "+str.replace('a', 'b'));
		System.out.println("Replaces only first String or character with new String or Character "+str.replaceFirst("a", "b"));
		System.out.println("Repalces all the Strings with the new String "+str.replaceAll("Hari", "Naga"));
	}

}
