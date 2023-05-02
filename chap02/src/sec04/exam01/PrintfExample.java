package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		//%d int값을 부호있는 10진수로 출력 \n  줄바꿈
		System.out.printf("상품의 가격:%6d원\n", value);
		//%6d 6:6자리 띄어쓰기 오른쪽부터 작성
		System.out.printf("상품의 가격:%-6d원\n", value);
		//%6d 6:6자리 띄어쓰기 왼쪽부터 작성
		System.out.printf("상품의 가격:%06d원\n", value);
		//%6d 6:6자리 0 : 빈자리를 0으로채우기 띄어쓰기 오른쪽부터 작성
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:&10.2f\n", 10, area);
		// 10을 앞에, area를 뒤에
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		//-10 왼쪽정렬 10만큼 띄어쓰기 s : string 문자열
	}

}
