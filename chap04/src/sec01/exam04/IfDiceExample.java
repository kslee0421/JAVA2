package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
				//Math.random() : 0.23456~5.54456789 (0이 안나오게 하기위해 +1)
				//1부터 50까지의 난수 : int(Math.random()*49)+1; 원하는 숫자범위에서 하나 적게!
				int num = (int)(Math.random()*6) + 1;
				
				if (num==1) {
					System.out.println("1번이 나왔습니다.");
				} else if(num==2) {
					System.out.println("2번이 나왔습니다.");
				} else if(num==3) {
					System.out.println("3번이 나왔습니다.");
				} else if(num==4) {
					System.out.println("4번이 나왔습니다.");
				} else if(num==5) {
					System.out.println("5번이 나왔습니다.");
				} else {
					System.out.println("6번이 나왔습니다.");
				}

	}

}
