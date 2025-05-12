public class Exercise05_43 {
    public static void main(String[] args) {
        int numberOfCombinations = 0;

        for (int i = 1; i < 7; i++) { // i ends at 6 bc j is 7
            for (int j = i + 1; j <= 7; j++) { // j start from i+1 go up to 7 for each i
                if (j != i) {
                    System.out.println(i + " " + j);
                    numberOfCombinations++;
                }
            }
        }
        System.out.print("The total number of combinations is " + numberOfCombinations);
    }
}
