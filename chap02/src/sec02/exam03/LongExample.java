package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 100000000; //컴파일에러 1조 
		// 21억이 넘으면  long으로 써야한다(int범위 :-2,147,483,648 ~ 2,147,483,647 )
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
