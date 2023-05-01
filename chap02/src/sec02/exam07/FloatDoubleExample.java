package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//float 이 기본 
		//실수값 저장
		//float var1 = 3.14; //컴파일 에러(Type mismatch) f를 붙여야 함
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트

		float var4 = 0.1234567890123456789f;  //9자리
		double var5 = 0.1234567890123456789; //18자리

		System.out.println("var2: " + var2 );
		System.out.println("var3: " + var3 );
		System.out.println("var4: " + var4 );
		System.out.println("var5: " + var5 );
		
		//e 사용하기 //지수
		
		double var6 = 3e6; //300000.0
		float var7 = 3e6F; //300000.0
		double var8 = 2e-3; //0.002
		
		System.out.println("var6: " + var6 );
		System.out.println("var7: " + var7 );
		System.out.println("var8: " + var8 );
	
	}

}
