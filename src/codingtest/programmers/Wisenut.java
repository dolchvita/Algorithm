package codingtest.programmers;

import java.util.Arrays;

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
