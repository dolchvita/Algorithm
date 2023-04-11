package codingtest.thisisJAVA;

//이것이 자바다 5장 8번 문제  -- 완벽 정답!
public class Test07 {

	public static void main(String[] args) {
		int sum=0;
		double avg=0.0;
		int count=0;
		int[][] array= {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		for(int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum+=array[i][k];
				count++;
			}
		}
		avg=(double)sum/count;
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
