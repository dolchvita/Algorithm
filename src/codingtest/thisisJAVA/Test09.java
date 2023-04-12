package codingtest.thisisJAVA;


// 와이즈넛 사전 테스트 문제 3번
public class Test09 {

	public int[] solution(int n) {
		int[] answer=new int[n];
		
		for(int i=1; i<=n; i++) {
			answer[i-1]=i;
		}
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Test09 test9=new Test09();
		System.out.println(test9.solution(5));
	}

}
