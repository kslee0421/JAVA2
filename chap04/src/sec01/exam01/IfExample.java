package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 80;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		}
		
		if(score<90) 
			System.out.println("점수가 90보다 작습니다");
		
		System.out.println("등급은 B 입니다.");
		
		//중괄호를 안치면!!!??!?! 조건없이 무조건 뜬다 if문 바로아래는 그냥뜬다.
	}

	}

