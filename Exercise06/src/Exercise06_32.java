public class Exercise06_32 {
    static int wins = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int die1 = (int) (1 + Math.random() * 6); // die1 6 faces
            int die2 = (int) (1 + Math.random() * 6); // die2 6 faces
            int sumOfDice = die1 + die2; // sum of dice

            firstRoll(die1, die2, sumOfDice);
        }
        System.out.print("\nYou won " + wins + " times");
    }

    public static void firstRoll(int die1, int die2, int sumOfDice) {
        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sumOfDice);
        switch (sumOfDice) {
            case 2, 3, 12 : System.out.println("You lose"); break;
            case 7, 11 : System.out.println("You win"); numberOfWins(); break;
            case 4, 5, 6, 8, 9, 10 : System.out.println("point is " + sumOfDice);
                subsequentRolls(sumOfDice);
        }
    }

    public static void subsequentRolls(int point) {
        int sumOfDice;
        do {
            int die1 = (int) (1 + Math.random() * 6);
            int die2 = (int) (1 + Math.random() * 6);
            sumOfDice = die1 + die2;

            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sumOfDice);
        } while (sumOfDice != point && sumOfDice != 7);

        if (sumOfDice == 7) {
            System.out.println("You lose");
        }
        else {
            System.out.println("You win"); numberOfWins();
        }
    }

    public static void numberOfWins() {
        wins++;
    }
}
