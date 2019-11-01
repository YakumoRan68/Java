import java.util.Scanner;

public class ch3_p8 {
    static String[] role = {"rock", "scissor", "paper"};
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Game with computer...");
        do {
            System.out.print("rock, scissor, paper! ");
            input = scanner.next();
            int my = -1;
            
            if (input.equals("stop")) {
                System.out.println("Quit the game.");
                break;
            }

            for(int i = 0; i < role.length; i++) {
                if (role[i].equals(input)) {
                    my = i;
                    break;
                }
            }

            if (my == -1) {
                System.out.println("Wrong Input.");
                continue;
            }

            
            int com = (int)(Math.random() * 3);
            String str = "User = " + role[my] + ", Computer = " + role[com] + ", ";
            if (my == com) str += "Draw!";
            else str += (my + 1) % 3 == com ? "win!" : "lose!";

            System.out.println(str);
        } while(true);

        scanner.close();
	}
}
