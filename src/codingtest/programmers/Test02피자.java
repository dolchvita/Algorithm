package codingtest.programmers;

// 코테 입문) 피자 나눠먹기(3)
public class Test02피자 {

	public static void main(String[] args) {
		// 입력값 
		int slice=7;
		int n=10;
		int answer=0;

		answer=((n%slice)>0)? n/slice+1 : n/slice;
		
		// 출력값 
		System.out.println(answer);
	}

}
