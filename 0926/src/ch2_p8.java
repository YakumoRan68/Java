import java.util.Scanner;

public class ch2_p8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("커피 주문하세요 : ");
		String a = scanner.next();	
		int price = 1;
		switch(a) {
			case "에스프레소" : price = 2000; break;
			case "아메리카노" : price = 2500; break;
			case "카푸치노" : price = 3000; break;
			case "카페라떼" : price = 3500; break;
			default : System.out.println("잘못된 입력");
		}
		System.out.println(price * scanner.nextInt() + "원입니다");
		scanner.close();
	}
}
