package codingtest.programmers;

import java.util.Arrays;

/* 유저 시간이 배열로 주어질 때, 정수 T만큼 사용시간을 나눈 후
 	남은 시간들을 비교하여 가장 최댓값을 반환한다. */
public class Wisenut {

	public int solution(int[] user_times, int T) {
		int[] remains=new int[user_times.length];
		
		for(int i=0; i<user_times.length; i++) {
			int m=(user_times[i]/T)+1;
			int remain=m*T-user_times[i];
			
			remains[i]=remain;
		}		

		Arrays.sort(remains);
		return remains[remains.length-1];
	}
	
	
	public static void main(String[] args) {
		Wisenut test=new Wisenut();
		int[] user_times= {20,40,65,110};
		
		System.out.println(test.solution(user_times, 30));
	}

}
