package sec02.exam01;

public class SignOperationExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; //-100
		int result2 = -x;//100
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
		//byte result3 = -b; //������ ����
		int result3 = -b; // �ѹ��� ����ִ°ǵ�����. �ι�°�� �������� int�� �ڵ��ٲ��.
		System.out.println("result3=" + result3);
	}

}
