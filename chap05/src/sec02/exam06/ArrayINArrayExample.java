package sec02.exam06;

public class ArrayINArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int [2][3];
		for (int i =0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++ ) {
				System.out.println("mathScores["+ i +"]["+k+"]="+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int [2][];
		englishScores[0] = new int [2];
		englishScores[1] = new int [3];
		for (int i =0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++ ) {
				System.out.println("englishScores["+ i +"]["+k+"]="+englishScores[i][k]);
			}
		}
		System.out.println(englishScores[0].length);
		System.out.println(englishScores[1].length);
		System.out.println(englishScores.length);
		
		// 1���� 2��° �濡 50�� �־��
		englishScores[2][1] = 50;
		System.out.println(englishScores[0][1]);

	}

}
