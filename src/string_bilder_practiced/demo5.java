package string_bilder_practiced;

public class demo5
{

	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer(); // it is mutable. 
		System.out.println(sb.capacity()); // initial capacity of StringBuffer is 16.
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("Hari Krishna Venkatesh");
		System.out.println(sb.length());
		System.out.println(sb.capacity()); // if StringBuffer length is more than current capacity then the capacity will increase to "(Capacity*2)+2"
		System.out.println(sb.charAt(2));
		System.out.println(sb.indexOf("k"));
		System.out.println(sb.indexOf("r", 3));
		System.out.println(sb.isEmpty());
		System.out.println(sb.substring(2, 7));
		System.out.println(sb.substring(7));
		System.out.println(sb);
		sb.replace(2,7, "Roses");
		System.out.println(sb);
		sb.delete(2, 7);
		System.out.println(sb);
		sb.insert(2, "ri Kr");
		System.out.println(sb);
	}

}
