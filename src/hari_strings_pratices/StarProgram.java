package hari_strings_pratices;
public class StarProgram {
	public static void main(String[] args) {
		int k=1;
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(j<=i) {
					if(k<10) {
						System.out.print("0");
					}
					System.out.print(k++ +" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
