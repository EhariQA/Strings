package hari_strings_pratices;
public class Arrays_Demo 
{
	public static void main(String[] args)
	{
		int arr1[]= {10,30,50,35};
		int arr2[]=new int[5]; // [0,0,0,0,0]
//		System.out.println(arr1[3]);
//		System.out.println(arr2[4]);
		arr1[3]=40;
//		System.out.println(arr1[3]);
		arr2[0]=5;
		arr2[1]=15;
		arr2[2]=25;
		arr2[3]=30;
		arr2[4]=45;
		for(int i=arr2.length-1; i>=0; i--) 
		{
			if(arr2[i]%10==0)
			{
				System.out.println(arr2[i]);
			}
		}
	}
}
