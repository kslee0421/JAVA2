package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71 ,84, 93 ,87 };
		int sum = 0;
		for(int aaa : scores) {
			sum = sum + aaa;
		}
		System.out.println("����: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("�������  = " + avg);

	}

}
