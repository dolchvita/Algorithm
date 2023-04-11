package codingtest.thisisJAVA;

//이것이 자바다 5장 9번 문제
public class Test08 {

	public static void main(String[] args) {
		// 입력값 
		int student=10;
		int[] score= {95, 86, 83, 92, 96, 78, 83, 93, 87, 88};
		// 반환값 
		int sum=0;
		double avg=0.0;
		
		for(int i=0; i<student; i++){
			sum+=score[i];
		}
		avg=(double)sum/student;
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
