package sec02.exam07;

public class WhileSumForm1To100Example {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i<=100) {
			sum +=i;
			i++;
		}
		System.out.println("1~" + (i-1) + "гу: " + sum);

	}

}
