import java.util.Scanner;

public class ch6_b3 {
    public static String getUnicodeAt(final String str, final int CharAt) {
        return str;
    }

    public static void main(final String[] args) {
        System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
        final Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.");
        while(true) {
            final String key = scanner.nextLine();
            if (key.equals("")) {
                text = text.substring(1) + text.substring(0, 1);
                System.out.println(text + " >>");
                
            } else if(key.equals("q")) {
                break;
            } else System.out.print(text + ">>");
        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}
