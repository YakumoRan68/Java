import java.util.Scanner;

public class ch4_p4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num = scanner.nextInt();
		Phone[] PhoneManager = new Phone[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력) : ");
			PhoneManager[i] = new Phone(scanner.next(), scanner.next());
		}
		System.out.println("저장되었습니다...");
		
		String name;
		do {
			System.out.print("검색할 이름 : ");
			name = scanner.next();
			if (name.equals("exit")) break;
			
			Boolean HasFound = false;
			for(Phone inst : PhoneManager) {
				if (inst.getName().equals(name)) {
					System.out.println(inst.getName() + "님의 전화번호는 " + inst.getTel() + "입니다.");
					HasFound = true;
					break;
				}
			}
			if (!HasFound) System.out.println(name + "님이 없습니다.");
		} while(!name.equals("exit"));
		
		System.out.print("프로그램을 종료합니다.");
		scanner.close();
	}
}
