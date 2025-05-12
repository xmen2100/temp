import java.util.Scanner;

public class Exercise05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerWin = 0;
        int userWin = 0;
        int draw = 0;

        // while both are less than the other +2
        // only break out of loop when one is no longer less than the other +2 ex: userWin == computerWin +2
        while ((userWin < computerWin + 2) && (computerWin < userWin + 2)) {
            int computerPick = (int)(Math.random() * 3);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int userPick = input.nextInt();

            switch (computerPick) {
                case 0 :
                    System.out.println("The computer is scissor. ");
                    if (userPick == computerPick) {
                        System.out.println("You are scissor too. It is a draw.");
                        draw++;
                    }
                    else if (userPick == 1) {
                        System.out.println("You are rock. You won");
                        userWin++;
                    }
                    else {
                        System.out.println("You are paper. You lost");
                        computerWin++;
                    } break;
                case 1 :
                    System.out.println("The computer is rock. ");
                    if (userPick == computerPick) {
                        System.out.println("You are rock too. It is a draw.");
                        draw++;
                    }
                    else if (userPick == 2) {
                        System.out.println("You are paper. You won");
                        userWin++;
                    }
                    else {
                        System.out.println("You are scissor. You lost");
                        computerWin++;
                    } break;
                case 2 :
                    System.out.println("The computer is paper. ");
                    if (userPick == computerPick) {
                        System.out.println("You are paper too. It is a draw.");
                        draw++;
                    }
                    else if (userPick == 0) {
                        System.out.println("You are scissor. You won");
                        userWin++;
                    }
                    else {
                        System.out.println("You are rock. You lost");
                        computerWin++;
                    } break;
            }
        }
        if (computerWin == userWin + 2) {
            System.out.println("\nThe computer won two more times than you");
        }
        else {
            System.out.println("\nYou won two more times than the computer");
        }

        System.out.print("Computer Score: " + computerWin + "    User Score: " + userWin + "    Draw: " + draw);

        input.close();
    }
}
