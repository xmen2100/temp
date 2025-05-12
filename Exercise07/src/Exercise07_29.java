public class Exercise07_29 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        int sum;
        int pick = 0;
        do {
            System.out.println("Shuffling deck...");
            for (int i = 0; i < deck.length; i++) {
                int j = (int)(Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[j];
                deck[j] = temp;
            }

            String card1 = ranks[deck[0] % 13];
            String card2 = ranks[deck[1] % 13];
            String card3 = ranks[deck[2] % 13];
            String card4 = ranks[deck[3] % 13];

            System.out.println("You picked " + (card1.equals("Ace") || card1.equals("8") ? "an " : "a ") + card1
                    + ", " + (card2.equals("Ace") || card2.equals("8") ? "an " : "a ") + card2
                    + ", " + (card3.equals("Ace") || card3.equals("8") ? "an " : "a ") + card3
                    + ", and " + (card4.equals("Ace") || card4.equals("8") ? "an " : "a ") + card4);

            int valueOfCard1 = deck[0] % 13 + 1;
            int valueOfCard2 = deck[1] % 13 + 1;
            int valueOfCard3 = deck[2] % 13 + 1;
            int valueOfCard4 = deck[3] % 13 + 1;
            sum = valueOfCard1 + valueOfCard2 + valueOfCard3 + valueOfCard4;
            System.out.println("The sum of the cards is " + sum);
            pick++;
            System.out.println();
        } while (sum != 24);

        System.out.print("The number of picks that yields the sum of 24 is " + pick);
    }
}
