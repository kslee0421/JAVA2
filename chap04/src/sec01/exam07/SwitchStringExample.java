package sec01.exam07;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position ="부장";
		
		switch(position){
			case "부장":
				System.out.println("2000만원");
				break;
			case "과장":
				System.out.println("1000만원");
				break;
			default:
				System.out.println("800만원");
		}
	}

}
