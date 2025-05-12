public class Exercise05_40 {
    public static void main(String[] args) {
        int numberOfHeads = 0;
        int numberOfTails = 0;

        for (int i = 1; i <= 1000000; i++) { // start at 1 go until and including 1 mil
            if ((int)(Math.random() * 2) == 0) { // random number of either 0 or 1
                numberOfHeads++; // 0 is heads, increment heads
            }
            else {
                numberOfTails++; // 1 is tails, increment tails
            }
        }
        System.out.println("The number of heads is: " + numberOfHeads);
        System.out.println("The number of tails is: " + numberOfTails);
    }
}
