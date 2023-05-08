package sec02.exam05;

public class ForMultiplicationTableExample2 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for ( i=2; i<=9; i++) {
			System.out.print("**"+i+"´Ü**\t");			
		} 
			System.out.println("");
		for (i=1; i<=9; i++) {
				for(j=2; j<=9; j++) {
					System.out.print(j + "x" + i +"="+ (j*i)+"\t");		
				}
				System.out.println("");
		}
	}

}
