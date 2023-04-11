package codingtest.thisisJAVA;

public class Test3_2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=5; k++) {
				if(k==5) {
					System.out.print("$");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
