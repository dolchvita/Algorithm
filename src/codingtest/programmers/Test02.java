package codingtest.programmers;

// 코테 입문) 피자 나눠먹기(3)
public class Test02 {

	public static void main(String[] args) {
		// 입력값 
		int slice=7;
		int n=10;
		int answer=0;
/*
		int answer=n/slice;
		int remain=n%slice;
		if(remain>0) {answer++;}
*/		
		answer=((n%slice)>0)? n/slice+1 : n/slice;
		
		// 출력값 
		System.out.println(answer);
	}

}
