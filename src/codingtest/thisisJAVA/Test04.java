package codingtest.thisisJAVA;

// 이것이 자바다 4장 4번문제
public class Test04 {
	
	public static void main(String[] args) {

		//1~6까지 랜덤
		while(true) {
			int n1=(int)(Math.random()*6)+1;		// 랜덤으로 나오는 두 수를 지정
			int n2=(int)(Math.random()*6)+1;
			
			System.out.println("("+n1+", "+n2+")");
			
			// 무한루프 돌다가 합이 5이면 멈추기
			if((n1+n2)==5)break;
		}

	}
}
