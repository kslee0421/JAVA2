package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		System.out.println(v3);
		
		double v4 =0.1;
		float v5 = 0.1f;
		//float �Ҽ������� ������ �ִ� 0.10000000149011612... ��Ȯ�� 0.1�� �ƴ� ������ ������ ����
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true

	}

}
