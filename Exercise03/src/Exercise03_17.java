import java.util.Scanner;

public class Exercise03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int userPick = input.nextInt();

        int computerPick = (int)(Math.random() * 3);

        switch (computerPick) {
            case 0 : System.out.print("The computer is scissor. " + (userPick == computerPick ? "You are scissor too. It is a draw." : 
            (userPick == 1 ? "You are rock. You won" : "You are paper. You lost"))); break;
            case 1 : System.out.print("The computer is rock. " + (userPick == computerPick ? "You are rock too. It is a draw." : 
            (userPick == 2 ? "You are paper. You won" : "You are scissor. You lost"))); break;
            case 2 : System.out.print("The computer is paper. " + (userPick == computerPick ? "You are paper too. It is a draw." : 
            (userPick == 0 ? "You are scissor. You won" : "You are rock. You lost"))); break;
        }

        input.close();
    }
}
