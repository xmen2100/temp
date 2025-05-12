public class Exercise07_24 {
    public static void main(String[] args) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        String[] fourCards = new String[4];

        int pick = 0;
        do {
            int card = (int)(Math.random() * 52);
            String rank = ranks[card % 13];
            String suit = suits[card / 13];

            if (fourCards[card / 13] == null) {
                fourCards[card / 13] = rank + " of " + suit;
            }

            pick++;

        } while (!fullSuit(fourCards));

        for (String card : fourCards) {
            System.out.println(card);
        }
        System.out.print("Number of picks: " + pick);
    }

    public static boolean fullSuit(String[] fourCards) {
        for (String card : fourCards) {
            if (card == null) {
                return false;
            }
        }
        return true;
    }
}
