package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		//Car Ŭ���� �ڷ���
		//myCar : ��ü , Ŭ���� ���� �� �ν��Ͻ�
		//new Car() : ������ �ʵ尪�� �ʱ�ȭ
		
		//�ʵ� �� �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.mode1);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
	
		myCar.speed=60;
		
		System.out.println("����ӵ�: " + myCar.speed);

	}

}
