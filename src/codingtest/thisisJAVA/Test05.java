package codingtest.thisisJAVA;

// 이것이 자바다 4장 5번문제
public class Test05 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			for(int k=1; k<=10; k++) {
				
				if((4*i+5*k)==60) {
					System.out.println("("+i+", "+k+")");
				}
				
			}
		}
	}
	
	
	/* 풀이!
	 * 1) 두 수가 일정 범위 내에서 증가한다
	 * 		--> 이중 for 문의 i와 k
	 * 2) 답을 요구하는 식이 있다
	 * 		--> if문의 조건
	 * 
	 * */
}
