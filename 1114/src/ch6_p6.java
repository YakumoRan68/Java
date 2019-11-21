import java.util.Scanner;

public class ch6_p6 {
	static String[] role = {"바위", "가위", "보"};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int my;
		
		do {
			System.out.println("바위(1), 가위(2), 보(3), 끝내기(4)");
			my = scanner.nextInt() - 1;
			if(my == 3) break;
			
			int com = (int)(Math.random() * 3);
			
            String str = "사용자 " + role[my] + " : 컴퓨터 " + role[com] + "\n사용자가 ";
            if (my == com) str += "비겼";
            else str += (my + 1) % 3 == com ? "이겼" : "졌";
            str += "습니다.";
            
            System.out.println(str);
            
		} while(true);
		scanner.close();
		System.out.print("게임을 종료합니다...");
	}
}
