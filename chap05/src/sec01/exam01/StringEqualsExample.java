package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�̰漱";
		String strVar2 = "�̰漱";

		if (strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar1�� ������ ����");
		}

		 if(strVar1.equals(strVar2)) { System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		 }
		 

		String strVar3 = new String("�̰漱");
		String strVar4 = new String("�̰漱");

		if (strVar3 == strVar4) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar1�� ������ ����");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
	}

}
