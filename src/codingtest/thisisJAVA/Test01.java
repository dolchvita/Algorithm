package codingtest.thisisJAVA;

public class Test01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
				if(k==i) {
					System.out.println();					
				}
			}
		}
	}
}
