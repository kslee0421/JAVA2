package sec05.exam04;

public class Singleton {
	//���� �ʵ�(��ü ������ ���ؼ� ������ ...)
		private static Singleton singleton= new Singleton();  //�ʵ��� 
		
		//������
		private Singleton() {}

		//���� �޼ҵ�
		static Singleton getInstance() {
			return singleton;
		} 
}
