package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------------------");
		x++;
		++x;
		System.out.println("[����1]");
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		System.out.println("--------------------------------");
		y++;
		++y;
		System.out.println("[����2]");
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("--------------------------------");
		z = x++; //��������
		System.out.println("[����3]");
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("--------------------------------");
		z = ++x; 
		System.out.println("[����4]");
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("--------------------------------");
		z = ++x + y++; 
		System.out.println("[����5]");
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
