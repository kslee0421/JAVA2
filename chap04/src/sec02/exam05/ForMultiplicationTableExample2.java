package sec02.exam05;

public class ForMultiplicationTableExample2 {

	public static void main(String[] args) {

		for ( int i=2; i<10; i++) {
			System.out.print("**"+i+"��**\t");			
		} 
			System.out.println("");
		for ( int i=1; i<10; i++) {
				for(int j=2; j<10; j++) {
					System.out.print(j + "x" + i +"="+ (j*i)+"\t");		
				}
				System.out.println("");
		}
	}

}
