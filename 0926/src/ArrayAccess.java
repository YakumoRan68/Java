import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Arr[] = new int[5];
		int max = 0;
		System.out.println("양수 5개를 입력하세요");
		
		//for(int i = 0; i < Arr.length; i++) {
		for(int i : Arr) { // 배열공간이 할당 돼있으면 foreach 사용 가능
			Arr[i] = scanner.nextInt();
			if (Arr[i] > max) max = Arr[i];
		}
		scanner.close();
		
		System.out.print("가장 큰 수는 : " + max + "\n");
		
		String f[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		for(String str : f) System.out.println(str);
	}

}