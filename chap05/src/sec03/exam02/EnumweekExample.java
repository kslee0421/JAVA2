package sec03.exam02;

public class EnumweekExample {

	public static void main(String[] args) {
		//main Ʈ���� ������ �ϴ� ������
				Week today = null;
				//null �ʱ�ȭ
				
				Calendar cal = Calendar.getInstance();
				int week = cal.get(Calendar.DAY_OF_WEEK);
				//cal�� ������ �����Ͽ��ú��� ����̵��´�.
				//���� DAY_OF_WEEK �� ���������� �̰ڴ�.
				//������ ���ڷ� �޴´�.
				//������� �빮��
				//week =week +2;
				switch(week) {
				case 1:
					today = Week.SUNDAY; break;
				case 2:
					today = Week.MONDAY; break;
				case 3:
					today = Week.TUESDAY; break;
				case 4:
					today = Week.WEDSDAY; break;
				case 5:
					today = Week.THURSDAY; break;
				case 6:
					today = Week.FRIDAY; break;
				case 7:
					today = Week.SATURDAY; break;
				}
				System.out.println("���� ����: " + today);
				
				if(today == Week.SUNDAY) {
					System.out.println("�Ͽ��Ͽ��� ��ó�� ���θ� �մϴ�.");			
				}else if(today == Week.MONDAY) {
					System.out.println("�������� ���ۿ�.");
				}else if(today == Week.TUESDAY) {
					System.out.println("ȭ������ ȭ����.");
				}
				else if(today == Week.WEDSDAY) {
					System.out.println("���� ���� �������");
				}
				else if(today == Week.THURSDAY) {
					System.out.println("������ �ұ��̿���");
				}
				else if(today == Week.FRIDAY) {
					System.out.println("�ƽ� ���� �ָ��̿���");
				}
				else{
					System.out.println("���Ͽ� ������ ���θ� �غ��ô�");
				}

	}

}
