package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
				//Math.random() : 0.23456~5.54456789 (0�� �ȳ����� �ϱ����� +1)
				//1���� 50������ ���� : int(Math.random()*49)+1; ���ϴ� ���ڹ������� �ϳ� ����!
				int num = (int)(Math.random()*6) + 1;
				
				if (num==1) {
					System.out.println("1���� ���Խ��ϴ�.");
				} else if(num==2) {
					System.out.println("2���� ���Խ��ϴ�.");
				} else if(num==3) {
					System.out.println("3���� ���Խ��ϴ�.");
				} else if(num==4) {
					System.out.println("4���� ���Խ��ϴ�.");
				} else if(num==5) {
					System.out.println("5���� ���Խ��ϴ�.");
				} else {
					System.out.println("6���� ���Խ��ϴ�.");
				}

	}

}
